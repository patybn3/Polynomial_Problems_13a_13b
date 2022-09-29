<h2> Object-Oriented Data Structure Using Java, 4th Edition </h2>

<h4>Patricia Antlitz - NECC 2022</h4>

<h3> Chapter 1 - Problem 13 a </h3>

- Create an application that accepts the degree of a polynomial and the coefficients of the polynomial
- Pass the polynomial values in the command line from greater degree to lowest.
- Keep asking the user if they want to continue.

<hr>
<h4>Description:</h4>
<hr>
=> This program is user interactive. It will ask the user to enter a degree number. The degree number will set the size of the polynomial. <br>
Ex.:<br>
If the user enters the number 3, this polynomial will have the format of: <i>ax<sup>n</sup> &#177 ax &#177 a</i>

The degree of the polynomial is stored on variable <i>setEquationDegree</i> of type <i>int</i>.

=> It will then ask the user to enter each coefficient number with its corresponding exponential as power of x.<br>
Ex.:<br>
If the user wants the value of 2x<sup>3</sup>, they will enter 2 3 (2 space 3).

=> The numbers entered by the user will be stored in two different <i>int</i> arrays.<br>
<i>coeArray</i> will store all the coefficient values entered by the user, while <i>expoArray</i> will store the values of the exponents. A loop is used to get all the values into the arrays.

The size of the arrays are determinate by the value of <i>setEquationDegree</i> previously entered by the user.

=> Out of the first loop, the user will be asked to enter the value of X that will be store in <i>valueOfX</i> of type <i>double</i>.<br>
Ex.:<br>
If the user enters the value of "1", the equation becomes: <br>
5(1)<sup>3</sup> + 2(1) - 3.</i>

=> The program will calculate the value of the polynomial and print the total.<br>
It will raise the value of x to the power of the exponent and multiply it by the value of the coefficient. Adding the results to come up with the correct answer.

=> To perform subtractions the user will need to enter the numbers as negative numbers.<br>

This is the end of the program.

<hr>
<h3>This I did not do:</h3>
<hr>

=> The instructions say the numbers should be entered all at once in the command line. To get <i>5x<sup>3</sup> + 2x - 3</i>, the user
would have to type 3 5 0 2 -3. That, is first-of-all, not user-friendly, and it's confusing. Coefficients should come before exponents.
This is also the reason why I passed the parameters for setCoefficient as coefficient, degree, instead of degree, coefficient.
I also separated the entries, the user will enter each coefficient followed by its corresponding exponent one at a time.

<hr>
<h4> Steps: </h4>
<hr>

A new class was created and named Polynomial_PatriciaAntlitz containing the following variables:

    - All variables are protected
```java 
    static int setEquationDegree;     // Stores the size of the arrays, static because it is used as parameter for the object

    int polyCoefficient, polyExponent;  //temp stores user's entries for coefficients and exponets, before the values are sent to an arrays.

    coeArray[] and expoArray[]  // arrays for type int, holds the list of exponents, and the list of coefficients

    double polynomialTotal, valueOfX;   // polynomialTotal holds the total of the calculation while valueOfX stores the value entered by the user to be used as the value of x (no waaay!)
```
<hr>
<h4>Structure:</h4>

    - main method:
    
    Where the object Polynomial_PatriciaAntlitz is created. 
    The only method called from the main function is setCoefficient.
 
<hr>

    - Transformer method -> setCoeffiencent - type void:

    This method is supposed to take two parameters, a coefficient and an exponent.
    I did not do that because it was not necessary for my program. 
    I would have to pass a value when creating the instance of the object in the main method.
    Since the values of the coefficients and the exponents are given by the user, it makes no
    sense to try to find a way around to pass the parameters.
    
    This is the method that takes all the entries from the user. All numbers used in the equations.
    It uses a for loop to loop setEquationDegree times, scans user's entries for the coefficients and
    the esponents, and stores it in each corresponding array.

    This method also calls the evaluation method.

<hr>

    - Method evaluatePolynomial - type double, it takes one paramenter - the value of x

    Takes the numbers stores in the arrays and performs the calculations:
    Math.pow to calculate the value of x when raised to the power of the exponent.
    Multiplies by the value of the coefficient.
    Add/Sub the numbers.


<h4>Technologies Used:</h4>

- Java 15.0.1

<h4>Sources:</h4>

- The voices in my head.

<h4>Technical Support:</h4>

- KevinO, the duck.

<hr>
<h3>Problems Encountered:</h3>
<hr>

Problem 1: I encountered no problems.

Let me know!


<hr>
<h3>To run:</h3>
<hr>

IDE:<br>
Build the project and run the Polynomial_PatriciaAntlitz.java file

CLI:<br>
* Navigate to the correct directory ....../Polynomial_PatriciaAntlitz/src <br>
* Run on terminal:
    * javac Polynomial_PatriciaAntlitz.java => compile
    * java Polynomial_PatriciaAntlitz.java => run

<h2>THE END</h2>

by [Patricia Antlitz - GitHub](https://github.com/patybn3)