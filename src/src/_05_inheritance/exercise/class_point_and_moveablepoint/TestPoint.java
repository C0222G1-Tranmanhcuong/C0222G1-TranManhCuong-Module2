package _05_inheritance.exercise.class_point_and_moveablepoint;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point = new Point(2.5f,3.5f);
        System.out.println(point);
    }
}
