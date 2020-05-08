package co.il.telran.ilcarro.application.model.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "CAR_LOCATION")
public class CarLocation extends Base {

    @OneToOne
    @JoinColumn(name = "CAR_ID", referencedColumnName = "ID", nullable = false)
    private Car car;
    @Column(name="COUNTRY", nullable = false)
    private String country;
    @Column(name="CITY", nullable = false)
    private String city;
    @Column(name="STREET", nullable = false)
    private String street;
    @Column(name="REGION", nullable = false)
    private String region;
    @Column(name="ZIP", nullable = false)
    private String zip;

}
