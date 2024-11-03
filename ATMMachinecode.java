package ATMMachinecode;
import java.util.Scanner;

class ATM {
    float Balance;
    int PIN = 5674;

    public void checkpin() {
        System.out.println("Enter your pin:");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == PIN) {
            menu();
        } else {
            System.out.println("Enter a valid pin");
        }
    }

    public void menu() {
        System.out.println("Enter your choice");
        System.out.println("1.Check Account Balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                checkBalance();
                break;
            case 2:
                withdrawMoney();
                break;
            case 3:
                depositMoney();
                break;
            case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                return;
            default:
                System.out.println("Enter a valid option");
                menu();
                break;
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + Balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient Balance");
        } else {
            Balance -= amount;
            System.out.println("Money withdrawal successful");
        }
        menu();
    }

    public void depositMoney() {
        System.out.println("Enter the amount to deposit:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance += amount;
        System.out.println("Money Deposit Successful");
        menu();
    }
}

public class ATMMachinecode {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}
