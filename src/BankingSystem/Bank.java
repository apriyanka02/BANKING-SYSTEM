package BankingSystem;

public class Bank {
	private String AcNo;
	private int Balance;
	public int Deposit,Withdraw;
	
	public String getAcNo()
	{
		return AcNo;
	}
	public void setAcNo(String AcNo)
	{
		this.AcNo=AcNo;
	}
	public int getDeposit()
	{
		return Deposit;
	}
	public int getWithdraw()
	{
		return Withdraw;
	}
	
	public int getBal()
	{
		return Balance;
	}
	
	public void setBal(int Balance)
	{
		this.Balance=Balance;
	}
	public void setDeposit(int  Deposit)
	{
		this.Deposit=Deposit;
	}
	public void setWithdraw(int Withdraw)
	{
		this.Withdraw=Withdraw;
	}
	
	@Override
	public String toString()
	{
		return "Ac/NO: "+ AcNo + "Balance: "+Balance+"Deposit: "+Deposit+"Withdraw: "+Withdraw;
	}
	
}
