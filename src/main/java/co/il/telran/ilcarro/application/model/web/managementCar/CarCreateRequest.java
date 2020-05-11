package co.il.telran.ilcarro.application.model.web.managementCar;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel
public class CarCreateRequest {

    @NotBlank
    @ApiModelProperty(example = "My big car")
    private String make;
    @NotBlank
    @ApiModelProperty(example = "BMV")
    private String model;
    @NotBlank
    @ApiModelProperty(example = "2008")
    private String year;

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
