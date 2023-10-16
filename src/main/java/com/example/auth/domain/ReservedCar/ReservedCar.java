package com.example.auth.domain.ReservedCar;

import com.example.auth.domain.Car.Car;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Table(name = "reserved_cars")
public class ReservedCar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;
    private String nomeInteressado;
    private String telefoneInteressado;
    private String marca;
    private String modelo;
    private Integer anoFabricacao;
    private Integer anoModelo;
    private String descricao;
    private String title;
    private String image;
    private Integer price;

    @OneToOne
    @JoinColumn(name = "car_id")
    private Car car;

    public ReservedCar() {
        // Construtor vazio
    }

    public ReservedCar(String nomeInteressado, String telefoneInteressado, Car car) {
        this.nomeInteressado = nomeInteressado;
        this.telefoneInteressado = telefoneInteressado;
        this.car = car;

        // Preencha os detalhes do carro com base no carro associado
        this.marca = car.getMarca();
        this.modelo = car.getModelo();
        this.anoFabricacao = car.getAnoFabricacao();
        this.anoModelo = car.getAnoModelo();
        this.descricao = car.getDescricao();
        this.title = car.getTitle();
        this.image = car.getImage();
        this.price = car.getPrice();

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Integer getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Integer anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
