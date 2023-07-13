class BankAccountTester{
	public static void main(String bank[]){
	
		System.out.println("Invoking Credit");
		BankAccount.credit(5000);
		double balance=BankAccount.getBalance();	
		System.out.println("Current balance "+ balance);
		System.out.println("Invoking Debit");
		BankAccount.debit(300);
		double balance1=BankAccount.getBalance();
		System.out.println("Current balance "+ balance1);
	}
}