/**
 * 
 */
package studentOrientation.buildPlanner.simpleFactory.implementation;

import studentOrientation.buildPlanner.activity.implementation.BusTour;
import studentOrientation.buildPlanner.activity.implementation.ByFootTour;
import studentOrientation.buildPlanner.activity.interfaces.TourI;
import studentOrientation.buildPlanner.simpleFactory.interfaces.TourStoreFactoryI;
import studentOrientation.util.APPLICATION_CONSTANTS.TOUR;

/**
 * @author Madhwani_Harsha_Doshi_Harshit
 *
 */
public class TourStoreFactoryImpl implements TourStoreFactoryI{

	/**
	 * Factory retrieves concrete class to tour type
	 */
	@Override
	public TourI createTour(TOUR tourChoice) {
		if (TOUR.BUS_RIDE.equals(tourChoice)) {
			return new BusTour();
		}else if(TOUR.BY_FOOT.equals(tourChoice)){
			return new ByFootTour();
		}else{
			return null;
		}
	}
	
}
