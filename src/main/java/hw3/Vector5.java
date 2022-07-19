package hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Vector5 {
    private final double x;
    private final double y;
    private final double z;
    private static final int countList = 2;

    Vector5(double x, double y, double z) { /* this что это и почему он нужен*/
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double calc3d() {
        return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
    }

    static double scalarMulti(Vector5 a, Vector5 b) {
        return (a.x * b.x + a.y * b.y + a.z * b.z);
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
        for (int i = 0; i < countList; i++) {
            vectorList.add(Vector5.createRandomVector());
        }
        return vectorList;
    }

    public static List<Vector5> listRandomVector(int size) {
        Random random = new Random();
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
}
