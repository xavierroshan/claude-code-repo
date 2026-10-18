import java.util.Scanner;

class bankAccount {
    int accountNumber;
    String name;
    double balance = 0;
    AccountType accountType;

    public enum AccountType {
        CHECKING,
        SAVINGS,
        DEPOSIT
    }

    public bankAccount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Account Number:");
        int accountNumber = scanner.nextInt();
        this.accountNumber = accountNumber;
        System.out.println("Enter the Name:");
        scanner.nextLine();                      // throw away the leftover "\n"
        String name = scanner.nextLine().trim().toUpperCase();
        this.name = name;
        AccountType found = null;
        while (found == null) {
            System.out.println("Enter the Account Type:");
            String input = scanner.nextLine().trim().toUpperCase();
            for (AccountType t : AccountType.values()) {
                if (t.name().equals(input)) {
                    found = t;
                }
            }
            if (found == null) {
                System.out.println("You entered the wrong value for bank account type");
            }
        }
        this.accountType = found;
        while(true) {
            System.out.println("Enter the Account balance:");
            double input = scanner.nextDouble();
            if (input >= 0){
                this.balance = input;
                break;
            }
            System.out.println("Balance caanot be negative");

        }


    }

    public void deposit(){

    }

// Alternate method - less efficient
//    public void createAccount() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the Account Number:");
//        int accountNumber = scanner.nextInt();
//        this.accountNumber = accountNumber;
//        System.out.println("Enter the Name:");
//        scanner.nextLine();                      // throw away the leftover "\n"
//        String name = scanner.nextLine().trim().toUpperCase();
//        this.name = name;
//        AccountType found = null;
//        while (found == null) {
//            System.out.println("Enter the Account Type:");
//            String input = scanner.nextLine().trim().toUpperCase();
//            for (AccountType t : AccountType.values()) {
//                if (t.name().equals(input)) {
//                    found = t;
//                }
//            }
//            if (found == null) {
//                System.out.println("You entered the wrong value for bank account type");
//            }
//        }
//        this.accountType = found;
//
//    }
}

public class bank {                              // top-level class, not nested

    public static void main(String[] args) {

        bankAccount account2 = new bankAccount();
        System.out.println(account2.name);
        System.out.println(account2.accountNumber);
        System.out.println(account2.accountType);
        System.out.println(account2.balance);


        //        //creating an object
//        bankAccount accountRoshan = new bankAccount();
//        accountRoshan.name = "Roshan";
//        accountRoshan.accountNumber = 123;
//        accountRoshan.accountType = bankAccount.AccountType.SAVINGS;
//        System.out.println(accountRoshan.name);
//        System.out.println(accountRoshan.accountNumber);
//        System.out.println(accountRoshan.accountType);
    }
}
