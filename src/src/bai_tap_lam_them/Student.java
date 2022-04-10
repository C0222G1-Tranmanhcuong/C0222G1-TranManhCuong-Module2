package bai_tap_lam_them;

import bai_tap_lam_them.Person;

public class Student extends Person {

    private int point;

    public Student() {
    }

    public Student(String name, int age, boolean gender, int point) {
        super(name, age, gender);
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() +
                ", point: " + point;
    }
}
