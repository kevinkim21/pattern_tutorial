package com.example.gangorder.service.checkout.charge;

import com.example.gangorder.common.PurchaseType;
import com.example.gangorder.dto.CheckoutRequest;
import com.example.gangorder.dto.CheckoutResponse;
import com.example.gangorder.service.checkout.base.CheckoutHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class CheckoutChargeHandler implements CheckoutHandler<CheckoutRequest, CheckoutResponse> {

    private final CheckoutChargeService checkoutChargeService;

    @Override
    public PurchaseType getPurchaseType() {
        return PurchaseType.CHARGE;
    }

    @Override
    public CheckoutResponse handle(CheckoutRequest request) {

        return new CheckoutResponse();
    }
}
