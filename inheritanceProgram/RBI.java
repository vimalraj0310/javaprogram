package inheritanceProgram;

public class RBI {
	double balance=2000;
	double credit(double amount)
	{
		balance=balance+amount;
		System.out.println(balance);
		return balance;
	}
	double debit(double amount)
	{
	balance=balance-amount;
	System.out.println(balance);
	return balance;
	}
	double checkbalance()
	{
		System.out.println(balance);
		return balance;
	}

}
