package _06_abstract_class_and_interface.exercise.inplement_resizeble;

import _06_abstract_class_and_interface.exercise.inplement_resizeble.Shape;

public class Square extends Shape {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public String toString() {
        return "Square{" + super.toString() +
                ", side=" + side + ", Area= " + getArea() +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.side = this.side + this.side * percent / 100;
    }
}
