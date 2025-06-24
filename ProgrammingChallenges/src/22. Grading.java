//Create a program that calculates grades based on marks
//A -> above 90%
//B -> above 75%
//C -> above 60%
//D -> above 30%
//F -> below 30%

import java.util.Scanner;

class Grading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter marks of 6 subjects:");
        System.out.println("Please enter Subject 1 marks:");
        int sub1 = scanner.nextInt();
        System.out.println("Please enter Subject 2 marks:");
        int sub2 = scanner.nextInt();
        System.out.println("Please enter Subject 3 marks:");
        int sub3 = scanner.nextInt();
        System.out.println("Please enter Subject 4 marks:");
        int sub4 = scanner.nextInt();
        System.out.println("Please enter Subject 5 marks:");
        int sub5 = scanner.nextInt();
        System.out.println("Please enter Subject 6 marks:");
        int sub6 = scanner.nextInt();
        float total= sub1+sub2+sub3+sub4+sub5+sub6;
        System.out.println("Total" + total);
        float percentage = (total/600) * 100;
        System.out.println("Percentage" + percentage);
        if(percentage >= 90){
            System.out.println("A grade");
        }
        else if(percentage >= 75){
            System.out.println("B grade");
        }
        else if(percentage >= 60){
            System.out.println("C grade");
        }
        else if(percentage >= 30){
            System.out.println("D grade");
        }
        else{
            System.out.println("E grade");
        }

    }
}
