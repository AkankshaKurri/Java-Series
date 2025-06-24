public class BreakAndContinue {
    public static void main(String[] args) {
       printUsingBreak();
       printUsingContinue();
    }

    public static void printUsingBreak(){
        for(int i = 1; i <10 ; i++){
            if(i == 5){
                break;
            }
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void printUsingContinue() {
        for(int i = 1 ; i < 10 ; i++){
            if(i==5){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
