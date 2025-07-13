package BankingSystem;

import java.util.*;
public class BankManager {
	List<Bank>Banking=new ArrayList<>();
	List<BankCustomer>Customer=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	int acno=100;
	
	public void createAc() {
		System.out.println("\nEnter Your Name: ");
		String Name=sc.nextLine();
		
		System.out.println("\nEnter Your Inital Deposit: ");
		int intialDeposit=sc.nextInt();
		sc.nextLine();
		
		BankCustomer bankcustomer=new BankCustomer();
		bankcustomer.setName(Name);
		bankcustomer.setintialDeposite(intialDeposit);
		Customer.add(bankcustomer);
		String str="B";
		String Ac=str+acno;
		
		Bank bank=new Bank();
		
		bank.setAcNo(Ac);
		bank.setBal(intialDeposit);
		Banking.add(bank);
	
		System.out.println("Account created successfully!");
		System.out.println("Your Account ID is: "+Ac);	
		acno++;
	}

	public void Login() {
		System.out.println("Enter Your AC/NO:");
		String Ac_No=sc.nextLine();
		boolean found=false;
		for(int i=0;i<Banking.size();i++)
		{
			Bank bank=Banking.get(i);
			if(bank.getAcNo().equals(Ac_No))
			{
				found=true;
				BankCustomer bankcustomer=Customer.get(i);
				System.out.println("Welcome "+ bankcustomer.getName()+"!");

				
				boolean run=true;
				while(run)
				{

					System.out.println("\n Banking Menu:\r\n"
							+ "1. Check Balance\r\n"
							+ "2. Deposit\r\n"
							+ "3. Withdraw\r\n"
							+ "4. Logout");
					System.out.println("\nEnter your Choice:");
					int ch=sc.nextInt();
					sc.nextLine();
					switch (ch)
					{
					case 1:{
						CheckBalance(bank);
						break;
					}
					case 2:
					{
						Deposit(bank);
						break;
					}
					case 3:
					{
						Withdraw(bank);
						break;
					}
					case 4:
					{
						run=false;
						System.out.println("Logged out");
						break;
					}
					default:
					{
						System.out.println("Invalid No");
					}
					break;
				}
			}
			
		}
	}
		if(!found)
		{
			System.out.println("Invalid");
			
		}	
		
	}

	public void CheckBalance(Bank bank) {
		System.out.println("Your Balance: "+ bank.getBal());
	}

	public void Deposit(Bank bank) {
		System.out.print("Enter amount to deposit:");
		int deposit=sc.nextInt();
		sc.nextLine();
		bank.setBal(bank.getBal()+deposit);
		System.out.println("Deposited Successfully.");
		
		
	}

	public void Withdraw(Bank bank) {
		System.out.print("Enter amount to Withdraw:");
		int Withdraw=sc.nextInt();
		sc.nextLine();
		if(Withdraw<=bank.getBal())
		{
			bank.setBal(bank.getBal()-Withdraw);
			System.out.println("Withdrawal Successful.");
			
		}
		else
		{
			System.out.println("Insufficient balance");
		}
		
	}

}
