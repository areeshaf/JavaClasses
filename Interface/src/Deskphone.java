
public class Deskphone implements ITelephone {
	
private int myNumber;
private boolean isRinging=false;
	public Deskphone(int myNumber)
	{
		this.myNumber=myNumber;
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Deskphone is always on!");
		
	}

	@Override
	public void dial(int number) {
		// TODO Auto-generated method stub
		System.out.println("Deskphone with number " + number+ " is ringing!");
		
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		if(isRinging)
		{
		System.out.println("Answering deskphone");
		isRinging=false;
		}
	}

	@Override
	public boolean callPhone(int number) {
		// TODO Auto-generated method stub
		if(number==myNumber)
		{
			System.out.println("Deskphone ring ringing");
			isRinging=true;
		}else{
			isRinging=false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return isRinging;
	}
	
}
