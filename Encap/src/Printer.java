public class Printer
{
	private int tonerLevel=100;
	private int noOfPagesPrinted;
	private boolean isDuplex;
	public Printer(int tonerLevel, boolean isDuplex)
	{
		if(tonerLevel>0 && tonerLevel<=100)
		{
		this.tonerLevel=tonerLevel;
		}
		this.noOfPagesPrinted=0;
		this.isDuplex=isDuplex;
	}
	public int getTonerLevel()
	{
		return this.tonerLevel;
	}
	public int getNoOfPagesPrinted()
	{
		noOfPagesPrinted=noOfPagesPrinted+
		return this.noOfPagesPrinted;
	}
}