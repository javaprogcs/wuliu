package com.csw.dao;

import java.util.List;
import com.csw.entity.Delivery;

public interface DeliveryMapper {
    int deleteByPrimaryKey(Integer delivery_id);

    int insert(Delivery record);

    Delivery selectByPrimaryKey(Integer delivery_id);

    List<Delivery> selectAll();

    int updateByPrimaryKey(Delivery record);
}