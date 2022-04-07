package _05_inheritance.exercise.class_circle_and_class_cylinder;

public class Cylinder extends Circle {
        private double height;

        public Cylinder(){

        }
        public Cylinder(double height){
            this.height = height;
        }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
            return height * Math.PI * super.getRadius() * super.getRadius();
    }

    @Override
    public String toString() {
        return "Cylinder{" + "radius= "+ ","+
                "height=" + height +"," + "volome="+ getVolume()+ ","+
                "color: "+ getColor() +
                '}';
    }
}
