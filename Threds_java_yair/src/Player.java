public class Player extends Thread {
	private Game game;
	private int name;
	private int timeMS; // the active time in miliseconds.

	/**
	 * @param name
	 *            - the name of the player
	 * @param game
	 *            - the game the player participate
	 * @param timeActiveM
	 *            - the time (minutes) the player will play
	 */
	public Player(int name, Game game, int timeActiveM) {
		super();
		this.name = name;
		this.game = game;
		this.timeMS = timeActiveM * Game.TIME_SIMULATION_FACTOR;
	}

	public void run() {
		
		

	}

}
