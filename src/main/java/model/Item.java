package model;

import java.math.BigDecimal;

/**
 * Created by Adrian on 25/11/2016.
 */
@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
public class Item {
    private String name;
    private int qty;
    private BigDecimal price;
}
