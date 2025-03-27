import java.util.Arrays; // Correct package name for sorting

class Student {
    protected String name;
    protected int id;
    protected int marks;

    public Student(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Student name: " + name + 
                           ", Student ID: " + id + 
                           ", Student marks: " + marks);
    }
}

class Main {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Dhruv", 18, 97),
            new Student("Narendra", 18, 99),
            new Student("Viral", 18, 98)
        };

        // Sorting by marks in ascending order
        Arrays.sort(students, (a, b) -> a.marks - b.marks);

        // Display sorted students
        for (Student student : students) {
            student.display();
        }
    }
}