package co.il.telran.ilcarro.application.model.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "CAR_IMAGE")
public class CarImage extends Base {
    @ManyToOne
    @JoinColumn(name = "CAR_ID", referencedColumnName = "ID", nullable = false)
private Car car;
    @Column(name = "IMAGE", nullable = false)
    private byte[] image;


}
