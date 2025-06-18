public class Parameter {
    public static void main(String[] args) {
        int addition = sumOfTwoNumbers(5, 5);//Arguments
        System.out.println(addition);
    }

    public static int sumOfTwoNumbers(int first, int second){//Parameters
        System.out.println("First Number received: "+first);
        System.out.println("Second Number received: "+second);
        return first + second;
    }
}
