import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Players implements Iterable<Player> {
	private List<Player> players;
	Random rand = new Random();

	public Players() {
		players = new ArrayList<Player>();
	}
	
	
	/**
	 * add player p
	 */
	public void addPlayer(Player p) {
		
		players.add(p);
		System.out.println(" Add Player " + p.getMyName());
	}
	
	/**
	 * remove player p
	 */
	public void removePlayer(Player p) {
		
		Iterator<Player> it = iterator();
		
		for (Player pl : players) {
			if (pl.equals(p)) {
				it.remove();
				System.out.println(" remove Player " +pl.getMyName() );
				break;
			}		
		}
	}

	/**
	 * 
	 * @return a player from the list players
	 */
	public Player getRandomPlayer() {
		
		int r = rand.nextInt(getCount());
		return players.get(r);
	}
	
	/**
	 * @return a player which is not p.
	 */
	public Player getOther(Player p) {
		
		while(true) {
			Player temp = getRandomPlayer();
			if (! p.equals(temp))   // check maybe need deep clone
				return temp;
		}
	}

	/**
	 * @return the number of players
	 */
	public int getCount() {
		
		return players.size();
	}

	
	public Players getThis() {
		return this;
	}
	
	@Override
	public Iterator<Player> iterator() {
		
		return players.iterator();	
	}
	

}
