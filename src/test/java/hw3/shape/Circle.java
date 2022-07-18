package hw3.shape;

public class Circle extends Round {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void getSquare() {
        double c = Math.PI * radius * radius;
        System.out.println("площадь круга - " + c);
    }
}
