package hw3.shape;

public abstract class Rectangular implements Shape {

    private int a;

    public Rectangular(int a) {
        this.a = a;
    }

    public Rectangular() {
    }

    @Override
    public double getSquare() {
        int c = a * a;
        System.out.println("площадь квадрата - " + c);
        return c;
    }
}
