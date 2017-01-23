/**
 * Driver Class
 */
package studentOrientation.driver;

import studentOrientation.buildPlanner.implementation.MyOrientationImpl;
import studentOrientation.buildPlanner.implementation.StudentPlanner;
import studentOrientation.buildPlanner.interfaces.OrientationToolI;
import studentOrientation.buildPlanner.interfaces.StudentOrientationI;
import studentOrientation.util.APPLICATION_CONSTANTS;
import studentOrientation.util.Results;

/**
 * @author Madhwani_Harsha_Doshi_Harshit
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StudentOrientationI sOrientationI = 
				new StudentPlanner(
						APPLICATION_CONSTANTS.BOOKSTORE.MANDO,
						APPLICATION_CONSTANTS.DORM.BY_FOOT,
						APPLICATION_CONSTANTS.TOUR.BUS_RIDE,
						APPLICATION_CONSTANTS.COURSE_REGISTRATION.LAB);
		
		OrientationToolI oToolI = new MyOrientationImpl();
		String estimation = oToolI.construct(sOrientationI).getEstimation();
		Results resultObj = new Results();
		resultObj.setMessage(estimation);
		resultObj.writeSchedulesToScreen();
	}

}
