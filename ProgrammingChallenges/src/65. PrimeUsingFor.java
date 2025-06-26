import java.util.Scanner;

class PrimeUsingFor {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter the number: ");
       int num = scanner.nextInt();
       boolean isPrime = checkPrime(num);
       if(isPrime){
           System.out.println(num + " is Prime number.");
       }
       else{
           System.out.println(num + " is not a Prime number.");
       }
    }

    public static boolean checkPrime(int n){
        for(int i=2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
