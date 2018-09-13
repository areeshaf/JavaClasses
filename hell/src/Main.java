public class Main{
	public static void main(String[] args)
	{
		Hello hi=new Hello(1555557.00,"arara@gamil.com");
		Hello hi1=new Hello();
		Hello hi2=new Hello("fuuuuuuuu",1555557.00,"arara@gamil.com");
		System.out.println(hi.getName());
		System.out.println(hi1.getName());
		System.out.println(hi2.getName());
		System.out.println(hi.getCredit());
		System.out.println(hi.getEmail());
	}
}