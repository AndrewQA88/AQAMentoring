package exercises;

import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        System.out.println("Please enter email address:");
        String email = EmailValidator.enterEmailAddress();
        boolean endDot = EmailValidator.checkingEndDot(email);
        int atCount = EmailValidator.countingOfAt(email);
        boolean checkPrefix = EmailValidator.checkingPrefix(email);
        int countOfDotAfterAt = EmailValidator.countingDotAfterAt(email);
        EmailValidator.validationMessage(endDot, atCount, checkPrefix, countOfDotAfterAt);

    }

    public static String enterEmailAddress() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static boolean checkingEndDot(String email) {
        boolean checkEndDot;
        checkEndDot = email.endsWith(".");
        if (checkEndDot) {
            System.out.println("Warning: email ends with dot!");
        }
        return checkEndDot;
    }

    public static int countingOfAt(String email) {
        int countOfAt = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                countOfAt++;
            }
        }
        if (countOfAt != 1) {
            System.out.println("Warning: only one @ allowed!");
        }
        return countOfAt;
    }

    public static boolean checkingPrefix(String email) {
        String[] dividedEmail = email.split("@");
        boolean checkPrefix;
        checkPrefix = dividedEmail[0].isEmpty();
        if (checkPrefix) {
            System.out.println("Warning: email prefix is empty!");
        }
        return checkPrefix;
    }

    public static int countingDotAfterAt(String email) {
        String buffering = email.substring(email.indexOf('@') + 1);
        int len = buffering.length();
        int countOfDotAfterAt = 0;
        for (int i = 0; i < len; i++) {
            if (buffering.charAt(i) == '.')
                countOfDotAfterAt++;
        }
        if (countOfDotAfterAt != 1) {
            System.out.println("Warning: suffix part of email must contain one dot!");
        }
        return countOfDotAfterAt;
    }

    public static void validationMessage(boolean checkEndDot, int countOfAt, boolean checkPrefix, int countOfDotAfterAt) {
        if ((checkEndDot) || (countOfAt != 1) || (checkPrefix) || (countOfDotAfterAt != 1)) {
            System.out.println("Email address is not valid.");
        } else {
            System.out.println("Email address is valid.");
        }
    }
}


