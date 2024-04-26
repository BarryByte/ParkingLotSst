package com.example.parkinglotsst.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Ticket {
    private String number;
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingSpot assignedSpot;
    private Gate generatedAt;
    private Operator generatedBy;
}
