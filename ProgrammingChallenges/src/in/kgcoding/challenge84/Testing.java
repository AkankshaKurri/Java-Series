package in.kgcoding.challenge84;

public class Testing {
    public static void main(String[] args) {
        Person person1 = new Person("Akanksha", 20);
        Person person2 = new Person("Akanksha", 20);
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

//        🔁 == Operator
//        Checks: whether two references point to the same object in memory.
//        Compares: memory addresses (not the content).

        //Returns not equal
//        if(person1 == person2){
//            System.out.println("Equal");
//        }else{
//            System.out.println("Not equal");
//        }

        // ✅ equals() Method
//        Checks: whether two objects are logically equal.
//        Compares: content/data inside the objects (if overridden).
//        Comes from Object class, but should be overridden to compare actual data.

        //Returns not equal if not overridden
//        if(person1.equals(person2)){
//            System.out.println("Equal");
//        }else{
//            System.out.println("Not equal");
//        }

        //Returns equal after overriding equals() and hashcode()
        if(person1.equals(person2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
    }
}
