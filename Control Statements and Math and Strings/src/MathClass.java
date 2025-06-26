public class MathClass {
    public static void main(String[] args) {
        System.out.println("Absolute of -91 is: " + Math.abs(-91));
        System.out.println("Ceil of 7.05 is: " + Math.ceil(7.05));
        System.out.println("Floor of 7.57 is: " + Math.floor(7.57));
        System.out.println("Round of 7.57 is: " + Math.round(7.57));
        System.out.println("Random number is: " + Math.random());
        System.out.println("PI is: " + Math.PI);

        for(int i = 1; i < 10; i ++){
            long randomNum = (int) Math.floor(Math.random() * 100);
            System.out.print(randomNum + " ");
        }
    }
}
