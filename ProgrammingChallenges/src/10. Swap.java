//Create a program to swap two numbers

class Swap {
    public static void main(String[] args) {
        int temp;
        int num1 = 10;
        int num2 = 20;
        System.out.println("Before Swapping:  num1: " + num1 + " and num2: " + num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping num1: " + num1 + " and num2: " + num2);
    }
}
