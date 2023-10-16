package com.example.auth.domain.Car;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Table(name="cars")
@Entity(name="cars")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", columnDefinition = "UUID")
    private UUID id;

    private String marca;
    private String modelo;
    private Integer anoFabricacao;
    private Integer anoModelo;
    private String descricao;
    private String title;
    private String image;
    private Integer price;

    public Car(CarRequestDTO data) {
        this.marca = data.marca();
        this.modelo = data.modelo();
        this.anoFabricacao = data.anoFabricacao();
        this.anoModelo = data.anoModelo();
        this.descricao = data.descricao();
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }
}
