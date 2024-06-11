package EncapsulationPrograms;

public class Seconnd {

	
	private int balance=100000;
	
	
	public void getBalance(int pin)
	
	{
		if(pin==12345)
		{
			
			System.out.println("Your balance is:"+balance);
			
		}
		
		else
		{
			
			System.out.println("your pin is incorrect");
			
		}
	}
		
		public void setBalance(int pin ,int amount)
		{
			
			if(pin==12345)
			{
				if(amount<balance)
				{
					
					balance=balance-amount;
					System.out.println("Your current  balance is:"+balance);
					
				}
				
				
			}
			else
			{
				
				System.out.println("Your pin is incorrect");
				
			}
		}
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
}
