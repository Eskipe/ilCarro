package co.il.telran.ilcarro.application.service.car;

import co.il.telran.ilcarro.application.model.web.search.CarMapRequest;
import co.il.telran.ilcarro.application.model.web.search.CarRequest;
import co.il.telran.ilcarro.application.model.web.search.LittleCarResponse;
import co.il.telran.ilcarro.application.model.web.search.RichCarResponse;

import java.util.List;

public interface CarSearchService {
    List<LittleCarResponse> getCars();
    RichCarResponse findCarById(Long id);
    List<LittleCarResponse> findCarByParameters(CarRequest carRequest);
    List<LittleCarResponse> findCarByMap(CarMapRequest carMapRequest);
}
