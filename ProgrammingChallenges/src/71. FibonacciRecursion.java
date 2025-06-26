import java.util.Scanner;

class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number:");
        int n = scanner.nextInt();
        for(int i = 1; i <=n ; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int position) {
       if(position == 1){
           return 0;
       }
       else if(position == 2){
           return 1;
       }
       else{
           return fibonacci(position -2) + fibonacci(position -1);
       }
    }
}
