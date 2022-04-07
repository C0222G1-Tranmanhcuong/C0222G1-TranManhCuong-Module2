package _05_inheritance.exercise.class_point_and_moveablepoint;

public class TestMovablePoint {
    public static void main(String[] args) {

        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(2.2f,3.3f,4.5f,5.5f);
        System.out.println(movablePoint);

        System.out.println("Diem di chuyen co toa do la: "+ movablePoint.move());
    }
    }



