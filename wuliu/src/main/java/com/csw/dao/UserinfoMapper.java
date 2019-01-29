package com.csw.dao;

import java.util.List;
import com.csw.entity.Userinfo;

public interface UserinfoMapper {
    int deleteByPrimaryKey(Integer user_id);

    int insert(Userinfo record);

    Userinfo selectByPrimaryKey(Integer user_id);

    List<Userinfo> selectAll();

    int updateByPrimaryKey(Userinfo record);
}