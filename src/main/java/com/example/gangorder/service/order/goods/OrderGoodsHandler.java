package com.example.gangorder.service.order.goods;

import com.example.gangorder.common.PurchaseType;
import com.example.gangorder.dto.OrderRequest;
import com.example.gangorder.dto.OrderResponse;
import com.example.gangorder.service.order.base.OrderHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class OrderGoodsHandler implements OrderHandler<OrderRequest, OrderResponse> {

    @Override
    public OrderResponse handle(OrderRequest request) {
        return new OrderResponse();
    }

    @Override
    public PurchaseType getPurchaseType() {
        return PurchaseType.GOODS;
    }

}