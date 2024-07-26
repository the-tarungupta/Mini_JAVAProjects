import java.util.Scanner;

class ATM{
    int PIN = 9980;
    float bal;
    int chance=0;

    public void checkPIN(){
        if(chance<3) {
            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter 4-digit PIN : ");
            int userPIN = sc.nextInt();
            chance++;

            if(userPIN == PIN){
                mainMenu();
            }
            else{
                System.out.println("\"Invalid PIN ! Try Again\"");
                System.out.println("Attempts Remaining : "+(3-chance));
                checkPIN();
            }
        }
        else{
            System.out.println("\"Your attempts finished ! Card gets blocked\" ");
        }


    }

    public void mainMenu(){
        System.out.println("\nMain Menu : \n");
        System.out.println("1]. Check Balance                     2]. Deposit Money");
        System.out.println("3]. Withdraw Money                4]. Change PIN");

        System.out.println("0]. To Exit");
        System.out.print("\nEnter your choice : ");
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();

        if(in==1){
            checkBalance();
        }
        else if(in==2){
            depositMoney();
        }
        else if(in==3){
            withdrawMoney();
        }
        else if(in==4){
            changePIN();
        }
    }

    public void checkBalance(){
        System.out.println("\nCurrent Balance : "+bal);

        System.out.println("\n2]. Deposit Money               3]. Withdraw Money");
        System.out.println("9]. Main Menu                     0]. To Exit");
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();

        if(in==9){
            mainMenu();
        }
        else if(in==2){
            depositMoney();
        }
        else if(in==3){
            withdrawMoney();
        }
    }

    public void depositMoney(){
        System.out.print("\nEnter amount to deposit : ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        bal += amount;
        System.out.println("\"Amount Deposited Successfully\"");

        System.out.println("\n1]. Check Balance              3]. Withdraw Money");
        System.out.println("9]. Main Menu                   0]. To Exit");
        int in = sc.nextInt();

        if(in==9){
            mainMenu();
        }
        else if(in==1){
            checkBalance();
        }
        else if(in==3){
            withdrawMoney();
        }
    }

    public void withdrawMoney(){
        System.out.print("\nEnter amount to withdraw : ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        if(amount > bal){
            System.out.println("\"Insufficient Balance\"");
        }
        else{
            bal -= amount;
            System.out.println("\"Amount Withdrawal Successfully\"");
        }

        System.out.println("\n1]. Check Balance                 2]. Deposit Money");
        System.out.println("9]. Main Menu                      0]. To Exit");
        int in = sc.nextInt();

        if(in==9){
            mainMenu();
        }
        else if(in==1){
            checkBalance();
        }
        else if(in==2){
            depositMoney();
        }
    }

    public void changePIN(){
        System.out.print("\nEnter new 4-digit PIN : ");
        Scanner sc = new Scanner(System.in);
        int newPIN = sc.nextInt();

        PIN = newPIN;

        System.out.println("\"PIN changed successfully\"");

        checkPIN();
    }
}

public class ATM_Machine_Project {
    public static void main(String[] args) {
        ATM a1 = new ATM();
        a1.checkPIN();

    }
}
