package co.il.telran.ilcarro.application.model.web.managementCar;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarDetailsCreateDto {
    @NotNull
    private Double engine;
    @NotNull
    private Integer fuel;
    @NotNull
    private Integer horsePower;
    @NotNull
    private Integer torque;
    @NotNull
    private Integer doors;
    @NotNull
    private Integer seats;
    @NotBlank
    private String fuelConsumption;
    @NotBlank
    private String description;
    @NotBlank
    private String bodyStyle;
    @NotBlank
    private String rating;
    @NotBlank
    private String transmission;
    @NotNull
    private Integer wheelDrive;
}