package co.il.telran.ilcarro.application.service.car;

import co.il.telran.ilcarro.application.model.entity.Car;
import co.il.telran.ilcarro.application.model.entity.CarImage;
import co.il.telran.ilcarro.application.model.entity.CarPrice;
import co.il.telran.ilcarro.application.model.web.search.CarMapRequest;
import co.il.telran.ilcarro.application.model.web.search.CarRequest;
import co.il.telran.ilcarro.application.model.web.search.LittleCarResponse;
import co.il.telran.ilcarro.application.model.web.search.RichCarResponse;
import co.il.telran.ilcarro.application.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarSearchServiceImplement implements CarSearchService{

    private final CarRepo carRepo;
    private final CarBodyStyleRepo carBodyStyleRepo;
    private final CarImageRepo carImageRepo;
    private final CarLocationRepo carLocationRepo;
    private final CarPriceRepo carPriceRepo;
    private final CarRatingRepo carRatingRepo;
    private final CarTransmissionRepo carTransmissionRepo;
    private final CarWeelDriveRepo carWeelDriveRepo;

    @Autowired
    public CarSearchServiceImplement(CarRepo carRepo,
                                     CarBodyStyleRepo carBodyStyleRepo,
                                     CarImageRepo carImageRepo,
                                     CarLocationRepo carLocationRepo,
                                     CarPriceRepo carPriceRepo,
                                     CarRatingRepo carRatingRepo,
                                     CarTransmissionRepo carTransmissionRepo,
                                     CarWeelDriveRepo carWeelDriveRepo) {
        this.carRepo = carRepo;
        this.carBodyStyleRepo = carBodyStyleRepo;
        this.carImageRepo = carImageRepo;
        this.carLocationRepo = carLocationRepo;
        this.carPriceRepo = carPriceRepo;
        this.carRatingRepo = carRatingRepo;
        this.carTransmissionRepo = carTransmissionRepo;
        this.carWeelDriveRepo = carWeelDriveRepo;
    }

    @Override
    public List<LittleCarResponse> getCars() {
        List<Car> cars = carRepo.findAll();
        return cars.stream()
                .map((car) -> convertCarToLittleCarResponse(car, carPriceRepo.findByCarId(car.getId())))
                .collect(Collectors.toList());
    }

    private List<CarImage> findCarImages(Long carId) {
        return carImageRepo.findAllByCarId(carId).orElse(new ArrayList<>());
    }

    @Override
    public RichCarResponse findCarById(Long id) {
        return null;
    }

    @Override
    public List<LittleCarResponse> findCarByParameters(CarRequest carRequest) {
        return null;
    }

    @Override
    public List<LittleCarResponse> findCarByMap(CarMapRequest carMapRequest) {
        return null;
    }

    private LittleCarResponse convertCarToLittleCarResponse(Car car, CarPrice carPrice) {
        return LittleCarResponse.builder()
                .carId(car.getId())
                .make(car.getMake())
                .model(car.getModel())
                .year(car.getYear())
                .price(carPrice.getPrice())
                .imageCar(new String())
                .build();
    }
}
