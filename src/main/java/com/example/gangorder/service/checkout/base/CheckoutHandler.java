package com.example.gangorder.service.checkout.base;

import com.example.gangorder.common.PurchaseType;
import com.example.gangorder.dto.base.BaseCheckoutRequest;
import com.example.gangorder.dto.base.BaseCheckoutResponse;

public interface CheckoutHandler<T extends BaseCheckoutRequest, R extends BaseCheckoutResponse> {
    R handle(T request);
    PurchaseType getPurchaseType();
}