package co.il.telran.ilcarro.application.model.web.managementCar;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarLocationCreateDto {

    @NotNull
    private String country;
    @NotNull
    private String city;
    @NotNull
    private String street;
    @NotNull
    private String region;
    @NotNull
    private String zip;
}