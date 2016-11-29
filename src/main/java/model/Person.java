package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Adrian on 29/11/2016.
 */
@Getter
@Setter
@AllArgsConstructor
public class Person {
    private String name;
    private int age;

    public Person (String name){
        this.name = name;
    }
}
