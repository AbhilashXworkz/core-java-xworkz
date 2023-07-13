class BankAccount{
	
	static double balance=20000;
	static boolean isCredited;
	static boolean isDebited;
	public static boolean credit(int amount){
		
		if(amount>=0){	
		System.out.println("The amount is credited");
		balance=balance+amount;
			isCredited=true;
        			
		}	
          return isCredited	;	
	}
	public static boolean debit(int amount){
		
		if(amount<balance){
			System.out.println("The amount is Debited");
	    balance=balance-amount;
	    isDebited=true;
		
	}
	return isDebited;
	}
	public static double getBalance(){
		
	return balance;
	}
}