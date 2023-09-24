package com.example.gangorder.dto;

import com.example.gangorder.common.PurchaseType;
import com.example.gangorder.dto.base.BaseOrderRequest;

public class OrderRequest implements BaseOrderRequest {
    private PurchaseType purchaseType;
    private String countryCode;
    private String appGroupCode;
    private String languageCode;
    private boolean isGift;
    private String ip;
    private String requestFromCode;

}
