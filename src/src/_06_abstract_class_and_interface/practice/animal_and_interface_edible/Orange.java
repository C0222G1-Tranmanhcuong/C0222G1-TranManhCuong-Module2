package _06_abstract_class_and_interface.practice.animal_and_interface_edible;

import _06_abstract_class_and_interface.practice.animal_and_interface_edible.Fruit;

public class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange could be juiced";
    }
}
