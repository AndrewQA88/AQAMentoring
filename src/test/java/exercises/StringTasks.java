package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringTasks {

    public static void main(String[] args) {

        System.out.println("Please enter the text:");
        String text = StringTasks.readTextFromConsole();
        System.out.println("Your text: " + text);
        System.out.println("Enter the character you want to count:");
        char input = StringTasks.readChar();
        int count = StringTasks.countCharacters(text, input);
        System.out.println("Numbers of chosen character are " + count);
        System.out.println("Please enter character you want to replace:");
        char currentChar = StringTasks.readChar();
        System.out.println("Please enter new character:");
        char newChar = StringTasks.readChar();
        String updatedText = StringTasks.replaceCharacter(text, currentChar, newChar);
        System.out.println("Text after update: " + updatedText);
        System.out.println("Enter the character you want to cut from/to:");
        char cutChar = StringTasks.readChar();
        String cutText = StringTasks.cutText(text, cutChar);
        System.out.println(cutText);
    }

    public static String readTextFromConsole() {
        return new Scanner(System.in).nextLine();
    }

    public static char readChar() {
        return new Scanner(System.in).next().charAt(0);
    }

    public static int countCharacters(String text, char input) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == input)
                count++;
        }
        return count;
    }

    public static String replaceCharacter(String text, char currentChar, char newChar) {
        return text.replace(currentChar, newChar);
    }

    public static String cutText(String text, char input) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == input) {
                list.add(i);
            }
        }
        int from = list.get(0);
        int to = list.get(list.size() - 1);
        return text.substring(from, to + 1);
    }
}



