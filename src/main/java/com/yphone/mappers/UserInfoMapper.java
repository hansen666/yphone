package com.yphone.mappers;

import com.yphone.mappers.nochange.MBGUserInfoMapper;
import com.yphone.model.nochange.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;





@Component
public interface UserInfoMapper extends MBGUserInfoMapper {

    void saveUser(UserInfo user);
    String getPwdByUname(@Param("userName") String userName);
    String getPwdByPhone(@Param("phone") String phone);
    int isPhoneExist(String phone);
    int isUserNameExit(String userName);

}