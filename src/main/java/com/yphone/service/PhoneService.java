package com.yphone.service;

import com.yphone.mappers.DistrictMapper;
import com.yphone.mappers.OrderGeneratorMapper;
import com.yphone.mappers.OrderMapper;
import com.yphone.model.nochange.Order;
import com.yphone.model.nochange.OrderGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PhoneService {

    @Autowired
    private OrderGeneratorMapper orderGeneratorMapper;

    @Autowired
    private DistrictMapper districtMapper;



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

    //选择省份
    public List<String> getProvinces(){
        return districtMapper.selectProvinces();
    }

    public List<String> getCities(String province){
        return districtMapper.selectCitiesByProvince(province);
    }

    public List<String> getCounties(String city){
        return districtMapper.selectCountiesByCity(city);
    }

    public Map<String,String> getAddressMap(int id){
        List<Map<Integer,String>> mapList=districtMapper.getAddressByID(id);
        Map<String,String> addressMap=new HashMap<>();
        for(Map<Integer,String> map:mapList){
            addressMap.put(map.get("district_id"),map.get("name"));
        }
        return addressMap;
    }

}
