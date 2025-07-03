package in.kgcoding.challenge82;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("ABC", 100, 10000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("PQR");
        System.out.println(emp.getEmployeeDetails());
    }
}
