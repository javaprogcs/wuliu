package com.csw.dao;

import java.util.List;
import com.csw.entity.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer cust_id);

    int insert(Customer record);

    Customer selectByPrimaryKey(Integer cust_id);

    List<Customer> selectAll();

    int updateByPrimaryKey(Customer record);
}