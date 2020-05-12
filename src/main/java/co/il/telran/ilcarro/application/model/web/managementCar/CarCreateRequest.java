package co.il.telran.ilcarro.application.model.web.managementCar;

import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarCreateRequest {

    @NotBlank
    private String make;
    @NotBlank
    private String model;
    @NotBlank
    private String year;
//    @NotBlank
//    private String previewImageCar;
//    @Min(value = 1)
//    @NotNull
//    private Double price;
//    @Valid
//    @NotNull
//    private CarDetailsCreateDto carDetailsCreate;
//    @Valid
//    @NotNull
//    private CarLocationCreateDto carLocationCreate;
}
