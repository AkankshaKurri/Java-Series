import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
//        int num = 1;                      // initialization
//        while(num <= 100){                //condition
//            System.out.println(num);      //actual work
//            num++;                        //update
//        }

//        int count = 500;
//        while(count >= 200){
//            System.out.println(count);
//            count--;
//        }

        Scanner input = new Scanner(System.in);
        int i = 0;
        while(i < 5){
            System.out.println("Enter Number:");
            int inp = input.nextInt();
            System.out.println("Number is "+ inp);
            i++;
        }

    }
}
