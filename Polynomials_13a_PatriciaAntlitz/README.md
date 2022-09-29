<h2> Object-Oriented Data Structure Using Java, 4th Edition </h2>

<h4>Patricia Antlitz - NECC 2022</h4>

<h3> Chapter 1 - Problem 13 a </h3>

<strong> 13. a) </strong> <i>You will create a class that represents a polynomial; for example, it could
represent 5x<sup>3</sup> + 2x - 3.</i>

- Create a class called <i>Polynomial</i> to represent the calculation of a polynomial equation.
- Create a constructor that accepts the degree of the polynomial of type <i>int</i>.
- Create a transformer method called <i>setCoefficient</i> that accepts <i>int</i> arguments: the degree of the term (exponent),
  and the coefficient.
- Create a method called <i>evaluate<i> to calculate the polynomial total.

<hr>
<h4>Description:</h4>
<hr>
=> This program represents a polynomial of degree 3 <br>
=> It uses a pre-set value for it's coefficients, exponents and X values.<br>
=> The constructor is used to pass the degree of the polynomial. The degree is used as the array size.<br>
=> The values are created and inserted into the arrays on a method called getValues(), which calls the method setCoefficient.<br>
=> It uses the method evaluate, to calculate each of the indexes, then add them together <br>

This is the end of the program.


<hr>
<h4> Steps: </h4>
<hr>

A new class was created and named Polynomials_13a_PatriciaAntlitz containing the following variables:

    - All variables are protected

    setEquationDegree< => int type. Stores the size of the arrays.

    polyCoefficient and polyExponent => int, used to store the values passed to serCoefficient

    coeArray[] and expoArray[] => arrays for type int, holds the list of exponents, and the list of
    coefficients

    polyTotal, valueOfX, initialCal0, 1, and 2 => type double, polyTotal holds the total of the calculation
    while valueOfX stores the value entered by the user to be used as the value of x.

<hr>
<h4>Structure:</h4>

    - main method:
    
    Where the object Polynomial_PatriciaAntlitz is created, passes the degree of the polynomial.
    Calls the methods getValue and evaluate

<hr>

    -   Constructor:
    
    A constructor was created that accepts the degree of the polynomial as a parameter. 
    The degree is then assigned to variable setEquationDegree
    setEquationDegree is passed as the size for the arrays.


<hr>

    - Transformer method -> setCoeffiencent - type void:

    This method only holds the variables that store the values of the parameters. The variables are used to add the numbers to the arrays

<hr>

    - Method evaluatePolynomial - type double, it takes one paramenter - the value of x

    Takes the numbers stored in the arrays and performs the calculations:
    Math.pow to calculate the value of x when raised to the power of the exponent.
    Multiplies by the value of the coefficient.
    Add/Sub the numbers.


<hr>

    -   getValues() 
    This method will call setCoefficient, pass the values and store them in arrays

<hr>


<h4>Technologies Used:</h4>

- Java 15.0.1

<hr>
<h3>Problems Encountered:</h3>
<hr>

Problem 1:<br>
Originally I coded a totally different program. One that took user input instead of set values. First because set values sounded too simple to me,
second because I thought to myself it would be the best way to have it implemented. That is, until I read the requirements for
13.b. That program now is 13.b.
I am not sure if I did this right, because I am not sure I fully understood was being asked (again, sounds too simple).<br>

Problem 2:<br>
Having set values passed makes it a bit frustrating to add the values. I couldn't do the calculations with a loop, or add the values to an array with a look.
That was not great!

Problem 3:<br>

I don't think I was able to create a transforming method with setCoefficient, passing and assigning values was the only thing I thought I could put there.

Problem 4:<br>
I still don't know what a Test Driver program implies. Is that the user input? User is driving? Is it a separate class that extends this one or something?
?????

Let me know!

<hr>
<h3>To run:</h3>
<hr>

IDE:<br>
Build the project and run the Polynomials_13a_PatriciaAntlitz.java file

CLI:<br>
* Navigate to the correct directory /......Polynomials_13a_PatriciaAntlitz/src <br>
* Run on terminal:
  * javac Polynomials_13a_PatriciaAntlitz.java => compile
  * java Polynomials_13a_PatriciaAntlitz.java => run
<hr>

by [Patricia Antlitz - GitHub](https://github.com/patybn3)

<h2>THE END</h2>