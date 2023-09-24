package com.example.gangorder.service.order.charge;

import com.example.gangorder.common.PurchaseType;
import com.example.gangorder.dto.OrderRequest;
import com.example.gangorder.dto.OrderResponse;
import com.example.gangorder.service.order.base.OrderHandler;

public class OrderChargeHandler implements OrderHandler<OrderRequest, OrderResponse> {

    @Override
    public OrderResponse handle(OrderRequest request) {
        return new OrderResponse();
    }

    @Override
    public PurchaseType getPurchaseType() {
        return PurchaseType.CHARGE;
    }

}