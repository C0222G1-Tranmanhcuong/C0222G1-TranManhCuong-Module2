package _05_inheritance.practice.system_of_geometric_object;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8,"yellow",true);
        System.out.println(square);
    }


}
