//Create a program using break to read inputs from the user in a loop
//and break the loop if specific keyword(like "exit") is entered

import java.util.Scanner;

class ExitOnExit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        while(true){
            System.out.println("PLease enter any command: ");
            str = scanner.next();
            if(str.equalsIgnoreCase("exit")){
                break;
            }
        }
        System.out.println("You have successfully exited loop");
    }
}
