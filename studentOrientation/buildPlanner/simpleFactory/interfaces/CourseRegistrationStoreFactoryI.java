/**
 * 
 */
package studentOrientation.buildPlanner.simpleFactory.interfaces;

import studentOrientation.buildPlanner.activity.interfaces.CourseRegistrationI;
import studentOrientation.util.APPLICATION_CONSTANTS.COURSE_REGISTRATION;

/**
 * @author Madhwani_Harsha_Doshi_Harshit
 *
 */
public interface CourseRegistrationStoreFactoryI {
	public CourseRegistrationI createRegistration(COURSE_REGISTRATION courseRegistrationChoice);
}
