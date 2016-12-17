package JavaCommonLib;

public class JavaMath {

  /**
   * Returns the minimum integer within the given array
   * @param toCheck
   * @return
   */
  public static int minValue(Iterable<Integer> toCheck) {
    int x = Integer.MAX_VALUE;
    for(Integer i : toCheck) {
      if(i < x) {
        x = i;
      }
    }
    return x;
  }
	
	/**
	 * Returns the maximum integer within the given array
	 * @param toCheck
	 * @return
	 */
	public static int maxValue(Iterable<Integer> toCheck) {
		int x = Integer.MIN_VALUE;
		for(Integer i : toCheck) {
			if(i > x) {
				x = i;
			}
		}
		return x;
	}

	/**
	 * Returns a random integer between floor and ceiling, inclusive
	 * 
	 * @param floor
	 * @param ceiling
	 * @return
	 */
	public static int randInt(int floor, int ceiling) {
		return (int) (Math.random() * ((ceiling + 1) - floor)) + floor;
	}

	/**
	 * Returns a random double between floor and ceiling, inclusive
	 * 
	 * @param floor
	 * @param ceiling
	 * @return
	 */
	public static double random(int floor, int ceiling) {
		return (Math.random() * ((ceiling) - floor)) + floor;
	}

	/**
	 * Returns a random double between 0 and ceiling, inclusive
	 * 
	 * @param ceiling
	 * @return
	 */
	public static double random(int ceiling) {
		return random(0, ceiling);
	}

	/**
	 * Scales val from valFloor to valCeil into a new val from arbFloor to
	 * arbCeil
	 * 
	 * @param val
	 * @param valFloor
	 * @param valCeil
	 * @param arbFloor
	 * @param arbCeil
	 * @return
	 */
	public static float map(float val, float valFloor, float valCeil,
			float arbFloor, float arbCeil) {

		float valDif = valCeil - valFloor;
		float arbDif = arbCeil - arbFloor;

		return arbDif * (val / valDif);
	}
	

	/**
	 * Returns hypotenuse of right triangle with side lengths a, b
	 * 
	 * @param a 
	 * @param b
	 * @return
	 */
	public static double hypotenuse(double a, double b) {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}

	/**
	 * Returns double-array of solutions to 2nd-Degree polynomial, only 
	 * 		will return if real solutions
	 * ax^2 + bx + c
	 * 
	 * @param a 
	 * @param b
	 * @param c
	 * @return
	 */
	public static double[] polysmltReal(double a, double b, double c)  {
		if (a == 0)
		{
			try {
				throw new Exception("Dividing by zero");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if(Math.pow(b, 2) - 4 * a * c < 0)
		{
			try {
				throw new Exception("Imaginary solutions");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		double[] solutions = {
				(-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a),
				(-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a) };
		return solutions;
	}

	/**
	 * Returns String-array of solutions to 2nd-Degree polynomial, includes imaginary solutions
	 * ax^2 + bx + c
	 * 
	 * @param a 
	 * @param b
	 * @param c
	 * @return
	 */
	public static String[] polysmltImaginary(double a, double b, double c) {

		if (a == 0) {
			try {
				throw new Exception("Dividing by zero");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		} else {
			String sol1 = "" + (-b / (2 * a)) + "+i*"
					+ Math.sqrt(Math.abs(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			String sol2 = "" + (-b / (2 * a)) + "-i*"
					+ Math.sqrt(Math.abs(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			String[] sols = { sol1, sol2 };
			return sols;
		}

	}

}

