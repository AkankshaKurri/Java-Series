//In a class Calculator, create multiple add() methods that overload each other
//and can sum two integers,three integers,or two doubles.
//Demonstrate how each can be called with different numbers of parameters.


package in.kgcoding.challenge88;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(double a, double b){
        return a+b;
    }

    public double add(double a, double b, double c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(1,2));   //Even if you comment the first method that takes two integers.
                                                   //Then also this will work
                                                   //kyuki integer ko double mei daal sakte hai
        System.out.println(calc.add(1,2,3));
        System.out.println(calc.add(2.0,5.6));
        System.out.println(calc.add(2.0,5.6,4.0));
    }

}
