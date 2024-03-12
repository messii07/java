class player
{
	public player()
	{
	String pname;
	int innings,runs,notouts;
	}
	public void showdata(String pname, int innings, int runs, int notouts)
	{
		System.out.println("Player name: "+pname);
		System.out.println("Innings: "+innings);
		System.out.println("Runs scored: "+runs);
		System.out.println("Not outs: "+notouts);
	}
	
	public void calcAvg(int runs, int innings, int notouts)
	{
		int BatAvg=runs/(innings-notouts);
		System.out.println("Batting average of player is: "+BatAvg);
	}
	public static void main(String args[])
	{
		player p=new player();
		p.showdata("virat",10,100,4);
		p.calcAvg(100,10,4);
	}
}
