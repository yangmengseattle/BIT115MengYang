import becker.robots.*;

/*
Important Notes:

1) Make absolutely sure that your becker.jar file is in the list of jGRASP's custom classpaths:
   You can check by clicking on the "Settings" menu, 
   then clicking on the "PATH/CLASSPATH" menu option, then "Workspace", then the "CLASSPATHs" tab
   and then making sure that the becker.jar file is in the list.
   If not, click "New" to add becker.jar to jGRASP

2) Make sure that the name of the file is the same as the name of the class.
   The name of the class is found between the words "class", and "extends".
   For example, the name of this class is "ICE_01_Tutorial_1", which is the name of the file.
   You'll notice that the name of the file has ".java" on the end, yet the name of the class
   leaves the ".java" off. IN THE NAME OF THE CLASS YOU MUST LEAVE THE .java EXTENSION OFF
   OR THE PROGRAM WILL NOT WORK!
   
3) Remember: Java is CASE-SENSITIVE! If you use the wrong case, or mix cases, the program will not work!

4) Remember: Streets go left and right (West and East), while Avenues go up and down (North and South)   
*/

public class ICE_01_Tutorial_1 extends Object {
	public static void main(String[] args) {
		City toronto = new City();
		/*
		 * We could have optionally included arguments in the City() parameter
		 * to set the size of the displayed City and/or the starting position of
		 * the City, for example: City(4,4) which is number of displayed streets
		 * and avenues or: City(-2,-2,6,6) which is starting position and then
		 * number of streets and avenues City(first visible street, first
		 * visible avenue, number streets, number avenues) The default displayed
		 * size of the City() without arguments is 6 streets and 6 avenues
		 */

		Robot karel = new Robot(toronto, 3, 0, Direction.EAST, 0);
		// karel starts out on Street 3 and Avenue 0
		new Thing(toronto, 3, 2);
		// the Thing starts out on Street 3 and Avenue 2
		karel.move();
		karel.move();
		karel.pickThing(); 
		karel.putThing();
		karel.turnLeft();
		karel.move();
	}
}