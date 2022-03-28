package calculator;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    static double number1;
    static double number2;
    static double result;
    static String resultOfCalc = "The result is ";

    public static void main(String[] args) {

        enterNumbers();
        chooseOperation();
        continueOrExit();
    }

    public static void enterNumbers() {
        System.out.println("Please enter two numbers here");
        System.out.print("first number: ");
        number1 = scanner.nextDouble();
        System.out.print("second number: ");
        number2 = scanner.nextDouble();
        //return "Your chosen numbers are " + number1 + ", " + number2 + ".";
    }

    public static void chooseOperation() {
        System.out.print("Here you can choose an operation (+,-,*,/): ");
        char operation = scanner.next().charAt(0);
        switch (operation) {
            case '+':
                System.out.println(resultOfCalc + addition());
                break;
            case '-':
                System.out.println(resultOfCalc + subtraction());
                break;
            case '*':
                System.out.println(resultOfCalc + multiplication());
                break;
            case '/':
                System.out.println(resultOfCalc + division());
                break;
        }

    }

    public static double addition() {
        return result = number1 + number2;
    }

    public static double subtraction() {
        return result = number1 - number2;
    }

    public static double multiplication() {
        return result = number1 * number2;
    }

    public static double division() {
        return number1 / number2;
    }

    public static void continueOrExit() {
        System.out.print("Would you like to continue? (1 - yes/0 - exit): ");
        int answer = scanner.nextInt();
        if (answer == 1) {
            enterNumbers();
            chooseOperation();
            continueOrExit();
        } else if(answer == 0) {
            System.out.println("Calculator stopped!");
        }
    }
}

