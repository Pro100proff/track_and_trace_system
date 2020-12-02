package com.example.trackandtracesystem.service;

import com.example.trackandtracesystem.entities.Company;
import com.example.trackandtracesystem.entities.CompanyOrder;
import com.example.trackandtracesystem.entities.Order;

import java.time.LocalDate;

public class CompanyOrderService extends AbstractOrderService {

    @Override
    protected Order createClientOrder() {
        return new CompanyOrder(12, LocalDate.now(), new Company(12, "AliExpress", "111"));
    }
}
