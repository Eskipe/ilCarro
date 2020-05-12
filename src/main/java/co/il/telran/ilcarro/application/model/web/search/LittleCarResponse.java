package co.il.telran.ilcarro.application.model.web.search;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LittleCarResponse {

    private Long carId;
    private String make;
    private String model;
    private String year;
    private String previewImageCar;
    private Double price;

}
