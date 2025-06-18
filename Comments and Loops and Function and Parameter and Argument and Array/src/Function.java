public class Function {
    public static void main(String[] args) {
        greetUser();
        printFirstPattern();
        printSecondPattern();
        printThirdPattern();
    }

    public static void greetUser(){
        System.out.println("Good Morning");
    }

// Using for loop
    public static void printFirstPattern(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

// This is Sir Code
//    public static void printFirstPattern() {
//        int rows = 0;
//        while (rows < 5) {
//            System.out.print("*");
//            int i = 0;
//            while (i < rows) {
//                System.out.print(" *");
//                i++;
//            }
//            System.out.println();
//            rows++;
//        }
//    }

//    public static void printFirstPattern(){
//        int rows = 5;
//        int i =1;
//        while (i <= rows){
//            int j=0;
//            while(j < i){
//                System.out.print("* ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//        System.out.println();
//    }

    public static void printSecondPattern(){
        for(int i =5; i>=1; i--){
            for(int j=1; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printThirdPattern(){
        int rows=4;
        for(int i=1; i <= rows; i++ ){
            //spaces
            for(int j=i; j<rows; j++ ){
                System.out.print(" ");
            }
            //stars
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
