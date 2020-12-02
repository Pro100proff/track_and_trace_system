package com.example.trackandtracesystem.service;

import com.example.trackandtracesystem.entities.Order;

public abstract class AbstractOrderService implements OrderService {

    @Override
    public Order createOrder() {
        Order clientOrder = createClientOrder();
        clientOrder.printDocInfo();
        System.out.println("Добавляю в ближайший маршрут");
        return clientOrder;
    }

    protected abstract Order createClientOrder();


}
