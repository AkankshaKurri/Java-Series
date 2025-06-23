//Design a Course class
//Instance variables: courseName, enrolledStudents
//Static variable: maxCapacity, the maximum number of students for any course.
//Instance methods: enrollStudent(String studentName),
//                    unenrollStudent(String studentName).
//Static method: setMaxCapacity(int capacity), to set the maximum capacity for courses

class Course {

    static int maxCapacity;
    String courseName;
    int studentCount = 0;
    String[] enrolledStudents;

    // Static block: sets default max capacity
    static{
        maxCapacity = 100;
    }


    // Constructor: initializes course and array
    Course(String courseName){
        this.courseName = courseName;
        enrolledStudents= new String[maxCapacity];
    }

    // Static method to set maximum capacity (only before creating courses)
    static void setMaxCapacity(int capacity){
        Course.maxCapacity = capacity;
    }

    //Enroll Student
    void enrollStudent(String studentName){
        if (studentCount >= maxCapacity){
            System.out.println("Cannot enroll student.The "+ this.courseName + " is full");
        }
        else{
            enrolledStudents[studentCount] = studentName;
            studentCount++;
            System.out.println(studentName + " is successfully enrolled");
        }
    }

    //UnEnroll Student
    void unenrollStudent(String studentName){
        int i = 0;
        boolean found = false;
        while(i < studentCount){
            if(enrolledStudents[i].equals(studentName)){
                int j = i;
                while(j < studentCount - 1){
                    enrolledStudents[j] = enrolledStudents[j+1];
                    j++;
                }
                enrolledStudents[studentCount - 1] = null;
                studentCount--;
                found = true;
                System.out.println(studentName + " is successfully unenrolled");
                break;
            }
            i++;
        }

        if(!found){
            System.out.println(studentName + " is not found");
        }
    }

    public static void main(String[] args) {
        Course.setMaxCapacity(3);
        Course course1 = new Course("BSCIT");
        course1.enrollStudent("A");
        course1.enrollStudent("B");
        course1.enrollStudent("C");
        course1.enrollStudent("D");
        course1.unenrollStudent("C");
        course1.enrollStudent("D");
        course1.unenrollStudent("E");

    }

}
