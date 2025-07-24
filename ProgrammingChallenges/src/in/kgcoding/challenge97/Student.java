//Create a PriorityQueue of a custom class Student with attributes name and grade.
//Use a comparator to order by grade.

package in.kgcoding.challenge97;

public class Student {
    private final String name;
    private final char grade;

    public Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
