public class BankAccountTest{
    public static void main(String[] args){
        
        BankAccount account1 = new BankAccount(100, 100);
        BankAccount account2 = new BankAccount(257, 962);

        account1.getNumberOfAccounts();
        account1.getTotalAccountAmount();
        account1.displayCheckingAccount();
        account2.displaySavingsAccount();

        account1.deposit(true, 100.50);
        account2.withdraw(false, 963.00);

        account1.getTotalAccountAmount();
        account2.displayCheckingAccount();

        account2.deposit(false, 25.00);


    }
}