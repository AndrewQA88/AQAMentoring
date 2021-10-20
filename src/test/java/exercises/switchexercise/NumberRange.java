package exercises.switchexercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberRange {

    public void printNumberWithElseIf() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value from 1 to 10");
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: please enter digit value.");
        }
        if (number < 1 || number > 10) {
            System.out.println("Error: number is out of range.");
        }
        if (number == 1) {
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else if (number == 3) {
            System.out.println("Three");
        } else if (number == 4) {
            System.out.println("Four");
        } else if (number == 5) {
            System.out.println("Five");
        } else if (number == 6) {
            System.out.println("Six");
        } else if (number == 7) {
            System.out.println("Seven");
        } else if (number == 8) {
            System.out.println("Eight");
        } else if (number == 9) {
            System.out.println("Nine");
        } else if (number == 10) {
            System.out.println("Ten");
        }
    }

    public void printNumberWithSwitch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value from 1 to 10");
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: please enter digit value.");
        }
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            default:
                System.out.println("Error: number is out of range.");
        }
    }
}
