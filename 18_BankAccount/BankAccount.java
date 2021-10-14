public class BankAccount {
	
	String fullName;
	String password;
	int pin;
	int accountNumber;
	float balance;
	public BankAccount(String S, String T, int a, int b, float f);
		fullName = S;
		password = T;
		pin = a;
		accountNumber = b;
		balance = f;
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
	public void deposit(float h, int bb) {
		balance = balance - h;
	}
	public void actInfo (String[] args){
		System.out.println(fullName + password + pin + accountNumber + balance);
	}
	public void main(String S0, String T0, int a0, int b0, float f0){
		setValues(S0, T0, a0, b0, f0);
		withdraw(100);
		deposit(200);
		actInfo("");
	}
}
