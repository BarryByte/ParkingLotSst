package com.example.parkinglotsst.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Bill {
    private Date exitTime;
    private int amount;
    private Ticket ticket;
    private Gate gate;
    private Operator operator;
    private BillStatus billStatus;
    private List<Payment> payments;
}
