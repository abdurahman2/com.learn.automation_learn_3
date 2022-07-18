package hw3.shape;

public class Instances {
    public static void main(String[] args) {

//        Round round = new Round(4,5);
//        round.getSquare();
//        Circle circle = new Circle(5);
//        circle.getSquare();
//        Rectangular rectangular = new Rectangular(5);
//        rectangular.getSquare();
//        Rectangle rectangle = new Rectangle(4,5);
//        rectangular.getSquare();


        Shape shape = new Round(4,5);
        shape.getSquare();
        shape = new Circle(5);
        shape.getSquare();
        shape = new Rectangular(5);
        shape.getSquare();
        shape = new Rectangle(4,5);
        shape.getSquare();
    }
}
