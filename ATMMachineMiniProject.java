import java.util.Scanner;

class ATM{
    double balance ;
    int Pin=4327;

//    public void checkPin(){                                             ----- checkPIN method
//        System.out.println("Enter your 4-digit PIN :");
//        Scanner sc = new Scanner(System.in);
//        int inputPin = sc.nextInt();
//
//        if(inputPin==Pin){
//            menu();
//        }
//        else{
//            System.out.println("Invalid PIN , Try again !");
//            checkPin();
//        }
//    }

    ATM(int Pin){                                                                   // ----- used constructor
        System.out.println("Enter your 4-digit PIN : ");
        Scanner sc = new Scanner(System.in);
        int inputPin = sc.nextInt();

        if(inputPin==Pin){
            menu();
        }
        else{
            System.out.println("Invalid pin , Try again !");
            new ATM(Pin);
        }
    }

    public void menu(){
        System.out.println("Enter your choice : ");
        System.out.println("1. A/C Balance ");
        System.out.println("2. Withdraw Money ");
        System.out.println("3. Deposit Money ");
        System.out.println("4. Exit ");

        Scanner obj = new Scanner(System.in);
        int choice = obj.nextInt();
        switch (choice){
            case 1 :
                checkBalance();
                break;
            case 2 :
                withdrawMoney();
                break;
            case 3 :
                depositMoney();
                break;
            case 4 :
                break;
            default:
                System.out.println("invalid choice ");
                menu();
        }
    }

    public void checkBalance(){
        System.out.println("Your current balance : "+balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter withdrawal amount : ");
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();

        if (amount > balance) {
            System.out.println("Insufficient Balance");
            menu();
        }
        else{
            balance -= amount;
            System.out.println("Money Withdrawal Successfully");
            menu();
        }
    }

    public void depositMoney(){
        System.out.println("Enter amount to deposit : ");
        Scanner sv = new Scanner(System.in);
        int amount = sv.nextInt();

        balance += amount;
        System.out.println("Money Deposited Successfully !");
        menu();
    }
}

public class ATMMachineMiniProject {
    public static void main(String[] args) {

        ATM a1 = new ATM(4327);
//        a1.checkPin();

    }
}

