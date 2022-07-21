package hw3;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class Vector5Test {

    @Test
    public void check3d() {
        Vector5 asd = new Vector5(2, 2, 2);
        assertEquals(3.4641016151377544, asd.calc3d(), "3d formula with mistakes");
    }

    @Test
    public void checkScalarMulti() {
        Vector5 asd = new Vector5(2, 3, 4);
        Vector5 dsa = new Vector5(2, 2, 2);
        assertEquals(18.0, Vector5.scalarMulti(asd, dsa), "scalarMulti formula with mistakes");
        System.out.println(Vector5.createRandomVector());
        System.out.println(Vector5.listRandomVector());
        System.out.println(Vector5.listRandomVector(5));
        System.out.println(asd.toString());
    }

    @Test
    public void checkRandomList() {
        assertEquals(2, Vector5.listRandomVector().size(), "Size of vectors not equals");
    }

}