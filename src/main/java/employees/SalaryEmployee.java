package employees;

public class SalaryEmployee extends Employee{

    private double salary;

    public SalaryEmployee(int id, String name, int age, double salary) {
        super(id, name, age);
        if(salary < minSalary) {
            this.salary = minSalary;
        } else {
            this.salary = salary;
        }
    }
//   private double salary1 = minSalary;
//
//    public SalaryEmployee  (int id, String name, int age, double salary) {
//        super(id, name, age);
//        if(salary1 >minSalary)
//            this.salary = salary;
//
//    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double calcSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + " " + salary;
    }
}
