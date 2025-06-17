import java.util.Scanner;

public class LearningIf {
    public static void main(String[] args) {
        boolean isMale;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Please enter your gender- M for Male  and F for Female");
        String gender = scanner.nextLine();
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();

        if(age >= 18  && age <= 50){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are Senior Citizen");
        }

        if(gender.equalsIgnoreCase("M")){
            isMale = true;
        }
        else{
            isMale = false;
        }

        if(isMale){
            System.out.println("Hello Mr." + name);
        }
        else{
            System.out.println("Hello Ms." + name);
        }

        // Nested if
        boolean isSeniorCitizen = false;
        boolean isAnAdult = true;

        if(isSeniorCitizen){
            System.out.println("Hello Senior Citizen");
        }else{
            if(isAnAdult){
                System.out.println("Hello Adult");
            }
            else{
                System.out.println("Hello Child");
            }
        }

        // If, else if , else
        if(isSeniorCitizen){
            System.out.println("Hello Senior Citizen");
        }else if(isAnAdult){
            System.out.println("Hello Adult");
        }else{
            System.out.println("Hello Child");
        }
    }
}
