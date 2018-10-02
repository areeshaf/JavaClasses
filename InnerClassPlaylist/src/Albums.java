import java.util.ArrayList;
import java.util.LinkedList;
public class Albums {
	private String name;
	private String artist;
	private SongList songs;

	public Albums(String name,String artist)
	{
		this.name=name;
		this.artist=artist;
		this.songs=new SongList();
	}

	public boolean addSong(String title,double duration)
	{
		return	this.songs.add(new Songs(title,duration));//calling add function of SongList inner class which is acting like arraylist.add
	}
	
	public boolean addtoPlaylist(int trackno,LinkedList<Songs> playList)
	{
		Songs checksong=this.songs.findsong(trackno);
		if(checksong!=null)
		{
			playList.add(checksong);
			return true;
		}
		System.out.println("The album does not has a track "+trackno);
		return false;
	}
	
	public boolean addtoPlaylist(String title,LinkedList<Songs> playList)
	{
		Songs checksong=this.songs.findsong(title);
		if(checksong!=null)
		{
			playList.add(checksong);
			return true;
		}
		System.out.println("The song "+title+ " is not in the album");
		return false;
	}
	private class SongList{
		private ArrayList<Songs> songs;
		public SongList()
		{
			this.songs=new ArrayList<Songs>();
		}
		public boolean add(Songs song)
		{
			if(this.songs.contains(song)){
				return false;
			}
			this.songs.add(song);
			return true;
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
		
		private Songs findsong(int tracknumber){
			int index=tracknumber-1;
			if((index>=0)&&(index<songs.size()-1)){
				return this.songs.get(index);
			}
			return null;
		}
	}
}
