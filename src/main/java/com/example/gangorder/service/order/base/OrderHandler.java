package com.example.gangorder.service.order.base;

import com.example.gangorder.common.PurchaseType;
import com.example.gangorder.dto.base.BaseOrderRequest;
import com.example.gangorder.dto.base.BaseOrderResponse;

public interface OrderHandler<T extends BaseOrderRequest, R extends BaseOrderResponse> {
    R handle(T request);
    PurchaseType getPurchaseType();
}