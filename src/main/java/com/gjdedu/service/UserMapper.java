package com.gjdedu.service;

import com.gjdedu.pojo.User_Mybatis;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper // 在运行时，会自动生成接口的实现类对象，并且将该对象交给IOC容器管理
public interface UserMapper {
    @Select("select * from user_mybatis;")
    List<User_Mybatis> list();
}
