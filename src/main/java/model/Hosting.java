package model;

import java.util.Date;

/**
 * Created by Adrian on 25/11/2016.
 */
@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
public class Hosting {

    private int Id;
    private String name;
    private Date createdDate;
}
