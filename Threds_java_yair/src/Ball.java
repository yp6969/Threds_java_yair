public class Ball {
	private Player owner;
	private Player receiver;
	private boolean in_flight;
	
	public Ball(Player owner ,Player receiver , boolean in_flight ) {
		this.owner = owner;
		this.receiver = receiver;
		this.in_flight = in_flight;
	}

}
