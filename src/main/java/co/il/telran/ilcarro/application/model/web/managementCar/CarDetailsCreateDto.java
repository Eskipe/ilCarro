package co.il.telran.ilcarro.application.model.web.managementCar;

import lombok.*;

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
    @NotNull
    private String fuelConsumption;
    @NotNull
    private String description;
    @NotNull
    private String bodyStyle;
    @NotNull
    private String rating;
    @NotNull
    private String transmission;
    @NotNull
    private Integer wheelDrive;
}
