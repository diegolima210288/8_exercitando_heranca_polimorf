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
		
		BusinessAccount account = new BusinessAccount(8010, "Bob Brown", 0.0, 500.00);
		
		account.deposit(100.00);
		
		System.out.println("Number: " + account.getNumber());
		System.out.println("Holder: " + account.getHolder());
		System.out.println("Balance: " + account.getBalance());
		System.out.println("Loan Limit: " + account.getLoanLimit());
		
		account.withdraw(50.00);
		
		System.out.println();
		System.out.println("New banlance: " + account.getBalance());
		
		sc.close();
		

	}

}
