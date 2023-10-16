package com.example.auth.domain.Car;

import java.util.UUID;

public record CarResponseDTO(UUID id, String title, String image, Integer price, String marca, String modelo, Integer anoFabricacao, Integer anoModelo, String descricao) {
    public CarResponseDTO(Car car) {
        this(
                car.getId(), car.getTitle(), car.getImage(), car.getPrice(),
                car.getMarca(), car.getModelo(), car.getAnoFabricacao(),
                car.getAnoModelo(),  car.getDescricao()
        );
    }
}

