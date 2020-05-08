package co.il.telran.ilcarro.application.repository;

import co.il.telran.ilcarro.application.model.entity.CarLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarLocationRepo extends JpaRepository<CarLocation,Long> {
}
