package teamNo._week4.bill;

public class SilverPlan implements Plan {
	double base_cost;
	int base_traffic;
	String grade;
	double addline_cost;
	double overflow_traffic_cost;
	
	public SilverPlan() {
		this.base_cost = 29.95;
		this.base_traffic = 500;
		this.grade = "SILVER";
		this.addline_cost = 21.5;
		this.overflow_traffic_cost = 0.54;	
	}
	
	public void setBasecost(double base_cost)
	{
		this.base_cost = base_cost;
	}
	
	public double getBasecost() {
		return this.base_cost;
	}
	
	public void setBaseTraffic(int base_traffic)
	{
		this.base_traffic = base_traffic;
	}
	
	public int getBaseTraffic() {
		return this.base_traffic;
	}
	
	public void setAddLineCost(double addline_cost) {
		this.addline_cost = addline_cost;
	}
	
	public double getAddLineCost()
	{
		return this.addline_cost;
	}
	
	public void setOverflowTrafficCost(double overflow_traffic_cost)
	{
		this.overflow_traffic_cost = overflow_traffic_cost;
	}
	
	public double getOverflowTrafficCost() {
		return this.overflow_traffic_cost;
	}
	
}