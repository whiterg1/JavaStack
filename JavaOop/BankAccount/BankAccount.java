import java.util.Random;
public class BankAccount{
    private String accountNumber = "";
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts = 0;
    private static double allAccountsTotal = 0;


    public BankAccount(double checkingBal, double savingsBal){
        this.accountNumber = generateAccountNumber();
        checkingBalance = checkingBal;
        savingsBalance = savingsBal;
        numberOfAccounts ++;
        allAccountsTotal += checkingBalance + savingsBalance;
    }

    public static int getNumberOfAccounts(){
        System.out.println("There are currently " + numberOfAccounts + " accounts at this bank.");
        return numberOfAccounts;
    }

    public static double getTotalAccountAmount(){
        System.out.printf("This bank currently has $%.2f within all accounts.\n", allAccountsTotal);
        return allAccountsTotal;
    }

    private String generateAccountNumber(){
        Random random = new Random();

            int randomNum = random.nextInt(1000000000) + 999999999;
            accountNumber = Integer.toString(randomNum);
            return accountNumber;
    }

    public double displayCheckingAccount(){
        System.out.printf("The checking account associated with %s has a balance of $%.2f\n", accountNumber, checkingBalance);
        return checkingBalance;
    }

    public double displaySavingsAccount(){
        System.out.printf("The savings account associated with %s has a balance of $%.2f\n", accountNumber, savingsBalance);
        return savingsBalance;
    }

    public Boolean depositTo(Boolean checking, double amount) {
		
		allAccountsTotal += amount;
		
		if (checking) {
			checkingBalance += amount;
			System.out.printf("Depositing $%.2f to checking.\n", amount);
		}
		else {
			savingsBalance += amount;
			System.out.printf("Depositing $%.2f to savings.\n", amount);
		}
		return true;
    }

    public boolean withdrawFrom(boolean checking, double amount) {
		if (checking) {
			if (checkingBalance - amount >= 0) {
				checkingBalance -= amount;
				allAccountsTotal-= amount;
				System.out.printf("Withdrawing $%.2f frm checking.\n", amount);
				return true;
			}
			System.out.printf("Account Balance is %.2f. There are insufficient funds to withdraw that amount.\n", checkingBalance);
		}
		else {
			if (savingsBalance - amount >= 0) {
				savingsBalance -= amount;
				allAccountsTotal-= amount;
				System.out.printf("Withdrawing $%.2f from savings\n", amount);
				return true;
			}
			System.out.printf("Account Balance is %.2f\n. There are insufficient funds to withdraw that amount.\n", savingsBalance);
		
		}
		return false;
    }
}

