package exercises;

import java.util.Scanner;

public class StringTasks {

    public static void main(String[] args) {
        System.out.println("Please enter the text:");
        String text = StringTasks.readTextFromConsole();
        System.out.println("Your text: " + text);
        System.out.println("Enter the character you want to count:");
        char input = StringTasks.putChar();
        int count = StringTasks.countCharacters(text, input);
        System.out.println("Numbers of chosen character are " + count);
        System.out.println("Please enter starting number of character from 0:");
        int startingNumber = StringTasks.putStartingNumber();
        System.out.println("Please put new character:");
        char charToReplace = StringTasks.putCharacterToReplace();
        String updatedText = StringTasks.replaceCharacter(text, startingNumber, charToReplace);
        System.out.println("Text after modification: " + updatedText);
        System.out.println("Cut text:");
        System.out.println("Please enter the start index:");
        int startingIndex = StringTasks.putStartingNumber();
        System.out.println("Please enter the end index:");
        int endIndex = StringTasks.putEndNumber();
        String cutText = StringTasks.cutString(text, startingIndex, endIndex);
        System.out.println(cutText);
    }

    public static String readTextFromConsole() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }

    public static char putChar() {
        Scanner inputChar = new Scanner(System.in);
        char input = inputChar.next().charAt(0);
        return input;
    }

    public static int countCharacters(String text, char input) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == input)
                count++;
        }
        return count;
    }

    public static int putStartingNumber() {
        Scanner inputNumber = new Scanner(System.in);
        int startNumber = inputNumber.nextInt();
        return startNumber;
    }

    public static int putEndNumber() {
        Scanner inputNumber = new Scanner(System.in);
        int endNumber = inputNumber.nextInt();
        return endNumber;
    }

    public static char putCharacterToReplace() {
        Scanner inputChar = new Scanner(System.in);
        char newCharacter = inputChar.next().charAt(0);
        return newCharacter;
    }

    public static String replaceCharacter(String text, int startingNumber, char charToReplace) {
        return text.substring(0, startingNumber) + charToReplace + text.substring(startingNumber + 1);
    }

    public static String cutString(String text, int startNumber, int endNumber) {
        return text.substring(startNumber, endNumber);
    }
}



