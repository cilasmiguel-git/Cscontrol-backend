package com.example.auth.controllers;


import com.example.auth.domain.Car.Car;
import com.example.auth.domain.Car.CarRepository;
import com.example.auth.domain.ReservedCar.ReservedCar;
import com.example.auth.domain.ReservedCar.ReservedCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("reserved-car")
public class ReservedCarController {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private ReservedCarRepository reservedCarRepository;

    private ReservedCarsList reservedCarsList = new ReservedCarsList(); // Instância da lista de carros reservados


    @PostMapping("/reserve/{carId}")
    public ResponseEntity<String> reserveCar(
            @PathVariable UUID carId,
            @RequestParam String nomeInteressado,
            @RequestParam String telefoneInteressado
    ) {
        Optional<Car> carOptional = carRepository.findById(carId);
        if (carOptional.isPresent()) {
            Car carToReserve = carOptional.get();

            // Crie um objeto ReservedCar com as informações da reserva e os detalhes do carro
            ReservedCar reservedCar = new ReservedCar(nomeInteressado, telefoneInteressado, carToReserve);

            // Salve o ReservedCar na tabela reserved_cars
            reservedCarRepository.save(reservedCar);

            return ResponseEntity.ok("Carro reservado com sucesso.");
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("/list-reserved-cars")
    public List<ReservedCar> getAllReservedCars() {
        return reservedCarRepository.findAll();
    }


}
