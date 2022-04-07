package _05_inheritance.exercise.class_point2d_and_class_point3d;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(2.5f, 3.5f, 4.5f);
        System.out.println(point3D.toString());
    }
}
