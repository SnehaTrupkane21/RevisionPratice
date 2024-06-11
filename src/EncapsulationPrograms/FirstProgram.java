
package EncapsulationPrograms;

public class FirstProgram {
	
	private int CoustemerBalance=50000;
	
	
	
	public void getBalance(int pin)
	{

   if(pin==1234)
   {
	   System.out.println(CoustemerBalance);
	   
   }
   else
   {
	   System.out.println("Incorrect Pin Try Again");
	   
   }
	}
   
   public void setBalance(int pin, int amount)
   {
	   
       if(pin==1234)
       {
    	   
    	   if(amount<CoustemerBalance)
    	   {
    		   
    		   CoustemerBalance=CoustemerBalance-amount;
    		   System.out.println("your account balance is"+CoustemerBalance);
    		   
    	   }
    	   
    	   
       }
       else
       {
    	   
    	   System.out.println("Try again wrong pin");
    	   
       }
	   
	   
   }
   
   
   
   
   
   
   
   
   
   
   
   
		
	}
		
		
	
	
	
	
	
	
	
	
	

