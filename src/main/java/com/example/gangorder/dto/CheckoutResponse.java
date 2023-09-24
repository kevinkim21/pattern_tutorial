package com.example.gangorder.dto;

import com.example.gangorder.common.ChannelType;
import com.example.gangorder.dto.base.BaseCheckoutResponse;

public class CheckoutResponse implements BaseCheckoutResponse {
    private String orderKey;
    private ChannelType channelType;
    private String totalAmount;
}
