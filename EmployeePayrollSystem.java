import java.util.ArrayList;

abstract class Employee {
    int ID;
    String name;
    String dept;
    float salary;

    Employee(int ID, String name, String dept) {
        this.ID = ID;
        this.name = name;
        this.dept = dept;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    abstract public float getSalary();

    public String toString() {
        return "Employee [" + " ID : " + getID() + " , Name : " + getName() + " , Department : " + getDept() + " , Salary : " + getSalary() + " ]";
    }
}


class FullTimeEmployee extends Employee {
    FullTimeEmployee(int ID, String name, String dept, float salary) {
        super(ID, name, dept);
        this.salary = salary;
    }

    @Override
    public float getSalary() {
        return salary;
    }
}


class PartTimeEmployee extends Employee {
    int daysWork;
    int stipend;

    PartTimeEmployee(int ID, String name, String dept, int daysWork, int stipend) {
        super(ID, name, dept);
        this.daysWork = daysWork;
        this.stipend = stipend;
    }

    @Override
    public float getSalary() {
        salary = stipend * daysWork;
        return salary;
    }
}


class Payroll {
    ArrayList<Employee> arr;

    Payroll() {
        arr = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        arr.add(emp);
    }

    public void displayEmployee() {
        System.out.println("All Employee listed below : ");
        for (Employee emp : arr) {
            System.out.println(emp);
        }
        System.out.println();

    }

    public void removeEmployee(int ID) {
        Employee removeEmp = null;
        for (Employee emp : arr) {
            if (emp.getID() == ID) {
                removeEmp = emp;
                break;
            }
        }
        if (removeEmp != null) {
            arr.remove(removeEmp);
        }
    }


}

public class EmployeePayrollSystem {

    public static void main(String[] args) {

        Payroll obj = new Payroll();

        FullTimeEmployee f1 = new FullTimeEmployee(11, "Tripti", "Manager", 56000);
        PartTimeEmployee p1 = new PartTimeEmployee(21, "Devesh", "Director", 60 , 1200);
        FullTimeEmployee f2 = new FullTimeEmployee(31, "Rohit", "Sales", 35000);

        obj.addEmployee(f1);
        System.out.println("Employee Added Successfully\n");
        obj.addEmployee(p1);
        obj.displayEmployee();

        obj.removeEmployee(21);
        System.out.println("Employee Removed Successfully\n");

        obj.displayEmployee();

    }
}