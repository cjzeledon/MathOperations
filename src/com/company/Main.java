package com.company;
import java.util.Scanner;


public class Main {
    // public = available for everyone
    // static = works at the class level
    // return type is void which means after the method runs you get nothing back
    // the name of the method is main. methods usually do not duplicate names
    // String[] args is the arguments the method takes
    public static void main(String[] args) {
        // Ask the user to input the first number(s)
        Scanner firstInputNum = new Scanner(System.in);
        System.out.println("What is your first number to input?");
        //Convert that firstInputNum into a double which is a primitive type
        double firstInput = firstInputNum.nextDouble();
        //Prints out the number with the string "You Choose"
        System.out.println("You choose:" + firstInput);

        // Ask the user to input the second number(s)
        Scanner secondInputNum = new Scanner(System.in);
        System.out.println("What is your second number to input?");
        //Convert that secondInputNum into a double which is a primitive type
        double secondInput = secondInputNum.nextDouble();
        //Prints out the number with the string "You choose"
        System.out.println("You choose:" + secondInput);

        // Create a new variable to sum the two numbers together
        // Remember to clarify what that variable is; either an int or double
        double sum = firstInput + secondInput;

        //Create a new variable to subtract the two input of numbers
        // Again, remember to clarify what that variable is; either an int or double
        double subtract = firstInput - secondInput;

        // Create a new variable to divide the two inputs of numbers
        // REMEMBER to clarify what that variable is; either an int or double
        double division = firstInput / secondInput;

        // Create a new variable that multiply the two inputs of numbers
        // Do I need to say this again? Nope.
        double multiply = firstInput * secondInput;


        // You use the % to get the remainder of two inputs
        // Not going to repeat the reminders here...10
        double remainder = firstInput % secondInput;

        showResults(sum, subtract, division, multiply, remainder);
    }
    // for a method signature
    // access modifier(optional) static(optional) returnType(not optional) nameOfMethod(not optional) parens with parameters(parameters are optional)
//
//
//
//
// public static String showName(String name) {
//        return "dlk;fjaskl;fjsdlk;fjkl;sfjlk;sDJ";
//    }
//
//    public static void notShowName(String name) {
//        name = "ldfk;jas;dlkfkl";
//    }

    public static void showResults(double a, double b, double c, double d, double e){
        System.out.println("The sum of two numbers are:" + a);
        System.out.println("The subtraction of two numbers are:" + b);
        System.out.println("The division of these two numbers are:" + c);
        System.out.println("The multiplication of these two numbers are:" + d);
        System.out.println("The remainder of these two inputs are:" + e);
    }
}