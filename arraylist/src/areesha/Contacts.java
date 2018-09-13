package areesha;

public class Contacts
{
	private String name;
	private String number;
	public Contacts(String name,String number)
	{
		this.name=name;
		this.number=number;
	}
	
	public String getName()
	{
		return this.name;
	}
	public String getNumber()
	{
		return this.number;
	}
	public static Contacts createContact(String name,String number)
	{
		return new Contacts(name,number);
	}
}