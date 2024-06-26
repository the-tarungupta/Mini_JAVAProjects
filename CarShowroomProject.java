import java.sql.SQLOutput;
import java.util.Scanner;

interface utility{
    void setValues();
    void getValues();
}

class Showroom implements utility {
    String name;
    String loc;
    String manager;
    int noOfEmployee;
    int noOfCars ;

    @Override
    public void setValues() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Showroom name : ");
        name = sc.nextLine();
        System.out.println("Enter Showroom location : ");
        loc = sc.nextLine();
        System.out.println("Showroom Manager : ");
        manager = sc.nextLine();
        System.out.println("No. of Employees : ");
        noOfEmployee = sc.nextInt();
        System.out.println("No. of Cars");
        noOfCars = sc.nextInt();
    }
        @Override
        public void getValues() {
            System.out.println("Showroom name - " + name);
            System.out.println("Showroom location - " + loc);
            System.out.println("Manager - " + manager);
            System.out.println("No. of employees - " + noOfEmployee);
            System.out.println("No. of cars - " + noOfCars);
        }
}


class Employees extends Showroom implements utility {
    String id;
    String dept;
    String phone;

    @Override
    public void setValues() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter employee name : ");
        this.name = obj.nextLine();
        System.out.println("Enter employee id : ");
        id = obj.nextLine();
        System.out.println("Enter employee department : ");
        dept = obj.nextLine();
        System.out.println("Enter employee phone no. : ");
        phone = obj.nextLine();
    }

    @Override
    public void getValues() {
        System.out.println("Employee name - " + this.name);
        System.out.println("Employee id - " + id);
        System.out.println("Employee department- " + dept);
        System.out.println("Employee phone no.  - " +phone );
    }

}

class Cars extends Showroom implements utility{
    String brand;
    float price;
    String color;
    String fuelType;
    String trans;

    @Override
    public void setValues() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Car brand : ");
        brand = in.nextLine();
        System.out.println("Enter car name : ");
        this.name = in.nextLine();
        System.out.println("Enter car color : ");
        color = in.nextLine();
        System.out.println("Enter car fuel type : ");
        fuelType = in.nextLine();
        System.out.println("Enter car transmission : ");
        trans = in.nextLine();
        System.out.println("Enter car price : ");
        price = in.nextFloat();

        noOfCars++;
    }

    @Override
    public void getValues() {
        System.out.println("car brand - "+brand);
        System.out.println("car name - "+this.name);
        System.out.println("car price - "+price);
        System.out.println("car color - "+color);
        System.out.println("car fuelType - "+fuelType);
        System.out.println("car transmission - "+trans);
    }
}
public class CarShowroomProject {
    public static void mainMenu(){

        System.out.println();
        System.out.println("                                 WELCOME TO CAR SHOWROOM              ");
        System.out.println();
        System.out.println("Here are your Options : ");
        System.out.println();
        System.out.println("1. Add Showroom               2. Add Employee                    3. Add Cars" );
        System.out.println("4. Existing Showroom          5. Existing Employees             6. Existing Cars" );
        System.out.println();
        System.out.println("Enter 0 to Exit");
        System.out.println();
        System.out.print("Enter your choice : ");

    }
    public static void main(String[] args) {
        Showroom s = new Showroom();
        Employees e = new Employees();
        Cars c = new Cars();
        Scanner sc = new Scanner(System.in);
        mainMenu();
        int in = sc.nextInt();
        while(in!=0) {
            switch (in) {
                case 1:
                    s.setValues();
                    System.out.println("Showroom Added Successfully");
                    System.out.println();
                    System.out.println("1]. To add showroom ");
                    System.out.println("9]. To main menu");
                    in = sc.nextInt();
                    break;
                case 2:
                    e.setValues();
                    System.out.println("Employee Added Successfully");
                    System.out.println();
                    System.out.println("2]. To add employee ");
                    System.out.println("9]. To main menu");
                    in = sc.nextInt();
                    break;
                case 3:
                    c.setValues();
                    System.out.println("Cars Added Successfully");
                    System.out.println();
                    System.out.println("3]. To add cars ");
                    System.out.println("9]. To main menu");
                    in = sc.nextInt();
                    break;
                case 4:
                    s.getValues();
                    System.out.println("                    Showrooms Checked  ");
                    System.out.println();
                    System.out.println("9]. To main menu");
                    System.out.println("0]. To exit");
                    in = sc.nextInt();
                    break;
                case 5:
                    e.getValues();
                    System.out.println("            Employees Checked ");
                    System.out.println();
                    System.out.println("9]. To main menu");
                    System.out.println("0]. To exit");
                    in = sc.nextInt();
                    break;
                case 6:
                    c.getValues();
                    System.out.println("                Cars Checked ");
                    System.out.println();
                    System.out.println("9]. To main menu");
                    System.out.println("0]. To exit");
                    in = sc.nextInt();
                    break;
                case 9:
                    while (in == 9) {
                        mainMenu();
                        in = sc.nextInt();
                    }
                    break;
                default:
                    System.out.println("Wrong Choice , Try again !");
                    mainMenu();
                    in = sc.nextInt();

            }
        }


    }
}
