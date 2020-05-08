package co.il.telran.ilcarro.application.model.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "CAR_WHEEL_DRIVE")
public class CarWheelDrive extends Base {
    @OneToOne
    @JoinColumn(name = "CAR_ID", referencedColumnName = "ID", nullable = false)
    private Car car;
    @Column(name = "WHEEL_DRIVE", nullable = false)
    private Integer wheelDrive;


}