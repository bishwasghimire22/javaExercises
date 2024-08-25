package JavaBankApplication;

// ************************************************************************
// BankProgram.java	 Template created on 15.9.2016
// - The program class for the BankApplication exercise
// ************************************************************************
import java.util.Scanner;
import java.util.ArrayList;

public class BankProgram {
	private static Scanner input = new Scanner(System.in);
	private static ArrayList<Account> accountList = new ArrayList<Account>();

	// *** DO NOT change anything in the main method ***
	public static void main(String[] args) {
		int choice = -1;

		while (choice != 0) {

			switch (choice) {
			case 1:
				listAccounts();
				break;
			case 2:
				addAccount();
				break;
			case 3:
				depositMoney();
				break;
			case 4:
				withdrawMoney();
				break;
			case 5:
				deleteAccount();
				break;
			}

			displayMenu();
			choice = Integer.parseInt(input.nextLine());
		}

		System.out.println("\nThe program ends now. Bye!");
		input.close();
	}

	private static void displayMenu() {
		String line = "-----------------------------------------------------"
				+ "---------------------------------------------------------------";
		System.out.println(line);
		System.out.print(" 0 = Quit | 1 = List accounts | 2 = Add an account | "
				+ "3 = Deposit money | 4 = Withdraw money | 5 = Delete an account \n");
		System.out.println(line);
		System.out.print("Enter your choice: ");
	}

	// *** NB! Edit only the methods below. DO NOT add any other methods! ***

	private static void listAccounts() {
		System.out.print("\n*** Account list ***\n");
		for (Account accounts : accountList) {
			if (accountList.isEmpty()) {
				System.out.println("Empty account list, Nothing to show!");
			} else {
				System.out.println(
						"Number: " + accounts.getAccountNumber() + " | Balance: " + accounts.getBalance() + " euros");
			}
		}

	}
	// Number: 1231 | Balance: 100.25 euros

	private static void addAccount() {
		System.out.print("\n*** Add an account ***\n");

		System.out.print("Enter account number: ");
		String accNum = input.nextLine();

		if (findAccount(accNum) == null) {
			accountList.add(new Account(accNum));
			System.out.println("\nAccount created succesfully!");
		} else {
			System.out.println("Account not created. Account " + accNum + " already exists!");
		}

	}
	// Enter account number: 2345

	// Account created successfully
	// Account not created. Account 2345 exists already!

	// Finds an account in accountList by given account number.
	// Returns either a reference to the account object
	// OR null if the account is not found in accountList.
	private static Account findAccount(String accountNumber) {
		for (Account account : accountList) {
			if (account.getAccountNumber().equals(accountNumber)) {
				return account;
			}
		}
		return null;
	}

	// Enter account number: 2345
	// Enter the amount to be deposited: 125.25
	// Deposit completed successfully!
	// Account 9999 does not exist!
	// Cannot deposit a negative amount!
	private static void depositMoney() {
		System.out.print("\n*** Deposit money to an account ***\n");
		System.out.print("Enter account number: ");
		String accNum = input.nextLine();
		Account account = findAccount(accNum);

		if (accNum != null) {
			System.out.print("Enter the amount to be deposited:");
			double amt = Double.parseDouble(input.nextLine());

			if (amt < 0) {
				System.out.println("Cannot deposit a negative amount!");
			} else {
				account.deposit(amt);
				System.out.println("Deposit completed successfully!");
			}

		} else {
			System.out.println("Account " + accNum + " does not exist!");
		}
	}

	// Enter account number: 9999
	// Account 9999 does not exist!
	// Enter the amount to be withdrawn: -123.25
	// Cannot withdraw a negative amount!
	// Withdrawal completed successfully!
	// Withdrawal not completed. Available balance is too low.

	private static void withdrawMoney() {
		System.out.print("\n*** Withdraw money from an account ***\n");
		System.out.print("Enter account number: ");
		String accNum = input.nextLine();
		Account account = findAccount(accNum);

		if (account != null) {
			System.out.print("Enter the amount to be withdrawn: ");
			double amt = Double.parseDouble(input.nextLine());
			if (amt > account.getBalance()) {
				System.out.println("Withdrawal not completed. Available balance is too low.");

			} else if (amt < 0) {
				System.out.println("Cannot withdraw a negative amount!");
			} else {
				account.withdraw(amt);
				System.out.println("Withdrawal completed successfully!");
			}

		} else {
			System.out.println("Account " + accNum + " does not exist!");
		}

	}

	// Enter account number: 323
	// Account deleted successfully!
	// Nothing deleted. Account 9999 does not exist!
	private static void deleteAccount() {
		System.out.print("\n*** Delete an account ***\n");
		System.out.print("Enter account number: ");
		String accNum = input.nextLine();

		Account account = findAccount(accNum);
		if (account != null) {
			accountList.remove(account);
			System.out.println("Account deleted successfully!");

		} else {
			System.out.println("Nothing deleted. Account " + accNum + " does not exist!");
		}
	}
}
// End
