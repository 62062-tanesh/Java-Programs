class Course {
    static int maxCapacity =  10;
    String courseName;
    int enrollments;
    String [] enrolledStudents;

    public static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }
    Course(String courseName){
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String [maxCapacity];


    }

    public void enrolledStudents(String StudentName){
        enrolledStudents[enrollments] = StudentName;
        enrollments++;
    }
    public void unenrolledStudents(String StudentName){
        System.out.println("Student Removed");
        enrollments--;
    }




    public static void main(String[] args) {

    }
}
