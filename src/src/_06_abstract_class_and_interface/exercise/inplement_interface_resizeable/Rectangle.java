package _06_abstract_class_and_interface.exercise.inplement_interface_resizeable;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + super.toString() +
                ", width= " + width +
                ", length=" + length + ", Area= " + getArea() +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.width = this.width + this.width * percent / 100;
        this.length = this.length + this.length * percent / 100;
    }
}
