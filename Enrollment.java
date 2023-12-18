// Enrollment.java

public class Enrollment {
    private int enrollmentId;
    private Student student;
    private Course course;
    private char grade;

    public Enrollment(int enrollmentId, Student student, Course course, char grade) {
        this.enrollmentId = enrollmentId;
        this.student = student;
        this.course = course;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Enrollment ID: " + enrollmentId);
        student.displayInfo();
        course.displayInfo();
        System.out.println("Grade: " + grade);
    }
}
