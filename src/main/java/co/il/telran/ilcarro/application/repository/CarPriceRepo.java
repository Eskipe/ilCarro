package co.il.telran.ilcarro.application.repository;

import co.il.telran.ilcarro.application.model.entity.CarPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarPriceRepo extends JpaRepository<CarPrice,Long> {
}
