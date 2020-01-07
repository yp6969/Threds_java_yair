import java.util.Iterator;
import java.util.List;

public class Players implements Iterable<Player> {
	
	private List<Player> players;

	/**
	 * add player p
	 */
	public void addPlayer(Player p) {
		players.add(p);
	}
	
	/**
	 * remove player p
	 */
	public void removePlayer(Player p) {
		players.remove(p);
	}

	
	/**
	 * @return a player which is not p.
	 */
	public Player getOther(Player p) {
		players.get(Game.random % players.size() );
	}

	/**
	 * @return the number of players
	 */
	public int getCount() {
		return players.size();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<Player> iterator() {
		return players.iterator();
	}

}
