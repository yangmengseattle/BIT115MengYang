import becker.robots.*;

public class ICE_01_Tutorial_2 extends Object {
	public static void main(String[] args) {
		City toronto = new City();
		Robot Jo = new Robot(toronto, 3, 0, Direction.EAST, 0);
		Thing theThing = new Thing(toronto, 3, 2);
		Wall oops = new Wall(toronto, 3, 1, Direction.EAST);

		Jo.move();
		Jo.turnLeft();
		Jo.move();
		Jo.turnLeft();
		Jo.move();
		Jo.turnLeft();
		Jo.move();
		Jo.move();
		Jo.turnLeft();
		Jo.move(); // start moving - woot!
		Jo.move();
		Jo.turnLeft();
		Jo.move();
		Jo.pickThing();
		Jo.putThing();

	}
}