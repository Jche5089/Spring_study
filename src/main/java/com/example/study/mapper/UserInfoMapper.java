package com.example.study.mapper;

import com.example.study.domain.UserInfo;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserInfoMapper {
    @Select("select * from emp")
    List<UserInfo> findAll();
}
