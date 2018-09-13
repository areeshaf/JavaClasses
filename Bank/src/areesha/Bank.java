package areesha;

import java.util.ArrayList;

public class Bank {
	private String bankname;
	private ArrayList<Branches> bankbranches;
	
	public Bank(String bankname)
	{
		this.bankname=bankname;
		this.bankbranches=new ArrayList<Branches>();
	}
	
	public String getBankName()
	{
		return this.bankname;
	}
	public ArrayList<Branches> brcustomer()
	{
		return this.bankbranches;
	}
	
	
	public boolean addBranch(String name)
	{
		Branches br=findBranch(name);
		if(br==null)
		{
			System.out.println(name+" Branch added!");
			bankbranches.add(new Branches(name));
			return true;
		}
		
			System.out.println(name+" already exists!");
		return false;
	}
	
	public Branches findBranch(String name)
	{
		for(int i=0;i<bankbranches.size();i++)
		{
			Branches br=bankbranches.get(i);
			if(br.getBrName().equals(name))
			{
				return br;
			}
		}
		return null;
	}
	
	public boolean addCustomer(String Branchname,String custname,double iniamount)
	{
		Branches branch=findBranch(Branchname);
		if(branch !=null)
		{
			//System.out.println("Bank->new customer "+custname+" added");
			return branch.addNewCustomer(custname, iniamount);
		}
		System.out.println(Branchname+ " does not exists!!");
		return false;
	}
	
	
	public boolean addCustTransaction(String brname,String Custname,double amount)
	{
		Branches branch=findBranch(brname);
		if(branch !=null)
		{
			//System.out.println("Bank->customer "+Custname+" transaction added");
			return branch.addCustTransaction(Custname, amount);
		}
		System.out.println("Error adding transaction");
		System.out.println(brname+" is not a Branch of the bank!!!" );	
		return false;
	}
	
	
	public boolean listCustomers(String brname,boolean showTransactions)
	{
		
		Branches br=findBranch(brname);
		if(br!=null){
			System.out.println("\nList of Customers of "+brname+" branch");//here in place of brname we can use br.getBrName();
			ArrayList<Customer> branchCust=br.getBrcustomer();
			for(int i=0;i<branchCust.size();i++)
			{
				Customer cust=branchCust.get(i);
				System.out.println((i+1)+"->>"+cust.getName());
				if(showTransactions)
				{
					System.out.println("Transactions");
					ArrayList<Double> tr=cust.getTransaction();
					for(int j=0;j<tr.size();j++)
					{
						System.out.println((j+1)+"Amount= "+tr.get(j).doubleValue());//unboxing
					}
				}
			}
			return true;
		}
		System.out.println("Branch "+brname+" not found!!");
		return false;
	}
	
	
	
	
	
}
