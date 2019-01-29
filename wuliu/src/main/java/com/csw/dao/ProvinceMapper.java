package com.csw.dao;

import java.util.List;
import com.csw.entity.Province;

public interface ProvinceMapper {
    int deleteByPrimaryKey(Integer province_id);

    int insert(Province record);

    Province selectByPrimaryKey(Integer province_id);

    List<Province> selectAll();

    int updateByPrimaryKey(Province record);
}