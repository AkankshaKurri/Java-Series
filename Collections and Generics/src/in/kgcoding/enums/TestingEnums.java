//1. Enums in Java:Special types for fixed sets of constants like days, colors.
//2. Declaration: Use enum keyword, e.g., enum Color{ RED,GREEN,BLUE;}
//3. Access: Access constants with dot syntax, e.g., Color.RED.
//4. Features: Type-safe, readable, can have methods and fields.
//5. Usage: Useful in switch statements and iterating with values() method

package in.kgcoding.enums;

public class TestingEnums {
    public static void main(String[] args) {
        TrafficLight redColor = TrafficLight.RED;
        TrafficLight greenColor = TrafficLight.GREEN;
        TrafficLight yellowColor = TrafficLight.YELLOW;

        // Printing enum constants
        System.out.println("Red Light: " + redColor);
        System.out.println("Green Light: " + greenColor);
        System.out.println("Yellow Light: " + yellowColor);

        // Access Grade enum
        Grade grade = Grade.A;

        // valueOf() method: converts String to enum constant
        Grade grade1 = Grade.valueOf("A");

        for(Grade value : Grade.values()){
            System.out.println(value);
        }

        //values() is a built-in method provided by Java for all enums.
        //It returns an array of all enum constants.

        //TrafficLight.values() returns:
        //[TrafficLight.RED, TrafficLight.GREEN, TrafficLight.YELLOW]
        //So we are looping through all TrafficLight constants one by one and assigning them to the variable light.

        //TrafficLight light;
        //It means:
        //“Create a variable named light that can hold a value from the TrafficLight enum.”

        for (TrafficLight light : TrafficLight.values()){
            System.out.printf("%s means %s\n", light, light.getAction());
        }

        //Using switch case
        printMessageBasedOnTrafficLight(TrafficLight.RED);
        printMessageBasedOnTrafficLight(TrafficLight.YELLOW);
        printMessageBasedOnTrafficLight(TrafficLight.GREEN);

    }

   // ✅ Switch-case with enum
    public static void printMessageBasedOnTrafficLight(TrafficLight light){
        switch(light){
            case RED:
                System.out.println("Stop");
                break;
            case YELLOW:
                System.out.println("Caution");
                break;
            case GREEN:
                System.out.println("Go");
                break;
        }
    }
}

