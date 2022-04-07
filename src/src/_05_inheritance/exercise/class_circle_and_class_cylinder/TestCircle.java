package _05_inheritance.exercise.class_circle_and_class_cylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(2.5,"Blue");
        System.out.println(circle);
    }
}
