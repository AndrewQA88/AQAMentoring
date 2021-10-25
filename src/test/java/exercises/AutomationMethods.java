package exercises;

public class AutomationMethods {

    public static int bankAccount = 0;

    public static void main(String[] args) {
        AutomationMethods.checkTransactionCapacity(900);
        System.out.println("Balance before transaction is " + bankAccount + ".");
        int transaction = AutomationMethods.addCash(900);
        bankAccount += transaction;
        System.out.println("Balance after transaction is " + bankAccount + ".");
    }

    public static void checkTransactionCapacity(int cash) {
        if (cash <= 0) {
            System.out.println("Minimal amount of money for transaction is 1$.");
        } else if (cash > 10000) {
            System.out.println("Maximum amount of money for transaction is 10000$.");
        } else {
            System.out.println("Transaction allowed!");
        }
    }

    public static int addCash(int cash) {
        if (cash < 0 || cash > 10000) {
            System.out.println("Invalid amount of transaction " + cash + ". Please check amount with 'checkTransactionCapacity' option.");
            return bankAccount;
        }
        return cash;
    }

}
