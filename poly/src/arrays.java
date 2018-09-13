import java.util.Scanner;

public class arrays{
	static int[] arr=new int[10];
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		
		getData(10);
		displayData();
		sortArr();
	}
	public static void getData(int number)
	{
		System.out.println("Enetr data\n------------------------------\n");
		for(int i=0;i<number;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	public static void displayData()
	{
		System.out.println("Displaying data\n------------------------------\n");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void sortArr()
	{
		int max=0,temp;
		for(int i = 0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
			if(arr[i]<arr[j])
			   {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			    }
		    }
		}
		displayData();
	}
	
}