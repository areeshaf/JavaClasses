import java.math.*;
class Car
{
private int cylinders;
private String name;
private int wheels;
private boolean engine;

public Car(int cylinders,String name)
{
	this.cylinders=cylinders;
	this.name=name;
	this.engine=true;
	this.wheels=4;
}

public int getCylinders()
{
	return this.cylinders;
}
public String getName()
{
	return this.name;
}

public String startEngine()
{
	return "Engine has been started";
}
public String accelerate()
{
	return "Car is accelerated";
}
public String brake()
{
	return "Car brakes are applied";
}
}

class Audi extends Car
{
	public Audi(int cylinders,String name)
	{
		super(cylinders,name);
	}
	public String startEngine()
	{
		return "Audi-> started engine";
	}
	public String accelerate()
	{
		return "Audi-> Audi is accelerated";
	}
	public String brake()
	{
		return "Audi-> Audi brakes are applied";
	}
}

class Jaguar extends Car
{
	public Jaguar(int cylinders,String name)
	{
		super(cylinders,name);
	}
	@Override
	public String startEngine()
	{
		return "Jaguar-> started engine";
	}
	public String accelerate()
	{
		return "Jaguar-> Jaguar is accelerated";
	}
	public String brake()
	{
		return "Jaguar-> Jaguar brakes are applied";
	}	
}

class BMW extends Car
{
	public BMW(int cylinders,String name)
	{
		super(cylinders,name);
	}
	public String startEngine()
	{
		return "BMW-> started engine";
	}
	public String accelerate()
	{
		return "BMW-> BMW is accelerated";
	}
	//public String brake()
	//{
		//return "BMW-> BMW brakes are applied";
//	}		
}


public class Main
{
	public static void main(String[] args)
	{
		for(int i=1;i<=7;i++)
		{
			Car car=cars();
			System.out.println("MAIN->>\n"+car.startEngine()+"\n"+car.accelerate()+"\n"+car.brake());
		}
	}
	public static Car cars()
	{
		int choice;
			choice=(int)(Math.random()*3)+1;
			switch(choice)
			{
			case 1: return new Audi(3,"Q5");
			case 2:return new Jaguar(4,"Jaguarrr");
			case 3:return new BMW(5,"BMWWW");
			
			}
		
		return new Car(6,"CARRR");

	}
}