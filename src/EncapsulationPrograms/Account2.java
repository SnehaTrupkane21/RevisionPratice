package EncapsulationPrograms;

public class Account2 {
	public static void main(String[] args) {
		
		Account_Number acc=new Account_Number();
		
		acc.setAccountNumber(1233242);
		acc.setAge(24);
		acc.setName("pranay");
		acc.setSalary(74572657);
		System.out.println("Your account number is:"+" "+acc.getAccountNumber());
		
		System.out.println("Your Age is:"+" "+acc.getAge());
		
		System.out.println("Your Name is:"+" "+acc.getName());
		System.out.println("Your Salary is:"+" "+acc.getSalary());

		
		
		
	}

}
