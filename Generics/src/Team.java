import java.util.ArrayList;


public class Team<T extends Player> implements Comparable<Team<T>> {
	private String name;
	private int won=0;
	private int lost=0;
	private int tied;
	private int played;
	private ArrayList<T> players=new ArrayList<>();
	
	Team(String name){
		this.name=name;
	}
	public boolean addPlayers(T player){
		if(players.contains(player)){
			System.out.println(((Player) player).getName()+ " is already in the team!");
			return false;
		}
		players.add(player);
		System.out.println(((Player) player).getName()+ " is added to the team");
		return true;
	}
	
	public int getNumberofPlayers(){
		return this.players.size();
	}
	
	public void matchResult(Team<T> opponent,int ourScore, int theirScore){
		String message;
		if(theirScore<ourScore){
			won++;
			message=" beated ";
			
		}else if(theirScore>ourScore){
			lost++;
			message=" lost to ";
		}else{
			tied++;
			message=" drew ";
		}
		played++;
		if(opponent!=null){
		System.out.println(this.getName()+message+opponent.getName());
		matchResult(null,theirScore,ourScore);
		} 
	}
	public String getName() {
		return name;
	}
	
	public int ranking(){
		return ((won*2)+tied);
	}
	@Override
	public int compareTo(Team<T> team) {
		if(this.ranking()>team.ranking()){
			return -1;
		}else if(this.ranking()<team.ranking()){
			return 1;
		}else
		return 0;
	}
	
	

}
