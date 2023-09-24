package com.example.gangorder.service.order.base;

import com.example.gangorder.common.PurchaseType;
import com.example.gangorder.dto.base.BaseOrderRequest;
import com.example.gangorder.dto.base.BaseOrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class OrderHandlerFactory {
    private Map<PurchaseType, OrderHandler<BaseOrderRequest, BaseOrderResponse>> orderHandlers = new HashMap<>();

    @Autowired
    public OrderHandlerFactory(List<OrderHandler<BaseOrderRequest, BaseOrderResponse>> handlers) {
        for (OrderHandler<BaseOrderRequest, BaseOrderResponse> handler : handlers) {
            orderHandlers.put(handler.getPurchaseType(), handler);
        }
    }

    public <T extends BaseOrderRequest, R extends BaseOrderResponse> R placeOrder(PurchaseType purchaseType, T request) {
        OrderHandler<T, R> handler = (OrderHandler<T, R>) orderHandlers.get(purchaseType);
        if (handler == null) {
            throw new IllegalArgumentException("No handler found for " + purchaseType);
        }
        return handler.handle(request);
    }
}
