package employees;

public class MainEmployee {

    public static void main(String[] args) {


        WageEmployee we1 = new WageEmployee(123, "John", 23, 35.5, 40);
        WageEmployee we2 = new WageEmployee(124, "Jane", 32, 40.5, 40);
        SalaryEmployee se1 = new SalaryEmployee(125, "Jacob", 33, 10000);
        SalaryEmployee se2 = new SalaryEmployee(126, "Janett", 27, 12000);
        Manager m1 = new Manager(127, "Bob", 45, 15000, 0.3);
        Manager m2 = new Manager(128, "Dave", 49, 18000, 0.2);

        Employee[] employees = new Employee[10];
        employees[0] = we1;
        employees[1] = we2;
        employees[2] = se1;
        employees[3] = se2;
        employees[4] = m1;
        employees[5] = m2;

        print(employees);

    }

    public static void print(Employee[] e){
        for (int i= 0; e[i] != null; i++){
            System.out.println("Employee" + (i+1) + " " + e[i].calcSalary());
        }
    }
}
