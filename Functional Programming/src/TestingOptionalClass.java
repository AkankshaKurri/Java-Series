
//Optional Class
//Normal variable me value ho bhi sakti hai aur null bhi.

//Optional ek wrapper hai jo kehta hai:
//"Mere andar value ho bhi sakti hai ya nahi bhi. Pehle check karke use kar."

//Java ka Optional class ek container hai jo value ko hold kar sakta hai ya khaali (null) ho sakta hai.
//Ye mainly NullPointerException se bachne ke liye use hota hai.

//Description:
//1. Creating Optional Objects: Optional.empty(),Optional.of(), Optional.ofNullable()
//2.Checking Value Presence: isPresent() and ifPresent()
//3.Default Values: orElse() and orElseGet()
//4.Value Transformation: map()
//5.Throwing Exception: orElseThrow()

import java.util.List;
import java.util.Optional;

public class TestingOptionalClass {
    public static void main(String[] args) {
        List<Integer> numbers = List.of();
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        if (sum.isPresent()) {
            System.out.println(sum.get());
        }
        else{
            System.out.println("List is Empty");
        }

        //Creating Optional objects.
        Optional<String> optionalEmpty = Optional.empty();
        Optional<String> optionalOf = Optional.of("Java");
        Optional<String> optionalNullable = Optional.ofNullable(null);

        //Checking presence of value
        //Matlab agar value rahega toh true return hoga.
        //And ".get()" se value access hoga.

        if(optionalOf.isPresent()){
            System.out.println("Value is Present:"+ optionalOf.get());
        }

        //Using orElse to provide a fallback
        //Matlab agar value empty rahega uske badle "orElse" mei jo value diya jaayega woh print hoga.
        String orElseExample = optionalEmpty.orElse("Default Value");
        System.out.println("Using orElse:" + orElseExample);

        //Using ifPresent to perform action if value is present.
        optionalOf.ifPresent(System.out::println);
    }
}
