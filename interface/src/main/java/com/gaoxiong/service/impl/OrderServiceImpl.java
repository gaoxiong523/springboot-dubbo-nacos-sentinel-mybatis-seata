package com.gaoxiong.service.impl;

import com.gaoxiong.mapper.OrderMapper;
import com.gaoxiong.model.Order;
import com.gaoxiong.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gaoxiong
 * @ClassName OrderServiceImpl
 * @Description
 * @date 2019/10/11 14:13
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> findAll () {
        return orderMapper.selectAll();
    }
}
