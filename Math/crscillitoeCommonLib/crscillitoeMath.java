package crscillitoeCommonLib;

public class crscillitoeMath {

	/**
	 * Returns a random integer between floor and ceiling, inclusive
	 * @param floor
	 * @param ceiling
	 * @return
	 */
	public static int randInt(int floor, int ceiling) {
		return (int)(Math.random() * (ceiling - floor)) + floor;
	}
	
}
