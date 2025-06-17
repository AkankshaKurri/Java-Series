//Create a program to calculate Compound Interest.
//Compound Interest = P(1+R/100)t

public class Challenge16 {
    public static void main(String[] args) {
        int Principal = 10000;
        double Rate = 8.5;
        int Time = 3;
        double compound_interest = Principal * Math.pow((1+ Rate/100) ,Time);
        System.out.println(compound_interest);
    }
}
