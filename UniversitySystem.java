// UniversitySystem.java

public class UniversitySystem {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student(1, "Alice", 18);
        Student student2 = new Student(2, "Bob", 20);

        // Create courses
        Course course1 = new Course(101, "Introduction to Java", 3);
        Course course2 = new Course(102, "Advanced Java Programming", 4);

        // Create enrollments
        Enrollment enrollment1 = new Enrollment(1001, student1, course1, 'A');
        Enrollment enrollment2 = new Enrollment(1002, student2, course2, 'B');

        // Display information
        System.out.println("Enrollment Information:");
        enrollment1.displayInfo();
        System.out.println();
        enrollment2.displayInfo();
    }
}
