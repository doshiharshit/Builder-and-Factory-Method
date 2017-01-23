/**
 * 
 */
package studentOrientation.buildPlanner.activity.implementation;

import studentOrientation.buildPlanner.activity.interfaces.TourI;
import studentOrientation.buildPlanner.estimator.implementation.EstimatorImpl;
import studentOrientation.buildPlanner.estimator.interfaces.EstimatorI;
import studentOrientation.util.APPLICATION_CONSTANTS;
import studentOrientation.util.Logger;

/**
 * @author Madhwani_Harsha_Doshi_Harshit
 *
 */
public class BusTour implements TourI {
	private EstimatorI estimatorI;
	
	/**
	 * Initialize default values
	 */
	public BusTour() {
		Logger.writeMessage("Bus Tour Constructor called", Logger.DebugLevel.CONSTRUCTOR);
		estimatorI = 
				new EstimatorImpl(
						APPLICATION_CONSTANTS.TOUR_COST_VAL[0],
						APPLICATION_CONSTANTS.DURATION[2],
						APPLICATION_CONSTANTS.EFFORT[1],
						APPLICATION_CONSTANTS.CARBON_FOOTPRINT[3]);
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
