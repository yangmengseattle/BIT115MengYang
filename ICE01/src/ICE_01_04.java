import becker.robots.*;

/*
Important Notes:

1)  Make absolutely sure that your becker.jar file is in the list of jGRASP's custom classpaths:
		You can check by clicking on the "Settings" menu, 
		then clicking on the "PATH/CLASSPATH" menu option, then "Workspace", then the "CLASSPATHs" tab
		and then making sure that the becker.jar file is in the list.
		If not, click "New" to add becker.jar to jGRASP

2)  Make sure that the name of the file is the same as the name of the class.
        The name of the class is found betwen the words "class", and "extends".
        For exmaple, the name of this class is "Starting_Template", which is the name of the file.
        You'll notice that the name of the class has ".java" on the end, yet the name of the
        leaves the ".java" off.
*/

public class ICE_01_04 extends Object
{
   public static void main(String[] args)
   { 
        City theCity= new City();
        Robot karel = new Robot(theCity, 1, 0, Direction.EAST, 0);
        Thing theThing = new Thing(theCity, 2, 2);
      
        new Wall(theCity, 2, 2, Direction.EAST);
        new	Wall(theCity, 2, 2, Direction.NORTH);
        new Wall(theCity, 2, 2, Direction.WEST);
        
        new Wall(theCity, 3, 2, Direction.SOUTH);
        
        /* put your code here*/
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        
    }
}

