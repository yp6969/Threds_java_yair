import java.util.Iterator;

public class Player extends Thread {
	private Players players;
	private static Ball ball= new Ball();
	private int name;
	private int timeMS; // the active time in miliseconds.
	private static boolean owner_from_the_start_game = true;
	static int i=0;
	private long startTime;

	/**
	 * @param name
	 *            - the name of the player
	 * @param game
	 *            - the game the player participate
	 * @param timeActiveM
	 *            - the time (minutes) the player will play
	 */
	public Player(int name, Players players, int timeActiveM,long startTime) {
		super();
		this.name = name;
		this.players = players;
		this.timeMS = timeActiveM * Game.TIME_SIMULATION_FACTOR;
		this.startTime = startTime;

	}
	
	public void run() {
		while (i<100) { 
			synchronized (players) {

					players.notifyAll();
				
				if (owner_from_the_start_game) {
					ball.setOwner(players.getRandomPlayer());
					owner_from_the_start_game = false;  		  // never change
				}
			
				while (!this.equals(ball.getOwner()) || players.getCount()<2) {
						try {
							players.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}							
				}	
					
				
				while (true){
					Player dest = players.getOther(this);
				}
					ball.setDestination(dest);
					System.out.println(this.name + " is throwing the ball to" + dest.name );
					ball.setOwner(dest);
					players.notifyAll();
					
		
				}
			i++;
		}
	}
	
	public int getMyName() {
		return name;
	}
	
	public boolean isLive(Player p ) {
		
		long clock = System.currentTimeMillis()-startTime;
		
		if( this.timeMS > clock ) {
			return true;
		}

		return false;
		
	}
	
	

}
