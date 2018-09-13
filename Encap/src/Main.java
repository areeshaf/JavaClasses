public class Main
{
	public static void main(String[] args)
	{
		Printer printer=new Printer(200, 50, false);
		System.out.println(printer.getTonerLevel());
		System.out.println(printer.getNoOfPagesPrinted());
	}
}