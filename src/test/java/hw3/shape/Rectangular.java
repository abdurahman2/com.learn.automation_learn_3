package hw3.shape;

public class Rectangular implements Shape {

    private int a;

    public Rectangular(int a) {
        this.a = a;
    }

    public Rectangular() {
    }

    @Override
    public void getSquare() {
        int c = a * a;
        System.out.println("площадь квадрата - " + c);
    }
}
