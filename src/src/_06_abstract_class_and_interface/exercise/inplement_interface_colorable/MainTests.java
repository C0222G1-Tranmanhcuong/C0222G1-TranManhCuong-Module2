package _06_abstract_class_and_interface.exercise.inplement_interface_colorable;

public class MainTests {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square("yellow", true, 4.0);
        shapes[1] = new Circle("red", true, 2.0);
        shapes[2] = new Rectangle("Blue", true, 2.0, 3.0);
        for (Shape item : shapes) {
            if (item instanceof Square) {
                Square square = (Square) item;
                square.howToColor();
            }
            System.out.println(item);
        }
    }
}
