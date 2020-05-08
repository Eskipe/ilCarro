package co.il.telran.ilcarro.application.repository;

import co.il.telran.ilcarro.application.model.entity.CarRating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRatingRepo extends JpaRepository<CarRating,Long> {
}
