package com.example.auth.domain.ReservedCar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReservedCarRepository extends JpaRepository<ReservedCar, UUID> {
}
