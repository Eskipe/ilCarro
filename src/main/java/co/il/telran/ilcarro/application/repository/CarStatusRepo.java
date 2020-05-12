package co.il.telran.ilcarro.application.repository;

import co.il.telran.ilcarro.application.model.entity.CarStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarStatusRepo extends JpaRepository<CarStatus, Long> {
}
