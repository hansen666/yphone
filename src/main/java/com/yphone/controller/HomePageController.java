package com.yphone.controller;

import com.alibaba.fastjson.JSONObject;
import com.yphone.model.nochange.PhoneInfo;
import com.yphone.service.HomeService;
import com.yphone.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomePageController {
    @Autowired
    private HomeService homeService;
    @Autowired
    private PhoneService phoneService;



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
        return model;
    }

    //点击购买商品函数
    @RequestMapping(value = "/pruchase",method = RequestMethod.GET)
    public void purchase(HttpServletRequest request){
        HttpSession session=request.getSession();
        String userName=(String)session.getAttribute("userName");
        if(userName==null) {  //如果没有登录，则返回null
            return;
        }
        //如果已经登录
        String OrderID=phoneService.generalOrderNum(request);



    }




}
