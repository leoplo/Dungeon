package dungeon;

public class DungeonMain {
	
	public static void main(String[] args) {
		/* nom player stdin scanner pour new Player() */
		Player player = new Player("joueur");
		Dungeon dungeon = new Dungeon();
		dungeon.initializeLevel1();
		dungeon.console.presentation();
		if (dungeon.start()) {
			dungeon.initializeLevel2();
			if (dungeon.start()) {
				dungeon.initializeLevel1();
				dungeon.start();
			}
		}
		System.out.println("Finish !");
	}
}
