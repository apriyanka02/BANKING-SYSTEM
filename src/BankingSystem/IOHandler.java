package BankingSystem;

import java.util.*;
public class IOHandler {
	
	BankManager Bank=new BankManager();
	Scanner sc=new Scanner(System.in);
	public void start()
	{		
		System.out.println("=== WELCOME TO MINI BANKING SYSTEM ===");
		boolean running=true;
		while(running)
		{
			System.out.println("Main Menu:");
			System.out.println("1. Create Account");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			System.out.println("");
			System.out.print("Enter your choice:");
			int choice=sc.nextInt() ;
			sc.nextLine();
			switch(choice)
			{
			case 1:{
				Bank.createAc();
				break;
			}
			case 2:{
				
				Bank.Login();
				
				
				
				break;
			}
			case 3:
			{
				running=false;
				System.out.println("Thank you for using Mini Banking System");
				break;
			}
			default:
			{
				System.out.println("Invalid");
			}
		}
		
	}
	}
}

