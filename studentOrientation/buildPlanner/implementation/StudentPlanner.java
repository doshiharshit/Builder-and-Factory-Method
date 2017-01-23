/**
 * 
 */
package studentOrientation.buildPlanner.implementation;

import studentOrientation.buildPlanner.activity.interfaces.ActivityI;
import studentOrientation.buildPlanner.estimator.interfaces.EstimatorI;
import studentOrientation.buildPlanner.interfaces.StudentOrientationI;
import studentOrientation.buildPlanner.simpleFactory.implementation.BookStoreFactoryImpl;
import studentOrientation.buildPlanner.simpleFactory.implementation.CourseRegistrationStoreFactoryImpl;
import studentOrientation.buildPlanner.simpleFactory.implementation.DormStoreFactoryImpl;
import studentOrientation.buildPlanner.simpleFactory.implementation.TourStoreFactoryImpl;
import studentOrientation.buildPlanner.simpleFactory.interfaces.BookStoreFactoryI;
import studentOrientation.buildPlanner.simpleFactory.interfaces.CourseRegistrationStoreFactoryI;
import studentOrientation.buildPlanner.simpleFactory.interfaces.DormStoreFactoryI;
import studentOrientation.buildPlanner.simpleFactory.interfaces.TourStoreFactoryI;
import studentOrientation.util.APPLICATION_CONSTANTS;
import studentOrientation.util.Logger;
import studentOrientation.util.APPLICATION_CONSTANTS.BOOKSTORE;
import studentOrientation.util.APPLICATION_CONSTANTS.COURSE_REGISTRATION;
import studentOrientation.util.APPLICATION_CONSTANTS.DORM;
import studentOrientation.util.APPLICATION_CONSTANTS.TOUR;

/**
 * @author Madhwani_Harsha_Doshi_Harshit
 *
 */
public class StudentPlanner implements StudentOrientationI {
	private ActivityI[] activities;
	private String estimation;
	
	/**
	 * Calls Factory Method to get concrete objects of Activities
	 * @param bookStoreChoice
	 * @param dormChoice
	 * @param tourChoice
	 * @param registrationChoice
	 */
	public StudentPlanner(BOOKSTORE bookStoreChoice, 
			DORM dormChoice, TOUR tourChoice, COURSE_REGISTRATION registrationChoice) {	
		Logger.writeMessage("StudentPlanner Constructor called", Logger.DebugLevel.CONSTRUCTOR);
		BookStoreFactoryI bStore = new BookStoreFactoryImpl();
		TourStoreFactoryI tStore = new TourStoreFactoryImpl();
		DormStoreFactoryI dStore = new DormStoreFactoryImpl();
		CourseRegistrationStoreFactoryI rStore = new CourseRegistrationStoreFactoryImpl();
		activities = new ActivityI[APPLICATION_CONSTANTS.ACTIVITYCOUNT];
		activities[0] = bStore.createBookStore(bookStoreChoice);
		activities[1] = tStore.createTour(tourChoice);
		activities[2] = dStore.createDorm(dormChoice);
		activities[3] = rStore.createRegistration(registrationChoice);
	}
	
	/**
	 * Build Orientation Plan
	 */
	@Override
	public void buildOrientationPlan() {
		for(int i=0; i<activities.length; i++){
			activities[i].estimatorI().calculateCosting();
		}
	}

	@Override
	public String toString() {
		return activities[0].estimatorI().getEstimation() + "\n"
				+ activities[1].estimatorI().getEstimation() + "\n"
				+ activities[2].estimatorI().getEstimation() + "\n"
				+ activities[3].estimatorI().getEstimation() + "\n";
	}
	
	/**
	 * Sum all the activities
	 */
	@Override
	public void buildEstimation() {
		EstimatorI myEstimatorI = activities[0].estimatorI();
		for(int i=1; i<activities.length; i++){
			EstimatorI tempEstimatorI = activities[i].estimatorI();
			myEstimatorI.setCost( myEstimatorI.getCost() + tempEstimatorI.getCost() );
			myEstimatorI.setDuration( myEstimatorI.getDuration() + tempEstimatorI.getDuration() );
			myEstimatorI.setEffort( myEstimatorI.getDuration() + tempEstimatorI.getDuration() );
			myEstimatorI.setCarbonFootprint( myEstimatorI.getCarbonFootprint() + tempEstimatorI.getCarbonFootprint() );
		}
		setEstimation( myEstimatorI.toString() );
	}

	/**
	 * @return String
	 * Gets Estimation
	 */
	@Override
	public String getEstimation() {
		return estimation;
	}

	/**
	 * Sets Estimation
	 * @param String
	 */
	public void setEstimation(String estimation) {
		this.estimation = estimation;
	}
	
}
