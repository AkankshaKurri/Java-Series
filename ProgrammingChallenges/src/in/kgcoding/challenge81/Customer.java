package in.kgcoding.challenge81;

public class Customer {
    public static void main(String[] args) {
        BankAccount customer1 = new BankAccount(123456789,"ABC");
        System.out.println(customer1);
        customer1.deposit(0);
        customer1.deposit(500);
        customer1.withdraw(600);
        customer1.withdraw(-200);
        customer1.withdraw(200);

    }
}

//This is Sir Code

//package in.kgcoding.challenge78;

//public class Customer {
//    public static void main(String[] args) {
//        BankAccount account = new BankAccount("001", "Prashant Jain");
//        account.depositMoney(100);
//        System.out.println(account.withdrawMoney(200));
//        account.depositMoney(-40);
//        account.withdrawMoney(0);
//    }
//}
