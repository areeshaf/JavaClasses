package areesha;

import java.util.ArrayList;

public class MobilePhone{
	 ArrayList<Contacts> myContact=new ArrayList<Contacts>();
	//private ArrayList<Integer> number=new ArrayList<Integer>();
	
	 
	 
	 
	 
	 
	public boolean addNameNo(Contacts contact)
	{
		int pos=findContact(contact);
		if(pos>=0)
		{
			System.out.println("Contact "+contact.getName()+" already exists!!");
			return false;
		}
		myContact.add(contact);
		return true;
	}
	
	
	
	
	public void display()
	{
		int len=myContact.size();
		for(int i=0;i<len;i++)
		{
			System.out.println((i+1)+"->"+" Name : "+myContact.get(i).getName()+"\n"+" "+"Number : "+myContact.get(i).getNumber());
			
		}
	}
	
	
	
	
	public boolean modifyContacts(Contacts oldc,Contacts newc)//,int oldno,int newno)
	{
		//String nameofConatct=name.get(position);
		int pos=findContact(oldc);
		if(pos>=0){
		myContact.set(pos, newc);
		return true;}
		else{
			System.out.println(oldc.getName()+"Don't Exists in Contacts!");
			return false;}
		//int posn=findNumber(oldno);
		//number.set(posn, newno);
		
	}
	
	
	
	
	private int findContact(Contacts contact)
	{
		return this.myContact.indexOf(contact);
		/*int pos=name.indexOf(nameC);
		if(pos>=0)
		{
			return pos;
		}
		return -1;*/
	}
	
	
	private int findName(String name)//only name checking
	{
		for(int i=0;i<myContact.size();i++)
		{
			Contacts contact=myContact.get(i);
			if(contact.getName().equals(name))
			{
				System.out.println(name+" found in Contacts at position "+(i+1));
				return i;
			}
		}
		return -1;
	}
	
	
	
	public void remove(Contacts contact)
	{
		int pos=findContact(contact);
		if(pos>=0)
		{
			this.myContact.remove(contact);
			System.out.println(contact.getName()+" was deleted");
		}
		else
		{
			System.out.println("This name is not in contacts!");
		}
	}
	
	
	
/*	public void searchContact(String name)
	{
		int pos=findName(name);
		if(pos>=0)
		{
			System.out.println(name +" Found!!");
		}
		else{
			System.out.println(name+" Not Found!!");
		}
	}*/
	
	
	
	public String queryc(Contacts contact)
	{
		if(findContact(contact)>=0)
		{
			System.out.println(contact.getName()+" exists in contact");
			return contact.getName();
		}
		return null;
	}
	
	
	
	
	public Contacts queryc(String name)
	{
		int pos=findName(name);
		if(pos>=0)
		{
			return this.myContact.get(pos);//returning object of contacts saved in myConatc arraylist after finding name
		}
		
			return null;
	}
}