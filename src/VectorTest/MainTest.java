package VectorTest;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class MainTest {
    @Test
    public void scalarMultTestInts() {
        MyVector vector1 = new MyVector(1, 3, 6);
        MyVector vector2 = new MyVector(2, 8, 1);

        assertEquals(vector1.scalarMultiplication(vector2), 32);
    }

    @Test
    public void scalarMultTestDoubles() {
        MyVector vector1 = new MyVector(1.2, 3.4, 6.1);
        MyVector vector2 = new MyVector(2.1, 8.1, 1.5);

        assertEquals(vector1.scalarMultiplication(vector2), 39.21);
    }

    @Test
    public void vectorsLengthInts() {
        MyVector vector1 = new MyVector(1, 4, 1);
        assertEquals(vector1.vectorsLength(), 4.24);
    }

    @Test
    public void vectorsLengthDoubles() {
        MyVector vector1 = new MyVector(1.4, 4.2, 1.9);
        assertEquals(vector1.vectorsLength(), 4.82);
    }

    @Test
    public void vectorMultiplicationInts() {
        MyVector vector1 = new MyVector(2, 1, 7);
        MyVector vector2 = new MyVector(8, 4, 1);
        MyVector vector3 = new MyVector(-27, 54, 0);

        assertEquals((vector1.vectorMultiplication(vector2)).getX(), vector3.getX());
        assertEquals((vector1.vectorMultiplication(vector2)).getY(), vector3.getY());
        assertEquals((vector1.vectorMultiplication(vector2)).getZ(), vector3.getZ());
    }

    @Test
    public void vectorMultiplicationDoubles() {
        MyVector vector1 = new MyVector(2.4, 1.1, 7.9);
        MyVector vector2 = new MyVector(8.1, 4.2, 1.3);
        MyVector vector3 = new MyVector(-31.75, 60.87, 1.17);

        assertEquals((vector1.vectorMultiplication(vector2)).getX(), vector3.getX());
        assertEquals((vector1.vectorMultiplication(vector2)).getY(), vector3.getY());
        assertEquals((vector1.vectorMultiplication(vector2)).getZ(), vector3.getZ());
    }

    @Test
    public void anglesCosInts() {
        MyVector vector1 = new MyVector(1, 3, 5);
        MyVector vector2 = new MyVector(6, 6, 5);

        assertEquals(vector1.anglesCos(vector2), 0.84);
    }

    @Test
    public void anglesCosDoubles() {
        MyVector vector1 = new MyVector(1.7, 3.1, 5.2);
        MyVector vector2 = new MyVector(6.0, 6.1, 5.4);

        assertEquals(vector1.anglesCos(vector2), 0.90);
    }

    @Test
    public void vectorsSumInts() {
        MyVector vector1 = new MyVector(5, 3, 4);
        MyVector vector2 = new MyVector(4, 4, 4);
        MyVector vector3 = new MyVector(9, 7, 8);

        assertEquals(vector1.vectorsSum(vector2).getX(), vector3.getX());
        assertEquals(vector1.vectorsSum(vector2).getY(), vector3.getY());
        assertEquals(vector1.vectorsSum(vector2).getZ(), vector3.getZ());
    }

    @Test
    public void vectorsSumDoubles() {
        MyVector vector1 = new MyVector(5.4, 3.1, 4.1);
        MyVector vector2 = new MyVector(4.2, 4.4, 4.9);
        MyVector vector3 = new MyVector(9.6, 7.5, 9);

        assertEquals(vector1.vectorsSum(vector2).getX(), vector3.getX());
        assertEquals(vector1.vectorsSum(vector2).getY(), vector3.getY());
        assertEquals(vector1.vectorsSum(vector2).getZ(), vector3.getZ());
    }

    @Test
    public void vectorsDiffInts() {
        MyVector vector1 = new MyVector(9, 7, 8);
        MyVector vector2 = new MyVector(5, 3, 4);
        MyVector vector3 = new MyVector(4, 4, 4);

        assertEquals(vector1.vectorsDifference(vector2).getX(), vector3.getX());
        assertEquals(vector1.vectorsDifference(vector2).getY(), vector3.getY());
        assertEquals(vector1.vectorsDifference(vector2).getZ(), vector3.getZ());
    }

    @Test
    public void vectorsDiffDoubles() {
        MyVector vector1 = new MyVector(9.6, 7.5, 9);
        MyVector vector2 = new MyVector(5.4, 3.1, 4.1);
        MyVector vector3 = new MyVector(4.2, 4.4, 4.9);

        assertEquals(vector1.vectorsDifference(vector2).getX(), vector3.getX());
        assertEquals(vector1.vectorsDifference(vector2).getY(), vector3.getY());
        assertEquals(vector1.vectorsDifference(vector2).getZ(), vector3.getZ());
    }

    @Test
    public void generatingVectors() {
        MyVector[] myVectors = MyVector.generatingVectors(4);
        for (MyVector vector : myVectors
        ) {
            assertNotEquals(vector.getX(), null);
            assertNotEquals(vector.getY(), null);
            assertNotEquals(vector.getZ(), null);
        }
    }
}