/**
 * 
 */
package studentOrientation.buildPlanner.simpleFactory.implementation;

import studentOrientation.buildPlanner.activity.implementation.ByFootDorm;
import studentOrientation.buildPlanner.activity.implementation.OnlineDorm;
import studentOrientation.buildPlanner.activity.interfaces.DormI;
import studentOrientation.buildPlanner.simpleFactory.interfaces.DormStoreFactoryI;
import studentOrientation.util.APPLICATION_CONSTANTS.DORM;

/**
 * @author Madhwani_Harsha_Doshi_Harshit
 *
 */
public class DormStoreFactoryImpl implements DormStoreFactoryI{

	/**
	 * Factory retrieves concrete class to dorm type
	 */
	@Override
	public DormI createDorm(DORM dormChoice) {
		if (DORM.ONLINE.equals(dormChoice)) {
			return new OnlineDorm();
		}else if(DORM.BY_FOOT.equals(dormChoice)){
			return new ByFootDorm();
		}else{
			return null;
		}
	}
	
}
