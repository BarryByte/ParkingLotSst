package com.example.parkinglotsst.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingFloor {
    private List<ParkingSpot> parkingSpots;
    private int floorNumber;
    private ParkingFloorStatus parkingFloorStatus;
}
