/**
 * 
 */
package studentOrientation.buildPlanner.simpleFactory.interfaces;

import studentOrientation.buildPlanner.activity.interfaces.TourI;
import studentOrientation.util.APPLICATION_CONSTANTS.TOUR;

/**
 * @author Madhwani_Harsha_Doshi_Harshit
 *
 */
public interface TourStoreFactoryI {
	public TourI createTour(TOUR tourChoice);
}
