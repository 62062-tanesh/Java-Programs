package Problem114;

public class Employee {
    private final String Name;
    private final int Salary;

    public String getName() {
        return Name;
    }

    public int getSalary() {
        return Salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public Employee(String name, int salary) {
        Name = name;
        Salary = salary;
    }
}
