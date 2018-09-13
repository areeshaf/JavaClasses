package areesha;
import java.util.Scanner;

public class Main{
	private static Scanner sc=new Scanner(System.in);
	//private static Contacts contacts=new Contacts(null, null);
	private static MobilePhone mobilePhone=new MobilePhone();
	public static void main(String[] args){
		
		boolean quit=true;
		System.out.println("Starting Phone.............");
		while(quit)
		{
		int choice;
		
		System.out.println("\n1. Add Contacts\n2. Display Contacts\n3. Update an exixting Contact\n4. Remove a Contact\n5. Search for a Contact\n6 Shutdown Phone\n");
		System.out.println("Enter Choice For Contacts");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1: addcontact();
		break;
		case 2: displayc();
		break;
		case 3: update();
		break;
		case 4: deletec();
		break;
		case 5: searchc();
		break;
		case 6:System.out.println("Shutting down Phone..................."); 
			quit=false;
		break;
		}
		}
	}
	private static void addcontact()
	{
		System.out.println("Enter Name");
		String n = sc.next();
		System.out.println("Enter Number");
		String no = sc.next();
		//sc.next();
		Contacts newContact=Contacts.createContact(n,no);
		if(mobilePhone.addNameNo(newContact)){
			String nm=newContact.getName();
			System.out.println(nm+" added in Contacts!!");
		}
		else{
			String nm=newContact.getName();
			System.out.println(nm + " cannot be added!! Already exists!!");
		}
	}
	private static void displayc()
	{
		mobilePhone.display();
	}
	private static void update()
	{
		System.out.println("Enter Name to update");
		String n=sc.next();
		Contacts existingcon=mobilePhone.queryc(n);
		if(existingcon==null)
		{
			System.out.println("Contact does not exists");
			return;
		}
		
		System.out.println("Enter New Name");
		String newn=sc.next();
		System.out.println("Enter Number to update");
		String no=sc.next();
		Contacts updatedc=Contacts.createContact(newn,no);
		
		mobilePhone.modifyContacts(existingcon,updatedc);
	}
	private static void deletec()
	{
		System.out.println("Enter Name to Delete\n");
		String n=sc.next();
		Contacts existingcon=mobilePhone.queryc(n);
		if(existingcon==null)
		{
			System.out.println("Contact does not exists");
			return;
		}
		
		mobilePhone.remove(existingcon);
	}
	public static void searchc()
	{
		System.out.println("Enter Name to Search in Contacts");
		String n=sc.next();
		Contacts scon=mobilePhone.queryc(n);
		if(scon!=null)
		{
			System.out.println("Contacts Exists");
			System.out.println("Name: "+scon.getName() +"\nNumber:"+scon.getNumber());
		}
		else
		{
			System.out.println("Contact does not exists!!");
		}
	}
}