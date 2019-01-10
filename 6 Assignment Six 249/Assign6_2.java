/*
 * Main program
 * Nick VonDollen
 * October 2016
 */
public class Assign6_2 {

	public static void main(String[] args) {
		Map map = new Map(10,20);
		Map display = new Map(10,20);
		map.setMapLocation(2,1,'%');
		map.copyTo(display);
		display.setMapLocation(3, 4, '@');
		display.draw();
	}
}
