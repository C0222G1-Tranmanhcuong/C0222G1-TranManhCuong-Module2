package _03_class_and_object_in_java.exercise.build_class_fan;

public class Fan {
    final int SLOW =1;
    final int MEDIUM =2;
    final int FAST =3;
    private boolean on;
    private double radius;
    private int speed;
    private String color;

    public Fan(){

    }
    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void Fan(){
        this.speed = SLOW;
        this.radius = 5;
        this.color = "Blue";
        this.on = false;
    }
    public void Fan(int speed, double radius,String color,boolean on){

        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }

    @Override
    public String toString() {
        if(this.on = true){
            return (" Speed "+ speed + " Radius " + radius + " Color " + color + " Fan is on ");
        } else {
            return ("Color "+ color + "Radius "+ radius + " Fan is off");
        }
    }
}
