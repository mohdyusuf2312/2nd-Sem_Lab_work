package week_9;
import java.util.Scanner;

//Parent class Account
class Account {
	String customerName;
	int accountNumber;
	String accountType;
	double balance;

 // Constructor
 Account(String customerName, int accountNumber, String accountType, double balance) {
     this.customerName = customerName;
     this.accountNumber = accountNumber;
     this.accountType = accountType;
     this.balance = balance;
 }

 // Method to accept deposit and update balance
 void deposit(double amount) {
     balance += amount;
     System.out.println("Deposit successful. Updated balance: " + balance);
 }

 // Method to display balance
 void displayBalance() {
     System.out.println("Current balance: " + balance);
 }

 // Method to withdraw amount and update balance
void withdraw(double amount) {
     if (accountType.equals("Savings")) {
         if (amount > balance) {
             System.out.println("Insufficient balance.");
             return;
         }
     } else if (accountType.equals("Current")) {
    	 double minimumBalance = 1000; // Example: Minimum balance for current account
         if (balance - amount < minimumBalance) {
             System.out.println("Withdrawal failed. Minimum balance requirement not met.");
             return;
         }
     }
     balance -= amount;
     System.out.println("Withdrawal successful. Updated balance: " + balance);
     }
}

//Child class Curr_acct
class Curr_acct extends Account {
	Curr_acct(String customerName, int accountNumber, double balance) {
		super(customerName, accountNumber, "Current", balance);
	}

 // Additional methods specific to Current Account
}

//Child class Sav_acct
class Sav_acct extends Account {
 Sav_acct(String customerName, int accountNumber, double balance) {
     super(customerName, accountNumber, "Savings", balance);
 }

 // Method to compute interest and add to balance
 void computeInterest(double rate) {
     double interest = balance * rate / 100;
     balance += interest;
     System.out.println("Interest computed and added to balance. Updated balance: " + balance);
 }
}

public class _1_BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Creating Savings Account
        Sav_acct savingsAccount = new Sav_acct("John", 123456, 5000);
        savingsAccount.displayBalance();
        savingsAccount.deposit(2000);
        savingsAccount.computeInterest(5);
        savingsAccount.displayBalance();
        savingsAccount.withdraw(3000);
        savingsAccount.displayBalance();

        // Creating Current Account
        Curr_acct currentAccount = new Curr_acct("Alice", 789012, 3000);
        currentAccount.displayBalance();
        currentAccount.deposit(1000);
        currentAccount.withdraw(2000);
        currentAccount.displayBalance();

        scanner.close();
	}

}
