/**
 * An example for playing a Mesirot game
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		/*Game game = new Game(30, 10, 100, 0, 100, 0);
		game.start();*/
		
		long time = System.currentTimeMillis();
		long runTime = 1000;
		long temp = System.currentTimeMillis()-time;
		
		while( runTime > temp ) {
			temp = System.currentTimeMillis()-time;
			System.out.println("in way");
		}
		
		System.out.println(temp);
	}
}