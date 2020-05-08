package co.il.telran.ilcarro.application.model.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "CAR_PRICE")
public class CarPrice extends Base {
    @OneToOne
    @JoinColumn(name = "CAR_ID", referencedColumnName = "ID", nullable = false)
    private Car car;
    @Column(name = "PRICE", nullable = false)
    private Double price;


}
