package co.il.telran.ilcarro.application.service.car;

import co.il.telran.ilcarro.application.model.web.managementCar.CarCreateRequest;
import co.il.telran.ilcarro.application.model.web.search.RichCarResponse;

public interface CarManagementService {

    void createCar(CarCreateRequest carCreateRequest);
    RichCarResponse updateCar(CarCreateRequest carCreateRequest);
    void deleteCar(Long carId);

}
