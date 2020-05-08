package co.il.telran.ilcarro.application.model.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "CAR_BODY_STYLE")
public class CarBodyStyle extends Base {
    @OneToOne
    @JoinColumn(name = "CAR_ID", referencedColumnName = "ID", nullable = false)
    private Car car;
    @Column(name = "BODY_STYLE", nullable = false)
    private String bodyStyle;


}