

public class Ball {
	
	private Player owner;
	private Player receiver;
	private boolean in_flight;
	
	//*******************************************************************************//

	public Player getOwner() {
		
		return this.owner; 		// maybe need copy -  for encapsulation
	}
		
	public void setOwner(Player p) {
		
		this.owner = p;
	}
	
	//*******************************************************************************//
	
	public Player getDestination() {
		
		return this.receiver; 		// maybe need copy -  for encapsulation
	}
		
	public void setDestination(Player pd) {
		
		this.receiver = pd;
	}
	
	//*******************************************************************************//
	
	public boolean getInFlight() {
		
		return in_flight;
	}
	
	
	public void setInFlight(boolean b) {
		
		this.in_flight = b;
	}
	
	

}
