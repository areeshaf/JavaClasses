public class Hello{
String name;
double creditLimit;
String emailaddress;
public Hello()
{
	this("areesha",12345.00,"aru@gmail.com");
}

public Hello(double credit,String email)
{
	this("areeeeeeeeesha",credit,email);
}

public Hello(String name,double credit,String email)
{
	this.name=name;
	this.creditLimit=credit;
	this.emailaddress=email;
}
public String getName()
{
	return name;
}
public double getCredit()
{
	return creditLimit;
}
public String getEmail()
{
	return emailaddress;
}
}
