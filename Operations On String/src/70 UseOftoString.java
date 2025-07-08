
class Student{
    String name;
    int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String [] args){
        Student student1 = new Student("Tanesh", 21);
        System.out.println(student1);
    }

    @Override
    public String toString() {
        return "Student Details:\nName: "+name+ "\nage : "+age+" ";
    }
}
class UseOftoString {
//    public static void main(String[] args) {}
}
