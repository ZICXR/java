package com.zlz.book.dao.impl;

import com.zlz.book.dao.OrderItemDAO;
import com.zlz.book.pojo.OrderItem;
import com.atguigu.myssm.basedao.BaseDAO;

public class OrderItemDAOImpl extends BaseDAO<OrderItem> implements OrderItemDAO {
    @Override
    public void addOrderItem(OrderItem orderItem) {
        super.executeUpdate("insert into t_order_item values(0,?,?,?)",orderItem.getBook().getId(),orderItem.getBuyCount(),orderItem.getOrderBean().getId()) ;
    }
}
