import java.util.Scanner;

class ATMx{
    int PIN = 7654;
    float balance;

    public void checkPIN(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4-digit Pin : ");
        int pin = sc.nextInt();

        if(pin == PIN){
            mainMenu();
        }
        else{
            System.out.println("Invalid Pin Try again !");
            checkPIN();
        }
    }

    public void mainMenu(){
        System.out.println("\nSelect from Main Menu : \n");
        System.out.println("1]. Balance Enquiry         2]. Deposit Money");
        System.out.println("3]. Withdraw Money       4]. Change PIN");
        System.out.println("Enter 0]. to get Exit");

        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();

        switch(in){
            case 1: balanceEnquiry();
                        break;
            case 2: depositMoney();
                        break;
            case 3: withdrawMoney();
                        break;
            case 4: changePIN();
                        break;
            case 0:
                        break;
            default:
                System.out.println("Invalid choice ");
                mainMenu();
                break;
        }
    }

    public void balanceEnquiry(){
        System.out.println("\nYour current balance : "+balance);
        System.out.println();
        mainMenu();
    }

    public void depositMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter amount to deposit : ");
        int amount = sc.nextInt();
        balance += amount;
        System.out.println("Money deposited successfully\n");
        mainMenu();
    }

    public void withdrawMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter withdrawal amount : ");
        int amount = sc.nextInt();
        if(amount>balance){
            System.out.println("\nInsufficient balance in your a/c");
            mainMenu();
        }
        else {
            balance -= amount;
            System.out.println("Money withdrawal successfully\n");
            mainMenu();
        }
    }

    public void changePIN(){
        Scanner sc = new Scanner(System.in);
        System.out.println("To confirm , enter your current Pin : ");
        int pin = sc.nextInt();
        if(pin == PIN){
            System.out.println("\nEnter your new Pin : ");
            int var = sc.nextInt();
            PIN = var;
            checkPIN();
        }
        else{
            System.out.println("\nInvalid Pin");
            changePIN();
        }
    }
}

public class ATMMachine{
    public static void main(String[] args){

        ATMx obj = new ATMx();
        obj.checkPIN();
    }
}