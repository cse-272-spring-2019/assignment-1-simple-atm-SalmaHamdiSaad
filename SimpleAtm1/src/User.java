public class User {
	
  private int balance; 
  int cardNo;
 
	public User()
	{
		 balance = 0;
		cardNo = 12345;

	}
	
	
	
	
	public void withdraw(int amount) {
	if (amount <= balance)
	{
		balance = balance - amount; 
	}
		
	}
	
	public void deposit (int amount)
	{
		balance=balance+ amount;
	}
	
	public int balanceInquiry ()
	{
		return balance;
	}
}
