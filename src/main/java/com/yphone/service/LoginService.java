package com.yphone.service;

import com.yphone.mappers.UserInfoMapper;
import com.yphone.model.nochange.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chenhansen on 2018/5/21.
 */
@Service
public class LoginService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    //数据库插入一个用户
    public void saveUsesr(UserInfo user){
        userInfoMapper.saveUser(user);
    }

    //根据用户名查找密码
    public String getPwdByUname(String userName){
        return userInfoMapper.getPwdByUname(userName);
    }

    //根据手机号查找密码
    public String getPwdByPhone(String phone){
        return userInfoMapper.getPwdByPhone(phone);
    }


}
