package _05_inheritance.exercise.class_point_and_moveablepoint;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;


    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    public MovablePoint() {

    }

    @Override
    public float getX() {
        return super.getX();
    }

    @Override
    public void setX(float x) {
        super.setX(x);
    }

    @Override
    public float getY() {
        return super.getY();
    }

    @Override
    public void setY(float y) {
        super.setY(y);
    }

    @Override
    public void setXY(float x, float y) {
        super.setXY(x, y);
    }

    @Override
    public String getXY() {
        return super.getXY();
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return this.ySpeed;
    }

    public void setYSpeed() {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String getSpeed() {
        float[] arr = new float[2];
        arr[0] = this.xSpeed;
        arr[1] = this.ySpeed;
        return Arrays.toString(arr);
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x= " + getX() +
                ", y= " + getY() + ", " + "speed= " + getSpeed() +
                '}';
    }

    public String move() {
        this.setX(this.getX() + xSpeed);
        this.setY(this.getY() + ySpeed);
        return this.getXY();
    }
}
