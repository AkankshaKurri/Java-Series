//Create a class Person with attributes name and age.
//Override equals() to compare Person objects based on their attributes.
//Override hashCode() consistent with the definition of equals()

package in.kgcoding.challenge84;

import java.util.Objects;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Person)){
            return false;
        }else{
            Person per = (Person) o;
            return name.equals(per.name) && age == per.age;
        }
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
