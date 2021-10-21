package exercises;

import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you email address:");
        String email = scanner.next();

        boolean checkEndDot;
        checkEndDot = email.endsWith(".");

        int countOfAt = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                countOfAt++;
            }
        }
        String[] dividedEmail = email.split("@");

        boolean checkPrefix;
        checkPrefix = dividedEmail[0].isEmpty();

        String buffering = email.substring(email.indexOf('@') + 1);
        int len = buffering.length();
        int countOfDotAfterAt = 0;
        for (int i = 0; i < len; i++) {
            if (buffering.charAt(i) == '.')
                countOfDotAfterAt++;
        }

        if ((checkEndDot) || (countOfAt != 1) || (checkPrefix) || (countOfDotAfterAt != 1)) {
            System.out.println("Email address is not valid");
        } else {
            System.out.println("Email address is valid");
        }
    }
}