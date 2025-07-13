package BankingSystem;

public class BankCustomer {
	public String Name;
	public int intialDeposit;
	
	
	public String getName()
	{
		return Name;
	}
	public int  getintialDeposit()
	{
		return intialDeposit;
	}
	
	
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public void setintialDeposite(int intialDeposit)
	{
		this.intialDeposit=intialDeposit;
	}
	
	
	public String toString()
	{
		return "Name:"+Name+"Initial Deposit: "+intialDeposit;
	}
}
