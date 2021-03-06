package _05_inheritance.practice.system_of_geometric_object;

public class Shape {
    private String color = "Green";
    private boolean filled= true;

    public Shape(){

    }


    public Shape(String color, boolean filled){

    }
    public String getColor() {
        return color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of"
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}

