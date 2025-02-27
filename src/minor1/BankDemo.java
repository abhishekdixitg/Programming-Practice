package minor1;

//Define the Bank interface
interface Bank {
	double roi = 0.0; // Rate of Interest (default value)

	void deposit(double amount); // Method to deposit money

	void withdraw(double amount); // Method to withdraw money
}

//Main class to test the implementation
public class BankDemo {
	public static void main(String[] args) {
		// Create HDFC bank object
		HDFC hdfcBank = new HDFC(5000, 6.5);
		hdfcBank.deposit(2000);
		hdfcBank.withdraw(3000);
		System.out.println("HDFC ROI: " + hdfcBank.getRoi() + "%");

		System.out.println();

		// Create SBI bank object
		SBI sbiBank = new SBI(8000, 5.5);
		sbiBank.deposit(1000);
		sbiBank.withdraw(9000);
		System.out.println("SBI ROI: " + sbiBank.getRoi() + "%");
	}
}

//HDFC class implementing the Bank interface
class HDFC implements Bank {
	private double balance;
	private double roi;

	// Constructor to initialize balance and ROI
	public HDFC(double balance, double roi) {
		this.balance = balance;
		this.roi = roi;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("HDFC: Deposited " + amount + ". New balance: " + balance);
	}

	public double getBalance() {
		return balance;
	}

	public double getRoi() {
		return roi;
	}

	@Override
	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("HDFC: Insufficient balance!");
		} else {
			balance -= amount;
			System.out.println("HDFC: Withdrawn " + amount + ". Remaining balance: " + balance);
		}
	}
}

//SBI class implementing the Bank interface
class SBI implements Bank {
	private double balance;
	private double roi;

	// Constructor to initialize balance and ROI
	public SBI(double balance, double roi) {
		this.balance = balance;
		this.roi = roi;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("SBI: Deposited " + amount + ". New balance: " + balance);
	}

	public double getBalance() {
		return balance;
	}

	public double getRoi() {
		return roi;
	}

	@Override
	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("SBI: Insufficient balance!");
		} else {
			balance -= amount;
			System.out.println("SBI: Withdrawn " + amount + ". Remaining balance: " + balance);
		}
	}
}
