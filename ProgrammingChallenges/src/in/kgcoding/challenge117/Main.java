//Create a list of employees with name and salary fields.
//Write a comparator that sorts the employees by salary.
//Then us this comparator to sort your list using the sort stream operation.


package ProgrammingChallenges.src.in.kgcoding.challenge117;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("ABC",50000),
                new Employee("ABC",220000),
                new Employee("ABC",30000)
        );

        //One way
        employees.stream()
                .sorted((emp1,emp2) -> Integer.compare(emp1.getSalary() ,emp2.getSalary()))
                .forEach(System.out::println);

        //Another way
        employees.stream()
                .sorted((emp1,emp2) -> emp1.getSalary() - emp2.getSalary())
                .forEach(System.out::println);

        //Another way
        employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary))
                .forEach(System.out::println);
    }
}
