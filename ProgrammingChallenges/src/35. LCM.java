//Create a program to find the Least Common Multiple(LCM) of two numbers.

import java.util.Scanner;

 class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int secondNum = scanner.nextInt();
        int lcm = printLCM(firstNum, secondNum);
        System.out.println("LCM is:"+ lcm);
    }

    public static int printLCM(int first,int second){
        //4 6   4*3=12   6*2=12
        int i = 1;
        while(true){
            int factor = first * i ; //pehla wala table starting se muliply karenge aur usko factor mei store karenge
            //fir check karenge kya factor divide ho rha hai ya nhi (second number se)
            if(factor % second == 0){
                return factor;
            }
            i++;
        }
    }
}
