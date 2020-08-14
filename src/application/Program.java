package application;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		sc.nextLine();
		System.out.print("Balance: ");
		Double balance = sc.nextDouble();

		BusinessAccount account = new BusinessAccount(number, holder, balance, 0.0);
		
		System.out.println();
		System.out.println("Number: " + account.getNumber());
		System.out.println("Holder: " + account.getHolder());
		System.out.println("Balance: " + account.getBalance());
		System.out.println("Loan Limit: " + account.getLoanLimit());
		
		System.out.println();
		System.out.println("Enter loan: ");
		Double loan = sc.nextDouble();
		
		account.loan(loan);
		
		System.out.println("New Balance: " + account.getBalance());
		
		sc.close();
		

	}

}
