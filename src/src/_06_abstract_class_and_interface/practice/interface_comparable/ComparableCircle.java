package _06_abstract_class_and_interface.practice.interface_comparable;

import _05_inheritance.exercise.class_circle_and_class_cylinder.Circle;

public  class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(){

    }

    public ComparableCircle(double radius){
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled){
        super(radius,color,filled);
    }



    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
