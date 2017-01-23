/**
 * 
 */
package studentOrientation.buildPlanner.activity.implementation;

import studentOrientation.buildPlanner.activity.interfaces.DormI;
import studentOrientation.buildPlanner.estimator.implementation.EstimatorImpl;
import studentOrientation.buildPlanner.estimator.interfaces.EstimatorI;
import studentOrientation.util.APPLICATION_CONSTANTS;
import studentOrientation.util.Logger;

/**
 * @author Madhwani_Harsha_Doshi_Harshit
 *
 */
public class ByFootDorm implements DormI {
	private EstimatorI estimatorI;
	
	/**
	 * Initialize default values
	 */
	public ByFootDorm() {
		Logger.writeMessage("Dorm By Foot Constructor called", Logger.DebugLevel.CONSTRUCTOR);
		estimatorI = 
				new EstimatorImpl(
						new Float(APPLICATION_CONSTANTS.DORM_COST_VAL),
						APPLICATION_CONSTANTS.DURATION[2],
						APPLICATION_CONSTANTS.EFFORT[2],
						APPLICATION_CONSTANTS.CARBON_FOOTPRINT[0]);
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
