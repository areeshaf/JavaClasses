import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {
	private static ArrayList<Albums> albumss=new ArrayList<Albums>();
	public static void main(String[] args)
	{
		Albums album1=new Albums("English","Singer");
		album1.addSong("cold water", 5.0);
		album1.addSong("blank space", 6.0);
		album1.addSong("starboy", 6.5);
		album1.addSong("attention", 7.0);
		albumss.add(album1);
		Albums album2=new Albums("Hindi","Singerr");
		album2.addSong("song1", 4.0);
		album2.addSong("song2", 6.0);
		album2.addSong("song3", 6.0);
		album2.addSong("song4", 3.7);
		albumss.add(album2);
		
		LinkedList<Songs> playList=new LinkedList<Songs>();
		albumss.get(0).addtoPlaylist("cold water", playList);
		albumss.get(0).addtoPlaylist(2, playList);
		albumss.get(0).addtoPlaylist(3, playList);
		albumss.get(0).addtoPlaylist(4, playList);
		albumss.get(0).addtoPlaylist("baby", playList);
		albumss.get(1).addtoPlaylist(24, playList);
		albumss.get(1).addtoPlaylist("song2", playList);
		albumss.get(1).addtoPlaylist(3, playList);
		albumss.get(1).addtoPlaylist(1, playList);
		albumss.get(1).addtoPlaylist(4, playList);
		
		play(playList);
	}
	public static void play(LinkedList<Songs> playList)
	{
		Scanner sc=new Scanner(System.in);
		boolean quit=false;
		boolean forward=true;
		ListIterator<Songs> listiterator=playList.listIterator();
		if(playList.size()==0)
		{
			System.out.println("There are no songs in the Play List!");return;
		}
		else{
			System.out.println("Now playing "+listiterator.next().toString());
		}
		printmenu();
		while(!quit)
		{
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 0:System.out.println("Play List completed");
			quit=true;
			break;
			case 1:if(!forward)
			{
				if(listiterator.hasNext())
				{
					listiterator.next();
				}
				forward=true;
			}
			if(listiterator.hasNext())
			{
				System.out.println("Now playing......"+listiterator.next().toString());
			}else{
				System.out.println("We have reached to the end of the playlist");
				forward=false;
			}
			break;
			case 2:if(forward)
			{
				if(listiterator.hasPrevious())
				{
					listiterator.previous();
				}
				forward=false;
			}
			if(listiterator.hasPrevious())
			{
				System.out.println("Now playing......"+listiterator.previous().toString());
			}else{
				System.out.println("We have reached at the start of the playlist");
				forward=true;
			}
				break;
			case 3:if(forward)
			{
				if(listiterator.hasPrevious()){
				System.out.println("Now playing "+listiterator.previous().toString());
				forward=false;
			}
			else{
				System.out.println("We are the start of the list");
			}}
			else{
				if(listiterator.hasNext()){
					System.out.println("Now playing "+listiterator.next().toString());
					forward=true;
				}else{
					System.out.println("We are at the end of the list");
				}
			}
			
				break;
			case 4:printList(playList);
				break;
			case 5:printmenu();
			break;
			}
		}
		
	}
	private static void printmenu()
	{
		System.out.println("Press\n0:To Quit\n1.To play next song\n2.To play previous song\n3.To play current song\n4.To display the play list\n5.To display menu again ");
	}
	private static void printList(LinkedList<Songs> playList)
	{
		ListIterator<Songs> listiterator=playList.listIterator();
	for(int i=0;i<playList.size();i++)
	{
		System.out.println((i+1)+" -> "+listiterator.next().toString());
	}
	}
}
