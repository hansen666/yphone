package com.yphone.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yphone.mappers.UserInfoMapper;
import com.yphone.model.nochange.AddressUsed;
import com.yphone.model.nochange.Order;
import com.yphone.model.nochange.PhoneInfo;
import com.yphone.service.HomeService;
import com.yphone.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class HomePageController {
    @Autowired
    private HomeService homeService;
    @Autowired
    private PhoneService phoneService;

    @Autowired
    UserInfoMapper userInfoMapper;



    //返回所有商品的JSON格式
    @RequestMapping(value = "/phoneList",method = RequestMethod.GET )
    public void getPhoneList(HttpServletResponse response){
           List<String> types=homeService.getType();
           JSONObject json=homeService.getJsonByType(types);
           try {
               MainController.jsonToResponse(json, response);
           }catch (IOException e){
               e.printStackTrace();
           }
    }

    //返回一个phone_info
    @RequestMapping(value="/phone_detail",method =RequestMethod.GET)
    public ModelAndView phoneDetail(HttpServletRequest request){
        ModelAndView model=new ModelAndView("phone_detail");
        String phoneID=request.getParameter("pid");
        PhoneInfo phone_info=homeService.getPhoneByID(Long.valueOf(phoneID));
        model.addObject("phone_info",phone_info);
        model.addObject("pid",phoneID);
        return model;
    }




    //购买商品函数
    @RequestMapping(value = "/purchase",method = RequestMethod.GET)
    public ModelAndView purchase(HttpServletRequest request){
        String phoneID=request.getParameter("phoneID");
        String num=request.getParameter("num");
        //如果没有登录
        if(request.getSession().getAttribute("userName")==""||request.getSession().getAttribute("userName")==null){
            ModelAndView model=new ModelAndView("login");
            String url=String.valueOf(request.getRequestURL());
            HttpSession session=request.getSession();
            session.setAttribute("phoneID",phoneID);
            session.setAttribute("num",num);
            model.addObject("backurl",url);
            return model;
        }else {
            ModelAndView model=new ModelAndView("confirm_order");
            PhoneInfo phoneInfo=homeService.getPhoneByID(Long.valueOf(phoneID));
            model.addObject("phoneID",phoneID);
            model.addObject("num",num);
            model.addObject("phoneInfo",phoneInfo);
            return model;
        }
    }

    //确认订单函数
    @RequestMapping(value = "/confirm_order",method = RequestMethod.GET)
    public void confirm_order(@ModelAttribute Order order, HttpServletRequest request){
        String orderID=phoneService.generalOrderNum(request);
        order.setOrderId(orderID);//订单号;

    }

    //选择地址函数
    @RequestMapping(value = "/addressInfo",method = RequestMethod.GET)
    public void address(HttpServletRequest request,HttpServletResponse response){
         int id=Integer.valueOf(request.getParameter("aid"));
        Map<String,String> addressMap=phoneService.getAddressMap(id);
        JSONObject json=JSONObject.parseObject(JSON.toJSONString(addressMap));

        try {
            MainController.jsonToResponse(json, response);
        }catch (IOException e){
            e.printStackTrace();
        }


    }

    @RequestMapping(value = "/saveAddress",method = RequestMethod.POST)
    public void  saveAddress(@ModelAttribute AddressUsed addressUsed, HttpServletRequest request,HttpServletResponse response)throws IOException{
        HttpSession session=request.getSession();
        String username=(String)session.getAttribute("userName");
        long userID=userInfoMapper.getUserIDByUsername(username);
        addressUsed.setUserId(userID);
        phoneService.saveAddress(addressUsed);
        String s=JSON.toJSONString(addressUsed);
        JSONObject json=JSONObject.parseObject(s);
        MainController.jsonToResponse(json,response);
    }

    @RequestMapping(value = "/showAddress",method = RequestMethod.GET)
    public void showAddress(HttpServletRequest request,HttpServletResponse response)throws IOException{
        HttpSession session=request.getSession();
        String username=(String)session.getAttribute("userName");
        long userID=userInfoMapper.getUserIDByUsername(username);
        List<AddressUsed> addressUseds=phoneService.getAddressUsed(userID);
        String jsonStr=JSON.toJSONString(addressUseds);
        //JSONObject json=JSONObject.parseObject(jsonStr);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        Writer writer=null;
        try {
            writer=response.getWriter();
            writer.write(jsonStr);
           // MainController.jsonToResponse(json, response);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(writer!=null){
                writer.flush();
                writer.close();
            }
        }

    }




    //省份
    public void provinces(){
        List<String> provinces=phoneService.getProvinces();
    }

    //城市
    public void cities(HttpServletRequest request){
        String province=request.getParameter("province");
        List<String> cities=phoneService.getCities(province);
    }

    //县
    public void counties(HttpServletRequest requrst){
        String city=requrst.getParameter("city");
        List<String> counties=phoneService.getCounties(city);
    }





}
