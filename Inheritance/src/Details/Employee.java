package Details;

public class Employee {
    private String name;
    private int age;
    private float salary;
    Employee(String name, int age, float salary){
        this.name = name;
        this.age = age;
        this.salary = salary;

    }
    public void setName(String name){
        this.name =  name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void getSalary(float salary) {
        this.salary = salary;
    }

    void EmployeeDetails(){
        System.out.println("The Name is: "+name);
        System.out.println("The Age is: "+age);
        System.out.println("The Salary is: "+salary);
    }
}
