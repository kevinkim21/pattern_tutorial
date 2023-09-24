package com.example.gangorder.dto;

import com.example.gangorder.common.ChannelType;
import com.example.gangorder.dto.base.BaseCheckoutRequest;

public class CheckoutRequest implements BaseCheckoutRequest {
    private String orderKey;
    private ChannelType channelType;
    private String totalAmount;
}
