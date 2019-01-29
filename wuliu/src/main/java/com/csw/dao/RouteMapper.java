package com.csw.dao;

import java.util.List;
import com.csw.entity.Route;

public interface RouteMapper {
    int deleteByPrimaryKey(Integer route_id);

    int insert(Route record);

    Route selectByPrimaryKey(Integer route_id);

    List<Route> selectAll();

    int updateByPrimaryKey(Route record);
}