class BankAccounTest {

	public static void main(String[] args) {

		BankAccount bank = new BankAccount();


		bank.displayAccountBalance();
		bank.depositSavingBalance (20);
		bank.depositCheckingBalance(30);
		bank.displayAccountBalance();
		bank.withdrawCheckingBalance(60);
		bank.withdrawSavingsBalance(10);
		bank.displayAccountBalance();
		System.out.println(bank.allBalances(0, 0));
		System.out.println(bank.getAccountId());
	}
	
}