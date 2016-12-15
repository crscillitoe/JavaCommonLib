package crscillitoeCommonLib;

public class crscillitoeMath {

	/**
	 * Returns a random integer between floor and ceiling, inclusive
	 * @param floor
	 * @param ceiling
	 * @return
	 */
	public static int randInt(int floor, int ceiling) {
		return (int)(Math.random() * ((ceiling + 1) - floor)) + floor;
	}
	
	/**
	 * Returns a random double between floor and ceiling, inclusive
	 * @param floor
	 * @param ceiling
	 * @return
	 */
	public static double random(int floor, int ceiling) {
		return (Math.random() * ((ceiling) - floor)) + floor;
	}
	
	/**
	 * Returns a random double between 0 and ceiling, inclusive
	 * @param ceiling
	 * @return
	 */
	public static double random(int ceiling) {
		return random(0 , ceiling);
	}
}
