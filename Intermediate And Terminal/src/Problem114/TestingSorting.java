package Problem114;

import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> emp = List.of(
                new Employee("Raj", 1000),
                new Employee("Taj", 3000),
                new Employee("Aaj", 3000),
                new Employee("Tanh", 5000),
                new Employee("Tanesh", 2000)
                );
        emp.stream().sorted((emp1, emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary()))
                .forEach(System.out::println);
    }
}
