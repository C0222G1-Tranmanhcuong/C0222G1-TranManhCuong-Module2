package _06_abstract_class_and_interface.exercise.inplement_resizeble;

public class MainTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Blue", true, 5.0);
        shapes[1] = new Rectangle("yellow", false, 3, 6);
        shapes[2] = new Square("yellow", true, 4.0);

        for (Shape item : shapes) {
            System.out.println(item);
            item.resize(50.0);
            System.out.println(item);
        }

    }
}
