package _05_inheritance.exercise.class_point2d_and_class_point3d;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;


    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }


    public float[] getXY(){
        float[] arr = {x,y};
        return arr;
    }
// Phương thức getXY trả về float, không phải String.
//    public String getXY() {
//        float[] arr = new float[2];
//        arr[0] = this.x;
//        arr[1] = this.y;
//        return Arrays.toString(arr);
//    }


    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
