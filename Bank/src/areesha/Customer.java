package areesha;

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Double> transaction;
	
	public Customer(String name,double initialAmount)
	{
		this.name=name;
		this.transaction=new ArrayList<Double>();
		this.transaction.add(initialAmount);//autoboxing
	}
	
	public String getName()
	{
		return this.name;
	}
	public ArrayList<Double> getTransaction()
	{
		return this.transaction;
	}
	
	public void addTransaction(double amount)
	{
		this.transaction.add(amount);//autoboxing
	}
}
