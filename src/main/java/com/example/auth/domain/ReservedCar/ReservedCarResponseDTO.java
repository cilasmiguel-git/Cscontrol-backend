package com.example.auth.domain.ReservedCar;

import java.util.UUID;

public class ReservedCarResponseDTO {
    private UUID id;
    private String nomeInteressado;
    private String telefoneInteressado;
    private UUID carId;
    private String marca;
    private String modelo;
    private Integer anoFabricacao;
    private Integer anoModelo;
    private String descricao;
    private String title;
    private String image;
    private Integer price;

    public ReservedCarResponseDTO(ReservedCar reservedCar) {
        this.id = reservedCar.getId();
        this.nomeInteressado = reservedCar.getNomeInteressado();
        this.telefoneInteressado = reservedCar.getTelefoneInteressado();
        this.carId = reservedCar.getCar().getId();
    }

    // Adicione setters para os campos de detalhes do carro
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setAnoModelo(Integer anoModelo) {
        this.anoModelo = anoModelo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public String getNomeInteressado() {
        return nomeInteressado;
    }

    public String getTelefoneInteressado() {
        return telefoneInteressado;
    }

    public UUID getCarId() {
        return carId;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public Integer getAnoModelo() {
        return anoModelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public Integer getPrice() {
        return price;
    }
}
