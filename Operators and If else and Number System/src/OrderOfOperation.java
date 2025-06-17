public class OrderOfOperation {
    public static void main(String[] args) {
        //Solve left to right (if same operators are present)
        //Follow order of Bodmas
        //Bracket, Order, Division, Multiplication. Addition, Subtraction


        System.out.println(9/(3/3+2));

        //Example of Same Operators
        System.out.println((float) 3/8/3);
        System.out.println((float) 9/3*2/6);
        System.out.println(8-5+7-1);
    }
}
