package hw3.shape;

public class Instances {
    public static void main(String[] args) {

        Shape shape = new Circle(5);
        shape.getSquare();
        shape = new Oval(4, 5);
        shape.getSquare();
        shape = new Square(5);
        shape.getSquare();
        shape = new Rectangle(4, 5);
        shape.getSquare();
    }
}
