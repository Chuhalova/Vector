package VectorTest;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MyVector {
    private double x;
    private double y;
    private double z;

    public MyVector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double round(double x) {
        return new BigDecimal(x).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public double vectorsLength() {
        return new BigDecimal(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2))).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public double scalarMultiplication(MyVector scalarMultVector) {
        return new BigDecimal(x * scalarMultVector.x + y * scalarMultVector.y + z * scalarMultVector.z).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public MyVector vectorMultiplication(MyVector vectorMultVector) {
        return new MyVector(round(y * vectorMultVector.z - z * vectorMultVector.y),
                round(z * vectorMultVector.x - x * vectorMultVector.z),
                round(x * vectorMultVector.y - y * vectorMultVector.x));
    }

    public double anglesCos(MyVector secondVector) {
        return new BigDecimal(this.scalarMultiplication(secondVector) / (Math.abs(this.vectorsLength()) * Math.abs(secondVector.vectorsLength()))).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public MyVector vectorsSum(MyVector secondVector) {
        return new MyVector(round(this.x + secondVector.x), round(this.y + secondVector.y), round(this.z + secondVector.z));
    }

    public MyVector vectorsDifference(MyVector secondVector) {
        return new MyVector(round(this.x - secondVector.x), round(this.y - secondVector.y), round(this.z - secondVector.z));
    }

    public static MyVector[] generatingVectors(int n) {
        MyVector[] generatedVectors = new MyVector[n];
        for (int i = 0; i < generatedVectors.length; i++) {
            generatedVectors[i] = new MyVector(Math.random(), Math.random(), Math.random());
        }
        return generatedVectors;
    }

}
