package _06_abstract_class_and_interface.exercise.inplement_colorable;

public class Square extends Shape implements Colorable {
    private double side;


    public Square(String color, boolean filled) {
        super(color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
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
        return "Square:" + "\t" + super.toString() + "\t" + "side= " + getSide() + "\t" + "Area=" + "\t" + getArea();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
        ;
    }
}
