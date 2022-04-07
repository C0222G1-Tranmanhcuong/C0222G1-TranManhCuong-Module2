package _05_inheritance.exercise.class_circle_and_class_cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(2.5,"yellow",5.8);
        System.out.println(cylinder);
    }
}
