import java.util.Scanner;

class BankAccount {
    String accountHolderName;
    private int accNo;
    double balance;
    Scanner sc = new Scanner(System.in);
    public BankAccount(String accountHolderName, int accNo, double balance) {
        this.accountHolderName = accountHolderName;
        this.accNo = accNo;
        this.balance = balance;
    }
    void deposit(){
        System.out.print("Enter the amount to deposit ");
        int dep = sc.nextInt();
        balance += dep;
    }
    void withdraw(){
        System.out.print("Enter the amount to withdraw ");
        int wid = sc.nextInt();
        balance -= wid;
    }
    void displayDetails(){
        System.out.println("Account Holder Name "+accountHolderName);
        System.out.println("Account No "+accNo);
        System.out.println("Account Balance "+balance);
    }
}
class bank_check{
    public static void main(String[] args) {
        BankAccount bank = new BankAccount("Alex " , 4455996 , 452200.2);
        System.out.println("Starting details");
        System.out.println();
        bank.displayDetails();
        bank.deposit();
        System.out.println("After deposit details");
        System.out.println();
        bank.displayDetails();
        bank.withdraw();
        System.out.println("After withdrawal details");
        System.out.println();
        bank.displayDetails();
    }
}
