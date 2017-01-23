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
public class OnlineDorm implements DormI {
	private EstimatorI estimatorI;
	
	public OnlineDorm() {
		Logger.writeMessage("Dorm By Online Constructor called", Logger.DebugLevel.CONSTRUCTOR);
		estimatorI = 
				new EstimatorImpl(
						APPLICATION_CONSTANTS.DORM_COST_VAL,
						APPLICATION_CONSTANTS.DURATION[0],
						APPLICATION_CONSTANTS.EFFORT[2],
						APPLICATION_CONSTANTS.CARBON_FOOTPRINT[2]);
	}
	
	@Override
	public EstimatorI estimatorI() {
		return estimatorI;
	}

	@Override
	public String toString() {
		return estimatorI().getEstimation();
	}
}
