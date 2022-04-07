package _05_inheritance.exercise.class_point2d_and_class_point3d;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
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

    public float getZ() {
        return z;
    }

    public void setZ() {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = {getX(), getY(), this.z};
        return arr;

    }



    public void setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" + "x= " + getX()
                + ", " + "y= "
                + getY() + ", " +
                "z= " + z +
                '}';
    }
}
