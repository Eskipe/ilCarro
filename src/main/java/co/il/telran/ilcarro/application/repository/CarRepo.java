package co.il.telran.ilcarro.application.repository;

import co.il.telran.ilcarro.application.model.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car,Long> {
}
