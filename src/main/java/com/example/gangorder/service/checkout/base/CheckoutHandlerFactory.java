package com.example.gangorder.service.checkout.base;

import com.example.gangorder.common.PurchaseType;
import com.example.gangorder.dto.base.BaseCheckoutRequest;
import com.example.gangorder.dto.base.BaseCheckoutResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CheckoutHandlerFactory {
    private Map<PurchaseType, CheckoutHandler<BaseCheckoutRequest, BaseCheckoutResponse>> checkoutHandlers = new HashMap<>();

    @Autowired
    public CheckoutHandlerFactory(List<CheckoutHandler<BaseCheckoutRequest, BaseCheckoutResponse>> handlers) {
        for (CheckoutHandler<BaseCheckoutRequest, BaseCheckoutResponse> handler : handlers) {
            checkoutHandlers.put(handler.getPurchaseType(), handler);
        }
    }

    public <T extends BaseCheckoutRequest, R extends BaseCheckoutResponse> R checkoutOrder(PurchaseType purchaseType, T request) {
        CheckoutHandler<T, R> handler = (CheckoutHandler<T, R>) checkoutHandlers.get(purchaseType);
        if (handler == null) {
            throw new IllegalArgumentException("No handler found for " + purchaseType);
        }
        return handler.handle(request);
    }
}
