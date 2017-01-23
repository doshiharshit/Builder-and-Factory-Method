/**
 * 
 */
package studentOrientation.buildPlanner.activity.implementation;

import studentOrientation.buildPlanner.activity.interfaces.CourseRegistrationI;
import studentOrientation.buildPlanner.estimator.implementation.EstimatorImpl;
import studentOrientation.buildPlanner.estimator.interfaces.EstimatorI;
import studentOrientation.util.APPLICATION_CONSTANTS;
import studentOrientation.util.Logger;

/**
 * @author Madhwani_Harsha_Doshi_Harshit
 *
 */
public class FormRegistration implements CourseRegistrationI {
	private EstimatorI estimatorI;
	
	/**
	 * Initialize default values
	 */
	public FormRegistration() {
		Logger.writeMessage("Registration using Form Constructor called", Logger.DebugLevel.CONSTRUCTOR);
		estimatorI = 
				new EstimatorImpl(
						APPLICATION_CONSTANTS.COURSE_COST_VAL,
						APPLICATION_CONSTANTS.DURATION[0],
						APPLICATION_CONSTANTS.EFFORT[0],
						APPLICATION_CONSTANTS.CARBON_FOOTPRINT[1]);
		estimatorI.setCostMargin(APPLICATION_CONSTANTS.MARGIN[1]);
	}
	
	/**
	 * @return EstimatorI
	 * Uses Estimator
	 */
	@Override
	public EstimatorI estimatorI() {
		return estimatorI;
	}

	@Override
	public String toString() {
		return estimatorI().getEstimation();
	}
}
