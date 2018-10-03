
public class Main {

	public static void main(String[] args){
		Dog dog=new Dog("Pug");
		dog.breath();
		dog.eat();
		
		Parrot parrot=new Parrot("Parrot");
		parrot.breath();
		parrot.eat();
		parrot.fly();
		
		Penguin p=new Penguin("Penguin");
		p.breath();
		p.eat();
		p.fly();
	}
}
