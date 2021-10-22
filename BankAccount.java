import java.util.Random;


public class BankAccount {

    private double checkingBalance = 0;
    private double savingsBalance = 0;
    private static int numberOfBankAccounts = 0;
	private static double totalAmountMoney = 0;
	private String accountNumber;
	
	
	private static String generateId() {
		String subst = "";
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			subst += r.nextInt(10);
		}
		return subst;
	}
	
    public double allBalances (double checkingBalanceParam, double savingsBalanceParam) {
        checkingBalance = (checkingBalance + checkingBalanceParam);
        savingsBalance = (savingsBalance + savingsBalanceParam);
		double result = checkingBalance + savingsBalance;
        return balanceCount(result);
	}
		
	public static double balanceCount( double result) {
		totalAmountMoney = result;
        return totalAmountMoney;
    
    }
	public BankAccount() {
        BankAccount.numberOfBankAccounts++;
		this.accountNumber = BankAccount.generateId();
		
    }

	public String getAccountId(){
		return accountNumber;
	}
	
	public static int accountCount(){
		return numberOfBankAccounts;
	}
	//getters
	public double getCheckingBalance(){
		return this.checkingBalance;
	}
		
	public double getSavingsBalance(){
		return this.savingsBalance;
		
	}
	
	public void displayAccountBalance() {
		System.out.println(String.format("Savings: %.2f, Checking: %.2f", this.savingsBalance, this.checkingBalance));
	}
	
	public void depositSavingBalance (double amount){
        this.savingsBalance = (this.savingsBalance + amount); 
	}
	
	public void depositCheckingBalance (double amount){
        this.checkingBalance = (this.checkingBalance += amount);
	}
	
    public double withdrawCheckingBalance (double amount){
        if (amount > this.checkingBalance) {
            System.out.println ("Insufficient funds");
			return checkingBalance;
		}
        else {
            this.checkingBalance = (this.checkingBalance -= amount);
            return checkingBalance;
        }
	}
			
	public double withdrawSavingsBalance (double amount){
        if (amount > this.savingsBalance) {
            System.out.println ("Insufficient funds");
            return this.savingsBalance;
		}
        else {
            this.savingsBalance = (this.savingsBalance - amount);
            return this.savingsBalance;
        }
	}
        
       
}