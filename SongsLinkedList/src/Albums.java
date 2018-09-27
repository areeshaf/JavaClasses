import java.util.*;
public class Albums {
	private String name;
	private String artist;
	private ArrayList<Songs> songs;

	public Albums(String name,String artist)
	{
		this.name=name;
		this.artist=artist;
		this.songs=new ArrayList<Songs>();
	}

	public boolean addSong(String title,double duration)
	{
		if(findsong(title)==null)
		{
			this.songs.add(new Songs(title,duration));
			return true;
		}
		return false;
	}
	
	private Songs findsong(String title)
	{
		for(Songs checksong: this.songs)
		{
			if(checksong.getTitle().equals(title))
			{
				return checksong;
			}
		}
		return null;
	}
	
	public boolean addtoPlaylist(int trackno,LinkedList<Songs> playList)
	{
		int index=trackno-1;
		if((index>=0)&&(index<=this.songs.size()) )
		{
			playList.add(this.songs.get(index));
			return true;
		}
		System.out.println("The album does not has a track "+trackno);
		return false;
	}
	
	public boolean addtoPlaylist(String title,LinkedList<Songs> playList)
	{
		Songs checksong=findsong(title);
		if(checksong!=null)
		{
			playList.add(checksong);
			return true;
		}
		System.out.println("The song "+title+ " is not in the album");
		return false;
	}
	
}
