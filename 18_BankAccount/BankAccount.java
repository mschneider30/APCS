public class BankAccount {
	
	private String fullName;
	private String password;
	private int pin;
	private int accountNumber;
	private float balance;
	
	public void setValues(String S, String T, int a, int b, float f){
		fullName = S;
		password = T;
		pin = a;
		accountNumber = b;
		balance = f; 
	}

	public void withdraw(float g){
		balance = balance - g;
	}
	public void deposit(float h) {
		balance = balance - h;
	}
	public void actInfo (){
		System.out.println("Account Name: "fullName + " Password: "+ password + " Pin: " + pin + " Account Number: " + accountNumber + " Balance: " + balance);
	}
	public static void main(String[] args){
		BankAccount Test = new BankAccount();
		Test.setValues("Test Account", "StrongPassword", 1234, 012345, 1000);
		Test.withdraw(100);
		Test.deposit(200);
		Test.actInfo();
	}
}
