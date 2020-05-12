package co.il.telran.ilcarro.application.service.car;

import co.il.telran.ilcarro.application.model.entity.Car;
import co.il.telran.ilcarro.application.model.web.managementCar.CarCreateRequest;
import co.il.telran.ilcarro.application.model.web.search.RichCarResponse;
import co.il.telran.ilcarro.application.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CarManagementServiceImplement implements CarManagementService{

    private final CarRepo carRepo;
    private final CarDetailsRepo carDetailsRepo;
    private final CarBodyStyleRepo carBodyStyleRepo;
    private final CarImageRepo carImageRepo;
    private final CarLocationRepo carLocationRepo;
    private final CarPriceRepo carPriceRepo;
    private final CarRatingRepo carRatingRepo;
    private final CarTransmissionRepo carTransmissionRepo;
    private final CarWeelDriveRepo carWeelDriveRepo;

    @Autowired
    public CarManagementServiceImplement(CarRepo carRepo,CarDetailsRepo carDetailsRepo,
                                     CarBodyStyleRepo carBodyStyleRepo,
                                     CarImageRepo carImageRepo,
                                     CarLocationRepo carLocationRepo,
                                     CarPriceRepo carPriceRepo,
                                     CarRatingRepo carRatingRepo,
                                     CarTransmissionRepo carTransmissionRepo,
                                     CarWeelDriveRepo carWeelDriveRepo) {
        this.carRepo = carRepo;
        this.carDetailsRepo = carDetailsRepo;
        this.carBodyStyleRepo = carBodyStyleRepo;
        this.carImageRepo = carImageRepo;
        this.carLocationRepo = carLocationRepo;
        this.carPriceRepo = carPriceRepo;
        this.carRatingRepo = carRatingRepo;
        this.carTransmissionRepo = carTransmissionRepo;
        this.carWeelDriveRepo = carWeelDriveRepo;
    }

    @Override
    @Transactional
    public void createCar(CarCreateRequest carCreateRequest) {
        Car car = Car.builder()
                .make(carCreateRequest.getMake())
                .model(carCreateRequest.getModel())
                .year(carCreateRequest.getYear())
                .build();
        carRepo.save(car);
    }

    @Override
    public RichCarResponse updateCar(CarCreateRequest carCreateRequest) {
        return null;
    }

    @Override
    public void deleteCar(Long carId) {

    }

    @Override
    public void makeAvailable(Long carId) {

    }

    @Override
    public void makeUnavailable(Long carId) {

    }
}
