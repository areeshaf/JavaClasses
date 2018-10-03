
public abstract class Bird extends Animal{

	public Bird(String name){
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(getName()+" is pecking");
		
	}

	@Override
	public void breath() {
		System.out.println(getName()+" is breathing");
		
	}
	
	public abstract void fly();
	
}
