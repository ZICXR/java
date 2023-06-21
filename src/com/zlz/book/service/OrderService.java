package com.zlz.book.service;

import com.zlz.book.pojo.OrderBean;
import com.zlz.book.pojo.User;

import java.util.List;

public interface OrderService {
    void addOrderBean(OrderBean orderBean);
    List<OrderBean> getOrderList(User user);
}
