
public class Main {

	public static void main(String[] args) {
		FootBallPlayer ronaldo=new FootBallPlayer("Ronaldo");
		FootBallPlayer messi=new FootBallPlayer("Messi");
		
		SoccerBallPlayer abc=new SoccerBallPlayer("Abc");
		SoccerBallPlayer xyz=new SoccerBallPlayer("Xyz");
		
		BasketBallPlayer usher=new BasketBallPlayer("Usher");
		BasketBallPlayer usher2=new BasketBallPlayer("Usher2");
		
		Team<FootBallPlayer> madrid=new Team<>("Madrid");
		madrid.addPlayers(ronaldo);
		//madrid.addPlayers(abc);validation by adding generic class
		Team<FootBallPlayer> brazil=new Team<>("Brazil");
		brazil.addPlayers(messi);
		
		
		Team<SoccerBallPlayer> abcd=new Team<>("ABCD");
		abcd.addPlayers(abc);
		Team<SoccerBallPlayer> wxyz=new Team<>("WXYZ");
		wxyz.addPlayers(xyz);
		
		
		Team<BasketBallPlayer> efgh=new Team<>("EFGH");
		efgh.addPlayers(usher);
		Team<BasketBallPlayer> ijkl=new Team<>("IJKL");
		ijkl.addPlayers(usher2);
		
		madrid.matchResult(brazil, 3, 2);//football
		abcd.matchResult(wxyz, 1, 2);//soccer
		efgh.matchResult(ijkl, 2, 2);//basketball
		madrid.matchResult(brazil, 4, 2);
		madrid.matchResult(brazil, 1, 3);
		abcd.matchResult(wxyz, 2, 3);
		
		System.out.println("Rankings");
		System.out.println("Football");
		System.out.println(madrid.getName()+" : "+madrid.ranking());
		System.out.println(brazil.getName()+" : "+brazil.ranking());
		System.out.println("Soccer");
		System.out.println(abcd.getName()+" : "+abcd.ranking());
		System.out.println(wxyz.getName()+" : "+wxyz.ranking());
		System.out.println("Basketball");
		System.out.println(efgh.getName()+" : "+efgh.ranking());
		System.out.println(ijkl.getName()+" : "+ijkl.ranking());
		
		
		System.out.println("Number of Players in Football Team : "+madrid.getNumberofPlayers());
		System.out.println("Number of Players in Football Team : "+brazil.getNumberofPlayers());
		System.out.println("Number of Players in Soccer Team : "+abcd.getNumberofPlayers());
		System.out.println("Number of Players in Soccer Team : "+wxyz.getNumberofPlayers());
		System.out.println("Number of Players in Basketball Team : "+efgh.getNumberofPlayers());
		System.out.println("Number of Players in Basketball Team : "+ijkl.getNumberofPlayers());
		
		System.out.println(brazil.compareTo(madrid));
		System.out.println(abcd.compareTo(wxyz));
		System.out.println(efgh.compareTo(ijkl));
		
	}

}
