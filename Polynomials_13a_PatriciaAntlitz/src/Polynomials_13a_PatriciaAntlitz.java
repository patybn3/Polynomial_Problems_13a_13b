/* Problem Set 1 - 13a Polynomial.java
-------------------------------------------------------------*
/*
Name: Patricia Antlitz
Date: 09/17/2022
Class: CIS-252 Computer Science II - NECC Fall 2022

 * Please read the README file for detailed information about this program.

 * This program calculates simple polynomials of different degrees (no divisions, factoring, sq. roots, etc.)
 * The values are set by the program. That would be: 5x^3 + 2x - 3
 * 3 values of x are passed to the evaluate function. 3 results are expected.
 * For value of x = 0.0, total should be = -3.0
 * For the value of x = 1.0, total should be = 4.0
 * And for the value of x = 0.5, the total should be = -1.375.
 * It will print the total of the calculation, and quit the program
 */
/**
 * @author Patricia N. Antlitz
 * @version 2.0
 */

public class Polynomials_13a_PatriciaAntlitz {

    protected int setEquationDegree, polyCoefficient, polyExponent;
    protected double valueOfX, initialCalc0, initialCalc1, initialCalc2, polyTotal;
    protected int coeArray[], expoArray[];

    // 1) create a class constructor that passes the degree of the polynomial
    // this will set the size of the array
    public Polynomials_13a_PatriciaAntlitz(int degree)
    {
        setEquationDegree = degree;
    }

    //2) add a transformer method called setCoefficient that passes the parameters degree and coefficient
    //I don't think I can call this a transformer method, but there is not much to do here, calculations are done elsewhere
    public void setCoefficient(int coefficient, int exponent)
    {
        polyCoefficient = coefficient;
        polyExponent = exponent;
    }

    //create a method to calculate
    public double evaluate(double powerOfX)
    {
        valueOfX = powerOfX;

        initialCalc0 = coeArray[0]*(Math.pow(valueOfX, expoArray[0]));
        initialCalc1 = coeArray[1]*(Math.pow(valueOfX, expoArray[1]));
        initialCalc2 = coeArray[2]*(Math.pow(valueOfX, expoArray[2]));

        polyTotal = initialCalc0 + initialCalc1 + initialCalc2;

        return polyTotal;
    }

    //this method insets the values to be calculated into its corresponding array index
    public void getValues()
    {
        coeArray = new int [setEquationDegree];
        expoArray = new int[setEquationDegree];

        setCoefficient(5, 3);
        coeArray[0] = polyCoefficient;
        expoArray[0] = polyExponent;
        setCoefficient(2, 1);
        coeArray[1] = polyCoefficient;
        expoArray[1] = polyExponent;
        setCoefficient(-3, 0);
        coeArray[2] = polyCoefficient;
        expoArray[2] = polyExponent;
    }

    public static void main(String[] args)
    {
        Polynomials_13a_PatriciaAntlitz myPoly = new Polynomials_13a_PatriciaAntlitz(3);

        System.out.println("Polynomial equation: 5x^3 + 2x - 3 \n");

        //the values, and the evaluation will need to be called separately to print the results correctly
        myPoly.getValues();
        System.out.print("5(0.0)^3 + 2(0.0) - 3 = ");
        System.out.println(myPoly.evaluate(0.0));

        myPoly.getValues();
        System.out.print("5(1.0)^3 + 2(1.0) - 3 = ");
        System.out.println(myPoly.evaluate(1.0));

        myPoly.getValues();
        System.out.print("5(0.5)^3 + 2(0.5) - 3 = ");
        System.out.println(myPoly.evaluate(0.5));
    }
}
