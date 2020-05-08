package co.il.telran.ilcarro.application.model.entity.type;


import lombok.Getter;

import java.util.Arrays;

@Getter
public enum Fuel {

    BENZIN(1),
    DIZEL(3),
    ELECTRO_CAR(2);


    private Integer id;

    Fuel(Integer id) {
        this.id = id;
    }


    public static Fuel getById(Integer id) {
        return Arrays.stream(values())
                .filter(fuel -> fuel.getId().equals(id))
                .findFirst().get();
    }
}
