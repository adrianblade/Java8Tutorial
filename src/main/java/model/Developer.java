package model;

import java.math.BigDecimal;

/**
 * Created by Adrian on 25/11/2016.
 */
@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
public class Developer {
    private String name;
    private BigDecimal salary;
    private int age;
}
