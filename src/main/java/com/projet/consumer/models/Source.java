package com.projet.consumer.models;

public enum Source {
    _100_YR_SAR("100_yr_sar"),
    _100_YR_AR4("100_yr_AR4"),
    _100_YR_AR5_WITH_CC_FEEDBACK("100_yr_ar5_with_CC_Feedback"),
    _100_YR_AR5_W_OUT_CC_FEEDBACK("100_yr_ar5_w_out_CC_Feedback"),
    _100_YR_AR6("100_yr_AR6");

    private final String value;

    Source(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

