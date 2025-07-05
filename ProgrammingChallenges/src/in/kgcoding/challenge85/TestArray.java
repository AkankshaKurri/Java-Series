package in.kgcoding.challenge85;

public class TestArray {
    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[]{1,3,5,9});

        //Remember:Inner class hamesha outer class ke object se associated hota hai
        ArrayOperations.Statistics statistics= opr.new Statistics();
        System.out.println(statistics.mean());
        System.out.println(statistics.median());
    }
}
