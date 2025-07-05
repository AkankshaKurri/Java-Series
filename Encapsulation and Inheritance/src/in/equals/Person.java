

//🔚 Summary:
// equals() override nahi kiya	➤ super.equals() call hota hai (i.e. Object.equals())
//                              ➤ Reference compare karta hai
// equals() override kiya	➤ Aapka custom logic chalta hai (content compare)

package in.equals;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String id;

    public Person(String name,int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }

    @Override
    public boolean equals(Object obj) {
         if(!(obj instanceof Person)){
             return false;
         }else{
             Person per = (Person) obj;
             return per.name.equals(name) && per.age == age && per.id.equals(id);
         }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }
}
