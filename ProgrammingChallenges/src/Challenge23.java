//Create a program that categorize a person into different age groups
//Child -> below 13
//Teen -> below 20
//Adult ->  below 60
//Senior -> above 60

import java.util.Scanner;

public class Challenge23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();
        if(age<=13){
            System.out.println("Child");
        }
        else if(age <= 20){
            System.out.println("Teen");
        }
        else if(age <= 60){
            System.out.println("Adult");
        }
        else{
            System.out.println("Senior");
        }
    }
}
