//Define a class in.kgcoding.challenge82.Employee with private attributes(like name, age, and salary),
//public methods to get and set these attributes, and
//a package-private method to displayEmployeeDetails.
//Create another class in the same package to test access to the displayEmployeeDetails method.

package in.kgcoding.challenge82;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    String getEmployeeDetails(){
        return "Employee{'Name':"+name
                + ",'Age':" + age
                +",'Salary':" + salary
                +"}";
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double newSalary){
        this.salary = newSalary;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
