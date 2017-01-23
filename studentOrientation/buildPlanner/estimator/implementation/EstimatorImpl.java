/**
 * 
 */
package studentOrientation.buildPlanner.estimator.implementation;

import studentOrientation.buildPlanner.estimator.interfaces.EstimatorI;
import studentOrientation.util.APPLICATION_CONSTANTS;
import studentOrientation.util.Logger;

/**
 * @author Madhwani_Harsha_Doshi_Harshit
 *
 */
public class EstimatorImpl implements EstimatorI{
	
	private Float cost;
	private Integer marginCost;
	private Integer duration;
	private Integer effort;
	private Integer carbonFootprint;
	private String currency;
	
	@Override
	public String toString() {
		return "Estimator: " + getEstimation();
	}

	/**
	 * @return String
	 * Returns estimation factors: cost, duration, effort, carbon footprint
	 */
	@Override
	public String getEstimation() {
		Integer hours = getDuration() / 60;
		Integer mins = getDuration() % 60;
		return "Cost: " + getCurrency() + getCost() + ", Duration: " + String.format("%02d", hours) + " hr(s) " + String.format("%02d", mins) + " min(s), Effort: " + getEffort() + "cal, Carbon Footprint: " + getCarbonFootprint() + "co2";
	}

	/**
	 * @return Float
	 * Gets Cost
	 */
	@Override
	public Float getCost() {
		return cost;
	}

	/**
	 * @param Float
	 * Sets Cost
	 */
	@Override
	public void setCost(Float cost) {
		this.cost = cost;
	}

	/**
	 * @return Integer
	 * Gets Duration
	 */
	@Override
	public Integer getDuration() {
		return duration;
	}

	/**
	 * @param Integer
	 * Sets Duration
	 */
	@Override
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	/**
	 * @return Integer
	 * Gets Effort
	 */
	@Override
	public Integer getEffort() {
		return effort;
	}

	/**
	 * @param Integer
	 * Sets Effort
	 */
	@Override
	public void setEffort(Integer effort) {
		this.effort = effort;
	}

	/**
	 * @return Integer
	 * Gets Carbon Footprint
	 */
	@Override
	public Integer getCarbonFootprint() {
		return carbonFootprint;
	}

	/**
	 * @param Integer
	 * Sets Carbon Footprint
	 */
	@Override
	public void setCarbonFootprint(Integer carbonFootprint) {
		this.carbonFootprint = carbonFootprint;
	}

	/**
	 * @param Integer
	 * Sets Cost Margin
	 */
	@Override
	public void setCostMargin(Integer marginVal) {
		this.marginCost = marginVal;
	}

	/**
	 * @return Integer
	 * Gets Cost Margin
	 */
	@Override
	public Integer getCostMargin() {
		return marginCost;
	}
	
	/**
	 * @return Float
	 * Calculate Final cost.
	 */
	@Override
	public Float calculateCosting() {
		if(getCostMargin() != APPLICATION_CONSTANTS.ZERO){
			this.setCost(getCost() + (getCost() * ( getCostMargin() / new Float(100) )));
		}
		return getCost();
	}
	
	/**
	 * Initialize Estimator.
	 * @param cost
	 * @param duration
	 * @param effort
	 * @param carbonFootprint
	 */
	public EstimatorImpl(Float cost, Integer duration, Integer effort, Integer carbonFootprint) {
		Logger.writeMessage("Estimator Constructor called", Logger.DebugLevel.CONSTRUCTOR);
		initValues(cost, duration, effort, carbonFootprint);
		setCostMargin(APPLICATION_CONSTANTS.ZERO);
		setCurrency(APPLICATION_CONSTANTS.CURRENCY[0]);
	}

	public EstimatorImpl() {
		Logger.writeMessage("Estimator Constructor called", Logger.DebugLevel.CONSTRUCTOR);
	}

	/**
	 * Supports function to initialize
	 * @param cost
	 * @param duration
	 * @param effort
	 * @param carbonFootprint
	 */
	@Override
	public void initValues(Float cost, Integer duration, Integer effort, Integer carbonFootprint) {
		setCost(cost);
		setDuration(duration);
		setEffort(effort);
		setCarbonFootprint(carbonFootprint);
	}

	/**
	 * @return String
	 * Gets Currency
	 */
	@Override
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param String
	 * Sets Currency
	 */
	@Override
	public void setCurrency(String currencyIn) {
		currency = currencyIn;
	}
	
}
