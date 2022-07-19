package hw3.shape;

public abstract class Round implements Shape {

    private double bigRadius;
    private double smallRadius;

    public Round(double bigRadius, double smallRadius) {
        this.bigRadius = bigRadius;
        this.smallRadius = smallRadius;
    }

    public Round() {
    }

    @Override
    public void getSquare() {
        double c = Math.PI * bigRadius * smallRadius;
        System.out.println("площадь овала - " + c);
    }
}
