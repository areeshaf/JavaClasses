import java.util.*;
public class q9
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total cost");
		int tc=sc.nextInt();
		double disc;
		if(tc<=2000)
		{
			disc=(5*tc)/100.0;
		}
		else if(tc>2000 && tc<=5000)
		{
			disc=(25*tc)/100.0;
		}
		else if(tc>5000 && tc<=10000)
		{
			disc=(35*tc)/100.0;
		}
		else
		{
			disc=(50*tc)/100.0;
		}
		double amt=tc-disc;
		System.out.println("Amount to be paid by the customer = "+amt);
    }
}