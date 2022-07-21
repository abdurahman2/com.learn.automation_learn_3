package hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Vector5 {
    private final double x;
    private final double y;
    private final double z;
    private static final int COUNT_LIST = 2;

    Vector5(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double calc3d() {
        return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
    }

    static double scalarMulti(Vector5 vector1, Vector5 vector2) {
        return (vector1.x * vector2.x + vector1.y * vector2.y + vector1.z * vector2.z);
    }

    public static Vector5 createRandomVector() {
        Random random = new Random();
        double x = Math.random() * 10;
        double y = random.nextDouble(50) * 10;
        double z = random.nextDouble(50) * 10;
        return new Vector5(x, y, z);
    }

    public static List<Vector5> listRandomVector() {
        List<Vector5> vectorList = new ArrayList<>();
        for (int i = 0; i < COUNT_LIST; i++) {
            vectorList.add(Vector5.createRandomVector());
        }
        return listRandomVector(COUNT_LIST);
    }

    public static List<Vector5> listRandomVector(int size) {
        List<Vector5> vectorList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            vectorList.add(createRandomVector());
        }
        return vectorList;
    }

    @Override
    public String toString() {
        return "x=" + x + " y=" + y + " z=" + z + "\n";
    }

    public static void main(String[] args) {
        System.out.println(listRandomVector());
        System.out.println(listRandomVector(5));
    }
}
