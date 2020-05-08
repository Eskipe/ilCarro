package co.il.telran.ilcarro.application.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class Base {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID")
    private Long id;

    @CreatedDate
    @Column(name = "CREATED_ON",updatable = false)
    private LocalDateTime createdOn;

    @LastModifiedDate
    @Column(name = "UPDATE_ON")
    private LocalDateTime updateOn;
}
