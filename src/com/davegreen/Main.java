package com.davegreen;

public class Main
{

    public static void main(String[] args)
    {
       int newScore = calculateScore("Dave", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(100);
    }

    public static int calculateScore(String playerName, int score)
    {
        System.out.println("Player " + playerName + " scored " + score + " points ");
        return score * 1000;
    }

    // Overloaded method with only one parameter.

    public static int calculateScore(int score)
    {
        System.out.println("Unnamed player scored " + score + " points ");
        return score * 1000;
    }

    // Overloaded method with no parameters.

    public static int calculateScore()
    {
        System.out.println("No player name and no player score");
        return 0;
    }

    // Methods are unique and defined by either their name or the parameters they have.
    // Changing the data type will not be enough to create a new unique overloaded method.
    // You must change either the method name thereby actually creating a whole new method
    // which is not overloading, and so therefor the only way to overload a method is by
    // changing its parameters.

    // Challenge.


    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
        double feetConversion = 30.48;
        double inchConversion = 2.54;
        double footToCm = feet * feetConversion;
        double inchToCm = inches * inchConversion;
        double finalAnswer = footToCm + inchToCm;

        if (feet >= 0 && inches >= 0 && inches <= 12)
        {
            System.out.println(feet + "ft " + inches + "in " + "is " + finalAnswer + "cm");
            return finalAnswer;
        }

        System.out.println("Invalid data input");
        return -1;

    }

    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        double feet = (int) inches / 12;
        double inchesRemaining = (int) inches % 12;
        double finalAnswer = feet + inchesRemaining;

        if (inches >= 0)
        {
            System.out.println(inches + "in " + "is " + feet + "ft " + inchesRemaining + "in");
            return calcFeetAndInchesToCentimeters(feet, inchesRemaining);
        }

        System.out.println("Invalid data input");
        return -1;
    }
}