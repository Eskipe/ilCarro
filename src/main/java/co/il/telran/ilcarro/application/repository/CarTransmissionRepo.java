package co.il.telran.ilcarro.application.repository;

import co.il.telran.ilcarro.application.model.entity.CarTransmission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarTransmissionRepo extends JpaRepository<CarTransmission,Long> {
}
