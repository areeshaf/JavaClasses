package areesha;

import java.util.ArrayList;

public class Branches {
	private String brname;
	private ArrayList<Customer> brcustomer;
	
	public Branches(String brname)//contructor
	{
		this.brname=brname;
		this.brcustomer=new ArrayList<Customer>();
	}
	
	public String getBrName()//getter for name
	{
		return this.brname;
	}
	public ArrayList<Customer> getBrcustomer()//getter for arrayList
	{
		return this.brcustomer;
	}
	
	
	public boolean addNewCustomer(String custname,double iniamount)//Customer customer)<-wrong
	{
		Customer custpos=findCustomer(custname);
		if(custpos!=null)
		{
			System.out.println(custname+" is already a Customer in "+brname+" !! ");
			return false;
		}
		this.brcustomer.add(new Customer(custname,iniamount));
		System.out.println(custname+" is successfully a customer of "+brname);
		return true;
	}
	
	
	public boolean addCustTransaction(String name,double amount)
	{
		Customer custpos=findCustomer(name);
		if(custpos!=null)
		{
			custpos.addTransaction(amount);//calling func from customer class
			return true;
		}
		else
		{
		System.out.println(name+" is not a customer hence cannot add transaction!!!" );	
		return false;
		}
		
	}
	
	
	private Customer findCustomer(String name)
	{
	    /*int pos=brcustomer.indexOf(name);//we cannot do this as finding index of only one field(name) of arraylist
		if(pos>=0)
		{
			return brcustomer.get(pos);
		}
		return null;*/
		for(int i=0;i<this.brcustomer.size();i++)
		{
			if(this.brcustomer.get(i).getName().equals(name))
			{
				return this.brcustomer.get(i);
			}
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
}
