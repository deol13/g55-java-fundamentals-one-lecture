package se.lexicon.part2;

public class BankApp {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        // initialize fields for account1
        account1.accountHolder = "Dennis";
        account1.balance = 1000;

        BankAccount account2 = new BankAccount();
        // initialize fields for account2
        account2.accountHolder = "Mehrdad";
        account2.balance = 2000;

        account1.displayAccountInfo();
        account2.displayAccountInfo();
        System.out.println("-----------------------");

        account1.deposit(5000);
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        System.out.println("-----------------------");
        account1.withdraw(2000);
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        System.out.println("-----------------------");
        System.out.println("Interest rate: " + CalcLoan.interestRate);
        System.out.println("Total Loan Repayment amount: " + CalcLoan.calculateLoanRepayment(10000, 2));
    }
}
