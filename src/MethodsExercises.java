import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(add(2.5, 2.5));
//        System.out.println(subtract(2, 2));
//        System.out.println(multiply(2, 2));
//        System.out.println(divide(2, 10));
//        System.out.println(modulus(100, 2));
//        System.out.println(newMultiply(3, 3));
//        System.out.println(recursiveMultiply(3, 3, 0));

//        Scanner sc = new Scanner(System.in);
////        userInteractionFactorial(sc);
//        int userInt = getInteger(1, 5);
//        System.out.println(userInt);
//


    }
    //
////    Exercises
//
////
////    Basic Arithmetic
////
////    Create four separate methods. Each will perform an arithmetic operation:
////
////    Addition
////    Subtraction
////    Multiplication
////    Division
////    Each function needs to take two parameters/arguments so that the operation can be performed.
////
////    Test your functions and verify the output.
////
////    Add a modulus function that finds the modulus of two numbers.
////
////            Food for thought: What happens if we try to divide by zero? What should happen?
////
//
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }
//
//
////    Bonus
////
////    Create your multiplication method without the * operator (Hint: a loop might be helpful).
//
//    public static double newMultiply(double num1, double num2) {
//        double total = 0;
//        for (int i = 0; i < num2; i += 1) {
//            total += num1;
//        }
//        return total;
//    }
//
//
////    Do the above with recursion.
//
//    public static double recursiveMultiply(double num1, double num2, double total) {
//        if (num2 > 0) {
//            return recursiveMultiply(num1, num2 - 1, total + num1);
//        } else {
//            return total;
//        }
//    }
//
//
////    Create a method that validates that the user input is in a certain range
////
////    The method signature should look like this:
////
////
////    public static int getInteger(int min, int max);
////    and is used like this:
////
////
////            System.out.print("Enter a number between 1 and 10: ");
////    int userInput = getInteger(1, 10);
////    If the input is invalid, prompt the user again.
////
////    Hint: recursion might be helpful here!
//
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Not a number!");
            return getInteger(min, max);
        }
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number not in range!");
            return getInteger(min, max);
        }
    }
//
//
//
////    Calculate the factorial of a number.
////
////    Prompt the user to enter an integer from 1 to 10.
////    Display the factorial of the number entered by the user.
////    Ask if the user wants to continue.
////    Use a for loop to calculate the factorial.
////    Assume that the user will enter an integer, but verify it’s between 1 and 10.
////    Use the long type to store the factorial.
////    Continue only if the user agrees to.
////    A factorial is a number multiplied by each of the numbers before it.
////    Factorials are denoted by the exclamation point (n!). Ex:
////
////
////            1! = 1               = 1
////            2! = 1 x 2           = 2
////            3! = 1 x 2 x 3       = 6
////            4! = 1 x 2 x 3 x 4   = 24
//
            public static long calculateFactorial(int num) {
                int output = 1;
                for (int i = 1; i <= num; i += 1) {
                    output *= i;
                }
                return output;
            }
//
//
            public static void userInteractionFactorial(Scanner sc) {
                boolean willContinue;
                String userChoice;
                do {
                    System.out.println("Please enter an integer from 1 to 12");
                    int userInt = getInteger(1, 12);
                    System.out.println(calculateFactorial(userInt));
                    do {
                        System.out.println("Do you wish to continue? [y/n]: ");
                        userChoice = sc.next().trim();
                    } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));

                    willContinue = userChoice.equalsIgnoreCase("y");
                } while (willContinue);
            }
//
//
//
////    Bonus
////
////    Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
//
//
////    Use Recursion to implement the factorial.
//
//        public static long calculateFactorial(int num) {
//            long result;
//            if (num == 1) {
//                return 1;
//            }
//            result = calculateFactorial(num - 1) * num;
//            return result;
//        }
//
////    Create an application that simulates dice rolling.
////    Ask the user to enter the number of sides for a pair of dice.
////    Prompt the user to roll the dice.
////"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
////            Use static methods to implement the method(s) that generate the random numbers.
////    Use the .random method of the java.lang.Math class to generate random numbers.
//
//
    public static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    public static void rollDiceGame(Scanner sc) {
        String userChoice;
        System.out.print("Please enter the number of sides for the dice: ");
        int nSides = getInteger(1, 20);
        do {
            System.out.println("You have rolled a " + randomWithRange(1, nSides) + " and a " + randomWithRange(1, nSides));
            do {
                System.out.println("Would you like to roll again? [y/n]");
                userChoice = sc.next().trim();
            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));

        } while (!userChoice.equals("n"));
    }
}
