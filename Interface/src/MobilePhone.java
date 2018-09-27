
public class MobilePhone implements ITelephone{
	private int myNumber;
	private boolean isRinging;
	private boolean isOn;
	
	public MobilePhone(int  myNumber)
	{
		this.myNumber=myNumber;
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Mobile Phone Powered On!");
		isOn=true;
		
	}

	@Override
	public void dial(int number) {
		// TODO Auto-generated method stub
		if(isOn)
		System.out.println("Mobile phone with "+number+" is ringing!");
		else
			System.out.println("Mobile is switched off!");
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		if(isRinging)
		{
			System.out.println("Answering Mobile Phone");
			isRinging=false;
		}
		
	}

	@Override
	public boolean callPhone(int number) {
		// TODO Auto-generated method stub
		if(myNumber==number && isOn==true)
		{
			System.out.println("Mobile ring ring");
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
