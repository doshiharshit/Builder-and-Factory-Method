/**
 * 
 */
package studentOrientation.buildPlanner.implementation;

import studentOrientation.buildPlanner.interfaces.OrientationToolI;
import studentOrientation.buildPlanner.interfaces.StudentOrientationI;

/**
 * @author Madhwani_Harsha_Doshi_Harshits
 *
 */
public class MyOrientationImpl implements OrientationToolI {

	/**
	 * @param StudentOrientationI
	 * @return StudentOrientationI
	 * Builds Orientation Plan
	 */
	@Override
	public StudentOrientationI construct(StudentOrientationI sOObjIn) {
		sOObjIn.buildOrientationPlan();
		sOObjIn.buildEstimation();
		return sOObjIn;
	}
	
	
}
