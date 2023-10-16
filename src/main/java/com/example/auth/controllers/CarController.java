package com.example.auth.controllers;

import com.example.auth.domain.Car.Car;
import com.example.auth.domain.Car.CarRepository;
import com.example.auth.domain.Car.CarRequestDTO;
import com.example.auth.domain.Car.CarResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("car")
public class CarController {
    @Autowired
    private CarRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveCar(@RequestBody CarRequestDTO data) {
        Car carData = new Car(data);
        repository.save(carData);
    }


    @GetMapping
    public List<CarResponseDTO> getAll() {
        List<CarResponseDTO> carList = repository.findAll().stream().map(CarResponseDTO::new).toList();
        return carList;
    }


    @GetMapping("/{carId}")
    public ResponseEntity<CarResponseDTO> getCarById(@PathVariable UUID carId) {
        Optional<Car> carOptional = repository.findById(carId);
        if (carOptional.isPresent()) {
            return ResponseEntity.ok(new CarResponseDTO(carOptional.get()));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{carId}")
    public ResponseEntity<String> deleteCar(@PathVariable UUID carId) {
        Optional<Car> carOptional = repository.findById(carId);
        if (carOptional.isPresent()) {
            repository.delete(carOptional.get());
            return ResponseEntity.ok("Carro excluído com sucesso.");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
