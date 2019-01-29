package com.csw.dao;

import java.util.List;
import com.csw.entity.District;

public interface DistrictMapper {
    int deleteByPrimaryKey(Integer district_id);

    int insert(District record);

    District selectByPrimaryKey(Integer district_id);

    List<District> selectAll();

    int updateByPrimaryKey(District record);
}