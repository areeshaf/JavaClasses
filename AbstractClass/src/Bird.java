
public abstract class Bird extends Animal implements Fly{

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

	@Override
	public void fly() {
		System.out.println(getName()+" is flapping wings");
		
	}
	
	
	
}
