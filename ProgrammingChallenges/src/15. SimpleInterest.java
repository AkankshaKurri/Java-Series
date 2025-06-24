//Create a program to calculate simple interest.
//Simple Interest = (P*T*R)/100

class SimpleInterest {
    public static void main(String[] args) {
        int Principal = 15000;
        double Rate = 8.5;
        int Time = 2;
        double simple_interest = (Principal * Rate * Time)/100;
        System.out.println(simple_interest);
    }
}
