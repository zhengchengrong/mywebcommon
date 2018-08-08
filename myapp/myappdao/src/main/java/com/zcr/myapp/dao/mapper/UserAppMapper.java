package com.zcr.myapp.dao.mapper;

import com.zcr.myapp.dao.model.UserApp;
import com.zcr.myapp.dao.model.UserAppExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAppMapper {
    long countByExample(UserAppExample example);

    int deleteByExample(UserAppExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserApp record);

    int insertSelective(UserApp record);

    List<UserApp> selectByExample(UserAppExample example);

    UserApp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserApp record, @Param("example") UserAppExample example);

    int updateByExample(@Param("record") UserApp record, @Param("example") UserAppExample example);

    int updateByPrimaryKeySelective(UserApp record);

    int updateByPrimaryKey(UserApp record);
}