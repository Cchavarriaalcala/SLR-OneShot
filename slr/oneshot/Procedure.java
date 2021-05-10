package slr.oneshot;

import java.util.Scanner;

/**
 *
 * @author Carlos Chavarría
 */
public class Procedure {
//Atributes

    Scanner inputs = new Scanner(System.in);

    double B0;
    double B1;
    double x;

    DS dsX;
    DSY dsY;

    //Constructor 
    public Procedure(DS _dsX, DSY _dsY) {
        this.dsX = _dsX;
        this.dsY = _dsY;
        this.B1 = this.calcB1();
        this.B0 = this.calcB0();

    }
//Method to calculate slope(B1)according to the slr formula

    private double calcB1() {
        double[] dataX = dsX.getDataX();
        double[] dataY = dsY.getDataY();
        double sumX = 0;
        double sumY = 0;
        double sumXY = 0;
        double sumXsq = 0;

        for (int i = 0; i < dataX.length; i++) {
            sumX += dataX[i];
            sumY += dataY[i];
            sumXY += dataX[i] * dataY[i];
            sumXsq += Math.pow(dataX[i], 2);
        }
        return (((dataX.length * sumXY) - (sumX * sumY)) / ((dataX.length * sumXsq) - (Math.pow(sumX, 2))));
    }
//Method to calculate intercept (B0) according to slr formula

    private double calcB0() {
        double[] dataX = dsX.getDataX();
        double[] dataY = dsY.getDataY();
        double sumX = 0;
        double sumY = 0;
        for (int i = 0; i < dataX.length; i++) {
            sumX += dataX[i];
            sumY += dataY[i];
        }
        return (sumY - (this.B1 * sumX)) / dataX.length;
    }
//Public void to publish our result it also serves to capture the x value to make our prediction    

    public void Prediction() {
        System.out.println("\nInput an x value: ");
        double x = inputs.nextDouble();
        double y = this.B0 + (this.B1 * x);
        System.out.println("The prediction made with " + x + " as the x value is: " + y);
        System.out.println("\nWhere y = B0 + (B1*xi) is substituted by:\n y = " + B0 + " + (" + B1 + " * " + x + " )\n");
    }

    // Encapsulation GETTERS & SETTERS
    public double getB1() {
        return B1;
    }

    public void setB1(double B1) {
        this.B1 = B1;
    }

    public double getB0() {
        return B0;
    }

    public void setB0(double B0) {
        this.B0 = B0;
    }

    public DS getDS() {
        return dsX;
    }

    public void setDS(DS dsX) {
        this.dsX = dsX;
    }

    public DSY getDSY() {
        return dsY;
    }

    public void setDSY(DSY dsY) {
        this.dsY = dsY;
    }
}
