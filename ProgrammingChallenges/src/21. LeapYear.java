//Create a program that determines if a given year is a leap year
// (considering conditions like divisible by 4 but not 100, unless also divisible by 400)

import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any year:");
        int year = scanner.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a Leap year");
        }
    }
}
