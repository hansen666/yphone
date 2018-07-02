package com.yphone.controller;

import com.alibaba.fastjson.JSONObject;
import com.yphone.model.nochange.PhoneInfo;
import com.yphone.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomePageController {
    @Autowired
    private HomeService homeService;



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

    //返回一个phone
    @RequestMapping(value="/phoneDetail",method =RequestMethod.GET)
    public ModelAndView phoneDetail(HttpServletRequest request){
        ModelAndView model=new ModelAndView("phoneDetail");
        String phoneID=request.getParameter("phoneID");
        PhoneInfo phone=homeService.getPhoneByID(Long.valueOf(phoneID));
        model.addObject("phone",phone);
        return model;
    }



}
