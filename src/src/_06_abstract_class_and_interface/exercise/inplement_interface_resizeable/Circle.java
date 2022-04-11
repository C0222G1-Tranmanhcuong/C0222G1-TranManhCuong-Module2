package _06_abstract_class_and_interface.exercise.inplement_interface_resizeable;

public class Circle extends Shape {
    private double radius;


    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString() + ", " +
                "radius=" + getRadius() + ", " + "Area= " + getArea() +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius + this.radius * percent / 100;
    }
}
