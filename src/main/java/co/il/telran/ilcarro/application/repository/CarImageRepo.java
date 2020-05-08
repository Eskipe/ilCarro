package co.il.telran.ilcarro.application.repository;

import co.il.telran.ilcarro.application.model.entity.CarImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarImageRepo extends JpaRepository<CarImage,Long> {
}
