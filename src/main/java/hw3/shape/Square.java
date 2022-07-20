package hw3.shape;

public class Square extends Rectangular {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getSquare() {
        double c = a * a;
        System.out.println("площадь квадрата - " + c);
        return c;
    }
}
