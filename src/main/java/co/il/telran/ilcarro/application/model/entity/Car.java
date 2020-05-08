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
@Table(name = "CAR")
public class Car extends Base {

	@Column(name="MAKE", nullable = false)
	private String make;
	@Column(name="MODEL", nullable = false)
	private String model;
	@Column(name="YEARS", nullable = false)
	private String year;
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