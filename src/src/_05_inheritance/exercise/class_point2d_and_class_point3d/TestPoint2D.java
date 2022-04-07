package _05_inheritance.exercise.class_point2d_and_class_point3d;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(3.5f, 4.5f);
        System.out.println(point2D.toString());
    }
}
