package co.il.telran.ilcarro.application.model.entity;

import co.il.telran.ilcarro.application.model.entity.converter.ConverterFuel;
import co.il.telran.ilcarro.application.model.entity.type.Fuel;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "CAR_DETAILS")
public class CarDetails extends  Base{

    @OneToOne
    @JoinColumn(name = "CAR_ID", referencedColumnName = "ID", nullable = false)
    private Car car;
    @Column(name="ENGINE", nullable = false)
    private Double engine;
    @Column(name="FUEL")
    @Convert(converter = ConverterFuel.class)
    private Fuel fuel;
    @Column(name="HORSE_POWER", nullable = false)
    private Integer horsePower;
    @Column(name="TORQUE", nullable = false)
    private Integer torque;
    @Column(name="DOORS", nullable = false)
    private Integer doors;
    @Column(name="SEATS", nullable = false)
    private Integer seats;
    @Column(name="FUEL_CONSUMPTION", nullable = false)
    private String fuelConsumption;
    @Column(name ="DESCRIPTION")
    private String description;
    @Version
    @Column(name="VERSION")
    private Integer version;
}
