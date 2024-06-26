import java.util.ArrayList;

abstract class Employee{
    private String name;
    private int id;

    public Employee(String name , int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    abstract public double calculateSalary();

    @Override
    public String toString(){
        return "Employee "+getId()+" [ name : "+getName()+" id : "+getId()+" salary : "+calculateSalary()+" ]";
    }
}

class FullTimeEmployee extends Employee{
    private double monthlySalary;

    public FullTimeEmployee(String name , int id , double monthlySalary){
        super(name , id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hoursRate;

    public PartTimeEmployee(String name , int id , int hoursWorked , double hoursRate){
        super(name , id);
        this.hoursWorked = hoursWorked;
        this.hoursRate = hoursRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hoursRate;
    }
}

class Payroll{
    ArrayList <Employee> arr ;
    public Payroll(){
        arr = new ArrayList<>();
    }

    public void addEmployee(Employee emp){
        arr.add(emp);
    }

    public void removeEmployee(int id){
        Employee removeEmployee = null;
        for(Employee emp : arr){
            if(emp.getId()==id){
                removeEmployee = emp;
                break;
            }
        }
        if(removeEmployee != null){
            arr.remove(removeEmployee);
        }
    }

    public void displayEmployees(){
        for(Employee emp : arr){
            System.out.println(emp);
        }
    }
}


public class EmployeePayrollSystem {
    public static void main(String[] args) {

        Payroll obj = new Payroll();
        FullTimeEmployee emp1 = new FullTimeEmployee("Shruti ",1,40000);
        FullTimeEmployee emp2 = new FullTimeEmployee("Mukul",2,50000);
        PartTimeEmployee emp3 = new PartTimeEmployee("Piyush",3,50,80);

        obj.addEmployee(emp1);
        obj.addEmployee(emp2);
        obj.addEmployee(emp3);

        System.out.println("                    Display Employees ");
        obj.displayEmployees();

        System.out.println("                    Removing Employee ");
        obj.removeEmployee(2);

        System.out.println("                    Remaining Employees ");
        obj.displayEmployees();

    }
}
