import java.util.Scanner;

public class TernaryOperator {
    public static  void main(String[] args) {
        System.out.println("Welcome user");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter num2: ");
        int num2 = scanner.nextInt();


//        if(num1 > num2){
//            greater = num1;
//        }else{
//            greater = num2;
//        }

        int greater = num1 > num2 ? num1 : num2;

        System.out.println("Greater number is: "+ greater);


    }
}
