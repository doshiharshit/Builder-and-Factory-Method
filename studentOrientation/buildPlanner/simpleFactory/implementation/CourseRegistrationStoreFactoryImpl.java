/**
 * 
 */
package studentOrientation.buildPlanner.simpleFactory.implementation;

import studentOrientation.buildPlanner.activity.implementation.FormRegistration;
import studentOrientation.buildPlanner.activity.implementation.LabRegistration;
import studentOrientation.buildPlanner.activity.interfaces.CourseRegistrationI;
import studentOrientation.buildPlanner.simpleFactory.interfaces.CourseRegistrationStoreFactoryI;
import studentOrientation.util.APPLICATION_CONSTANTS.COURSE_REGISTRATION;

/**
 * @author Madhwani_Harsha_Doshi_Harshit
 *
 */
public class CourseRegistrationStoreFactoryImpl implements CourseRegistrationStoreFactoryI{

	/**
	 * Factory retrieves concrete class to course registration type
	 */
	@Override
	public CourseRegistrationI createRegistration(COURSE_REGISTRATION courseRegistrationChoice) {
		if (COURSE_REGISTRATION.FORM.equals(courseRegistrationChoice)) {
			return new FormRegistration();
		}else if(COURSE_REGISTRATION.LAB.equals(courseRegistrationChoice)){
			return new LabRegistration();
		}else{
			return null;
		}
	}
	
}
