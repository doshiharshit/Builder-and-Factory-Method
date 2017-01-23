/**
 * 
 */
package studentOrientation.buildPlanner.estimator.interfaces;

/**
 * @author Madhwani_Harsha_Doshi_Harshit
 *
 */
public interface CostI{
	public Float getCost();
	public void setCost(Float cost);
	public void setCostMargin(Integer marginVal);
	public Integer getCostMargin();
	public Float calculateCosting();
}
