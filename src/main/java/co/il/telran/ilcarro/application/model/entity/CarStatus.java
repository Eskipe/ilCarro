package co.il.telran.ilcarro.application.model.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "CAR_STATUS")
public class CarStatus extends Base{
    @OneToOne
    @JoinColumn(name = "CAR_ID", referencedColumnName = "ID", nullable = false)
    private Car car;
    @Column(name = "STATUS", nullable = false)
    private Boolean status ;

}
