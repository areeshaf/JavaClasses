
public class Main {

	public static void main(String[] args) {
		FootBallPlayer ronaldo=new FootBallPlayer("Ronaldo");
		SoccerBallPlayer abc=new SoccerBallPlayer("Abc");
		BasketBallPlayer usher=new BasketBallPlayer("Usher");
		
		Team<FootBallPlayer> madrid=new Team<>("Madrid");
		madrid.addPlayers(ronaldo);
		//madrid.addPlayers(abc);validation by adding generic class
		
		Team<SoccerBallPlayer> abcd=new Team<>("ABCD");
		abcd.addPlayers(abc);
		Team<BasketBallPlayer> efgh=new Team<>("EFGH");
		efgh.addPlayers(usher);
		
		
		
		
		System.out.println("Number of Players in Football Team : "+madrid.getNumberofPlayers());
		System.out.println("Number of Players in Soccer Team : "+abcd.getNumberofPlayers());
		System.out.println("Number of Players in Basketball Team : "+efgh.getNumberofPlayers());
	}

}
