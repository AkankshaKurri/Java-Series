//Create a program to Based on a Student's score,
// categorize as "High", "Moderate", "Low" using the ternary operator
//(e.g., High for scores > 80, Moderate for 50-80, Low for < 50.


import java.util.Scanner;

class StudentScoreTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the students score:");
        int score = scanner.nextInt();
        String category = score > 80 ? "High" : (score>50 ? "Moderate" : "Low");
        System.out.println("Your category is:" + category);

    }
}
