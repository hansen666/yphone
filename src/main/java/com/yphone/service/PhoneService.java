package com.yphone.service;

import com.yphone.mappers.OrderGeneratorMapper;
import com.yphone.model.nochange.Order;
import com.yphone.model.nochange.OrderGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class PhoneService {

    @Autowired
    private OrderGeneratorMapper orderGeneratorMapper;



    //生成订单号
    public String generalOrderNum(HttpServletRequest request){
        //获取session
        HttpSession session=request.getSession();
        String userName=(String)session.getAttribute("userName");
        if(userName==null)  //如果没有登录，则返回null
            return null;
        //如果已经登录
        String tailNum=((String)session.getAttribute("phone")).substring(7);  //获取手机尾号，4位
        Date date=new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
        String MAndD=sdf.format(date).replaceAll("-",""); //获取月日，4位

        OrderGenerator orderGenerator=new OrderGenerator();
        orderGenerator.setDateNum(MAndD);
        orderGenerator.setPhoneLast4(tailNum);
        orderGeneratorMapper.insertSelective(orderGenerator);

        int id=(int)(orderGenerator.getOrderGeneratorId()%1000000);
        String ID="000000".substring(String.valueOf(id).length())+String.valueOf(id);
        return ID+MAndD+tailNum;
    }
}
