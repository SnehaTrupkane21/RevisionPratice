package EncapsulationPrograms;

public class Name2 {
	public static void main(String[] args) {
		
		NameClass na=new NameClass();
		na.setAge(25);
		na.setName("chivu");
		System.out.println("Name of the user is :"+" "+na.getName());
		
		System.out.println("Age of the User is:"+ " "+na.getAge());
		
	}

}
