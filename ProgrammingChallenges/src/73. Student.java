//Define a Student class with fields like name and age,and use
//toString to print student details.

class Student {
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student details: {"
                   +"name: " + name
                   + ", Age: " + age
                + " }";
    }

    public static void main(String[] args) {
        Student student1 = new Student("Akanksha", 100);
        System.out.println(student1);
    }
}