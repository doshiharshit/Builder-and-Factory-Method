/**
 * 
 */
package studentOrientation.buildPlanner.simpleFactory.interfaces;

import studentOrientation.buildPlanner.activity.interfaces.DormI;
import studentOrientation.util.APPLICATION_CONSTANTS.DORM;

/**
 * @author Madhwani_Harsha_Doshi_Harshit
 *
 */
public interface DormStoreFactoryI {
	public DormI createDorm(DORM dormChoice);
}
