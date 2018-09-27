
public class Main {

	public static void main(String[] args)
	{
		ITelephone areeshaPhone;
		areeshaPhone=new Deskphone(91616);
		areeshaPhone.powerOn();
		areeshaPhone.dial(91616);
		areeshaPhone.callPhone(91616);
		areeshaPhone.isRinging();
		areeshaPhone.answer();
		System.out.println("--------------------------");
		areeshaPhone=new MobilePhone(12345);
		areeshaPhone.powerOn();
		areeshaPhone.dial(12345);
		areeshaPhone.callPhone(12345);
		areeshaPhone.isRinging();
		areeshaPhone.answer();
	}
}
