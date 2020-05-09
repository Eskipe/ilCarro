package co.il.telran.ilcarro.application.repository;

import co.il.telran.ilcarro.application.model.entity.CarImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CarImageRepo extends JpaRepository<CarImage,Long> {

    Optional<List<CarImage>> findAllByCarId(Long carId);
}
