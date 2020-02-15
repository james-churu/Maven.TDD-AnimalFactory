package rocks.zipcodewilmington.animals;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class Cat extends Mammal {
    Integer numOfCats = 0;

    public Cat(String name, Date birthDate, Integer id) {
        super(name = name, birthDate, id);
        numOfCats ++;
    }
    public String speak() {
        return "meow!";
    }
}
