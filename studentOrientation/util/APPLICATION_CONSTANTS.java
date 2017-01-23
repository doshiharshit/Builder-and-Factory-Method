/**
 * APPLICATION_CONSTANTS - All Constants related to Applications
 */
package studentOrientation.util;

/**
 * @author Madhwani_Harsha_Doshi_Harshit
 *
 */
public enum APPLICATION_CONSTANTS {;
	
	public static enum BOOKSTORE {
		UNIVERSITY, MANDO
	};
	
	public static enum TOUR {
		BY_FOOT, BUS_RIDE
	};
	
	public static enum DORM {
		BY_FOOT, ONLINE
	};
	
	public static enum COURSE_REGISTRATION {
		FORM, LAB
	};
	
	public static String  OUTPUT_FILENAME	 = "Output.txt";	
	public static Float   BOOK_COST_VAL		 = new Float(100.0);
	public static Float   TOUR_COST_VAL[]	 = { new Float(2.0),   new Float(0.10) };
	public static Float   COURSE_COST_VAL	 = new Float(500.0);
	public static Float   DORM_COST_VAL		 = new Float(300.0);
	public static Integer DURATION[]		 = { 60,120,240, 360 };
	public static Integer EFFORT[]			 = {  5, 10, 99, 200 };
	public static Integer CARBON_FOOTPRINT[] = { 10, 50, 75, 100 };
	public static Integer MARGIN[]			 = {  2,  -3,  5	 };
	public static Integer ACTIVITYCOUNT		 = 4;
	public static Integer ZERO				 = 0;
	public static String CURRENCY[]			 = { "$", "£", "¥", "Rupees" };
}
