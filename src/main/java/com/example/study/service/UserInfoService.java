package com.example.study.service;

import com.example.study.domain.UserInfo;
import com.example.study.mapper.UserInfoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserInfoService {
    private final UserInfoMapper userInfoMapper;

    public List<UserInfo> getAllUsers(){
        return userInfoMapper.findAll();
    }
    
}
