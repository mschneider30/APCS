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

	public void withdraw(float g, int aa){
		setValues(fullName, password, pin, aa, balance - g);
	}
	public void deposit(float h, int bb) {
		setValues(fullName, password, pin, bb, balance + h);
	}
	public void actInfo (String[] args){
		System.out.println(fullName + password + pin + accountNumber + balance);
	}
	public void main(String S0, String T0, int a0, int b0, float f0){
		setValues(S0, T0, a0, b0, f0);
		withdraw(100, a0);
		deposit(200, a0);
		actInfo("");
	}
}
