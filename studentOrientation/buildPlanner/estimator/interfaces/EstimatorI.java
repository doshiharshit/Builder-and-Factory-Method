/**
 * 
 */
package studentOrientation.buildPlanner.estimator.interfaces;

/**
 * @author Madhwani_Harsha_Doshi_Harshit
 *
 */
public interface EstimatorI extends CurrencyI, DurationI, EffortI, CarbonFootprintI{

	public String getEstimation();
	public void initValues(Float cost, Integer duration, Integer effort, Integer carbonFootprint);
}
