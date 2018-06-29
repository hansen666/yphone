package com.yphone.controller;

import com.alibaba.fastjson.JSONObject;
import com.yphone.model.nochange.UserInfo;
import com.yphone.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by chenhansen on 2018/5/21.
 */
@Controller

@RequestMapping("/")

public class MainController {

    @Autowired
    private LoginService loginService;




    @RequestMapping(value = "/loginProcess",method = RequestMethod.POST)
    public void loginProcess(HttpServletRequest request, HttpServletResponse response)throws IOException{
        //TODO 用户登录，返回数字用字符串形式，如“1”；


//        String username=request.getParameter("userID");
//        String password=request.getParameter("password");
//        Writer writer=null;
//        response.setCharacterEncoding("UTF-8");
//        writer=response.getWriter();
//
//        if(username.equals("hansen")&&password.equals("123456"))
//            writer.write("1");
//        else if(username.equals("admin")&&password.equals("123"))
//        writer.write("4");
//        else writer.write("2");
//
//        if(writer!=null){
//            writer.flush();
//            writer.close();
//        }
    }

    @RequestMapping(value = "/registerProcess",method = RequestMethod.POST)
    public String registerProcess(){
        //TODO 用户注册

        return "success";
    }





    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){

        return "login";
    }

    @RequestMapping(value = "/admin",method = RequestMethod.GET)
    public String admin(){

        return "admin";
    }

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(){

        return "home";
    }


    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public ModelAndView register(){
        ModelAndView model=new ModelAndView("login");
        model.addObject("p","register");
        return model;
    }

    public void jsonToResponse(JSONObject json, HttpServletResponse response)throws IOException{
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        Writer writer = null;
        try {
            writer = response.getWriter();
            writer.write(json.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(writer!=null){
                writer.flush();
                writer.close();
            }
        }
    }
    public String testPassword(){
        return loginService.getPwdByUname("hansen");
    }

}
