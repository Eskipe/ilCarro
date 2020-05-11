package co.il.telran.ilcarro.application.controller;

import co.il.telran.ilcarro.application.model.web.managementCar.CarCreateRequest;
import co.il.telran.ilcarro.application.model.web.search.LittleCarResponse;
import co.il.telran.ilcarro.application.service.car.CarManagementService;
import co.il.telran.ilcarro.application.service.car.CarSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/user/car")
public class CarManagementController {

    private final CarManagementService carManagementService;
    private final CarSearchService carSearchService;

    @Autowired
    public CarManagementController(CarManagementService carManagementService, CarSearchService carSearchService) {
        this.carManagementService = carManagementService;
        this.carSearchService = carSearchService;
    }

    @PostMapping("/create")
    public void createCar(@RequestBody @Valid CarCreateRequest carCreateRequest) {
        carManagementService.createCar(carCreateRequest);
    }

    @GetMapping("/get")
    public List<LittleCarResponse> getCars() {
        return carSearchService.getCars();
    }
}
