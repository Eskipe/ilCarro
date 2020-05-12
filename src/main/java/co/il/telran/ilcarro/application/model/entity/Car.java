package co.il.telran.ilcarro.application.model.entity;

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
	@Version
	@Column(name="VERSION")
	private Integer version;
}

