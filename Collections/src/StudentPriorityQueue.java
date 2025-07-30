import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> queue =  new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getGrade() - s2.getGrade();
            }
        });
        queue.offer(new Student("Tanesh",'A'));
        queue.offer(new Student("Raj",'C'));
        queue.offer(new Student("Tum",'E'));
        queue.offer(new Student("Kyun",'A'));
        queue.offer(new Student("What",'B'));
        System.out.println("Queue Is: "+ queue);
        System.out.println("Got "+ queue.poll());
        System.out.println("Got "+ queue.poll());
        System.out.println("Got "+ queue.poll());
        System.out.println("Got "+ queue.poll());
        System.out.println("Got "+ queue.poll());
    }

    private static class Student {
        private final String Name;
        private final char Grade;
        Student(String Name, char Grade){
            this.Name = Name;
            this.Grade = Grade;
        }

        public String getName() {
            return Name;
        }

        public char getGrade() {
            return Grade;
        }

        @Override
        public String toString() {
            return Name + ": "+Grade;
        }
    }


}
