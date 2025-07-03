//Define a in.kgcoding.challenge81.BankAccount class with private attributes like accountNumber,accountHolderName, and balance.
//Provide public methods to deposit and withdraw money, ensuring that these methods
//don't allow illegal operations like withdrawing more money than the current balance.

//%.2f means:
//
//% → This is a format specifier.
//.2 → This tells Java to show only 2 digits after the decimal point.
//f → This means the value is a floating-point number (i.e., float or double).

package in.kgcoding.challenge81;

class BankAccount {
    final private double accountNumber;
    final private String accountHolderName;
    private double balance;

    @Override
    public String toString() {
        return "in.kgcoding.challenge81.BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                '}';
    }

    public BankAccount(double accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    public void deposit(double newMoney) {
        if (newMoney <= 0) {
            System.out.println("Invalid Deposit money");
        } else {
            this.balance += newMoney;
            System.out.printf("Amount added Rs.%.2f%n", newMoney);
            System.out.printf("Your balance in account is Rs.%.2f%n", this.balance);
        }
    }

    public void withdraw(double money){
//        no withdrow more money with the current balance
        if(money <= 0){
            System.out.println("Invalid Withdraw");
        }
        else if(money > this.balance){
            System.out.println("Sorry!!! Insufficient Balance");
        }
        else if(money <= this.balance){
            this.balance -= money;
            System.out.printf("Amount withdrawn Rs.%.2f%n",money);
            System.out.printf("Your Balance in account is Rs.%.2f%n",this.balance);
        }
    }
}


//This is Sir Code

//package in.kgcoding.challenge78;
//
//class BankAccount {
//    private String accountNumber;
//    private String accountHolderName;
//    private double balance;
//
//    public BankAccount(String accountNumber, String accountHolderName) {
//        this.accountNumber = accountNumber;
//        this.accountHolderName = accountHolderName;
//    }
//
//    public void depositMoney(double money) {
//        if (money <= 0) {
//            System.out.println("Invalid Deposit");
//        } else {
//            balance += money;
//        }
//    }
//
//    public double withdrawMoney(double money) {
//        if (money <= 0) {
//            System.out.println("Invalid Withdraw");
//        } else if (balance >= money) {
//            balance -= money;
//        } else {
//            money = balance;
//            balance = 0;
//        }
//        return money;
//    }
//}