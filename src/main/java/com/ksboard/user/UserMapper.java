package com.ksboard.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int login(UserVo userVo);
}
