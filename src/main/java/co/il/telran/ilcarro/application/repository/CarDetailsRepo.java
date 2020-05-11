package co.il.telran.ilcarro.application.repository;

import co.il.telran.ilcarro.application.model.entity.CarDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDetailsRepo extends JpaRepository<CarDetails, Long> {
}
