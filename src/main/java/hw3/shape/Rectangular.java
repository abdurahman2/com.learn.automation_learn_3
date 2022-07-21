package hw3.shape;

public abstract class Rectangular implements Shape {

    private double a;
    private double b;

    public Rectangular(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangular() {
    }

    public double getSquare() {
        double c = a * b;
        System.out.println("площадь прямоугольника - " + c);
        return c;
    }
}
