package com.csw.dao;

import java.util.List;
import com.csw.entity.Peisongdian;

public interface PeisongdianMapper {
    int deleteByPrimaryKey(Integer peisongdian_id);

    int insert(Peisongdian record);

    Peisongdian selectByPrimaryKey(Integer peisongdian_id);

    List<Peisongdian> selectAll();

    int updateByPrimaryKey(Peisongdian record);
}