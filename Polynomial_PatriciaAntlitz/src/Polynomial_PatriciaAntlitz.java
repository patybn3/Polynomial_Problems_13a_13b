/* Problem Set 1 - 13b Polynomial.java
-------------------------------------------------------------*
/*
Name: Patricia Antlitz
Date: 09/17/2022
Class: CIS-252 Computer Science II - NECC Fall 2022

 * Please read the README file for detailed information about this program.

 * This program calculates simple polynomials of different degrees (no divisions, factoring, sq. roots, etc.)
 * The values are entered by the user, in the format: coefficient, followed by exponent, followed by the value of X as:
   for any ax^n you will enter a n (a space n), the program will ask for the value of X later.
 * It will raise the value of X to the power of the exponent.
 * it will then multiply the result by it's corresponding coefficients, and then add/sub them.
 * For subtraction, you must enter the numbers as a negative number.
 * It will print the total of the calculation, and quit the program
 * It uses java.util library, for the scanner
 */
 /**
 * @author Patricia N. Antlitz
 * @version 2.0
 */

import java.util.*;

public class Polynomial_PatriciaAntlitz
{
    Scanner scnr = new Scanner(System.in);
    protected static int setEquationDegree;
    protected int polyCoefficient, polyExponent;
    protected int coeArray[], expoArray[];
    protected double polynomialTotal, valueOfX;
    protected String userContinue = "";

    //2.) add a transformer method called setCoefficient that passes the parameters degree and coefficient
    //I did not pass the parameters, because the numbers are given by the user.
    public void setCoefficient()
    {
        //initializing the variables that will hold user's entries for the coefficient and exponent (degree of x)
        polyCoefficient = 0;
        polyExponent = 0;

        System.out.println("Enter the degree of the polynomial:");
        setEquationDegree = scnr.nextInt();

        //initiates arrays to be used, passes the polynomial degree as the arrays sizes
        coeArray = new int[setEquationDegree];
        expoArray = new int[setEquationDegree];

        //loop will run setEquationDegree times
        for(int i = 0; i < setEquationDegree; i++)
        {
            System.out.println("Enter the first coefficient followed by its exponent: ");
            System.out.println("For Example, to enter 5x^3, enter 5 3: ");
            polyCoefficient = scnr.nextInt();
            polyExponent = scnr.nextInt();

            //adding each number to the arrays.
            coeArray[i] = polyCoefficient;
            expoArray[i] = polyExponent;
        }

        System.out.println("Enter the value of X: ");
        valueOfX = scnr.nextDouble();

        //the total is given by calling the calculation method evaluatePolynomial
        System.out.println("---------------------------------------");
        System.out.println("Total " + evaluatePolynomial(valueOfX));
        System.out.println("---------------------------------------");

        //method that asks if the user wants to calculate again
        askToContinue();
    }

    public double evaluatePolynomial(double polyPower)
    {
        polynomialTotal = 0;

        for(int i = 0; i < setEquationDegree; i++)
        {
            //perform the calculation for each polynomial term, adding it to each other as the loop loops
            polynomialTotal += coeArray[i]*(Math.pow(polyPower, expoArray[i]));
        }

        return polynomialTotal;
    }

    public void askToContinue()
    {
        System.out.println("Would you like to calculate another polynomial?");

        while(scnr.hasNextLine())
        {
            userContinue = scnr.nextLine();
            userContinue.toLowerCase();

            if(userContinue.equalsIgnoreCase("y") || userContinue.equalsIgnoreCase("yes"))
            {
                setCoefficient();
            }
            else if(userContinue.equalsIgnoreCase("n") || userContinue.equalsIgnoreCase("no"))
            {
                System.out.println("Goodbye!");
                System.exit(0);
            }
            else
            {
                System.out.println("You must enter 'y' or 'n'");
            }
        }
    }


    public static void main(String[] args)
    {
        Polynomial_PatriciaAntlitz myPoly = new Polynomial_PatriciaAntlitz();
        myPoly.setCoefficient();
    }
}
