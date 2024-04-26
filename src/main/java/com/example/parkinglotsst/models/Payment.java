package com.example.parkinglotsst.models;


import java.util.Date;

public class Payment extends BaseModel {
    private PaymentMode paymentMode;
    private int amount;
    private Date time;
    private PaymentStatus paymentStatus;
    private String referenceNumber;
}

