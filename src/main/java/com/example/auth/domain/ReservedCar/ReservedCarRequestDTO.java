package com.example.auth.domain.ReservedCar;

import java.util.UUID;

public class ReservedCarRequestDTO {
    private String nomeInteressado;
    private String telefoneInteressado;
    private UUID carId;

    public String getNomeInteressado() {
        return nomeInteressado;
    }

    public void setNomeInteressado(String nomeInteressado) {
        this.nomeInteressado = nomeInteressado;
    }

    public String getTelefoneInteressado() {
        return telefoneInteressado;
    }

    public void setTelefoneInteressado(String telefoneInteressado) {
        this.telefoneInteressado = telefoneInteressado;
    }

    public UUID getCarId() {
        return carId;
    }

    public void setCarId(UUID carId) {
        this.carId = carId;
    }
}

