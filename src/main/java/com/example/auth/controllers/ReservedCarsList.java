package com.example.auth.controllers;


import com.example.auth.domain.ReservedCar.ReservedCarResponseDTO;

import java.util.ArrayList;
import java.util.List;

public class ReservedCarsList {
    private List<ReservedCarResponseDTO> reservedCars = new ArrayList<>();

    public List<ReservedCarResponseDTO> getReservedCars() {
        return reservedCars;
    }

    public void addReservedCar(ReservedCarResponseDTO reservedCar) {
        reservedCars.add(reservedCar);
    }
}
