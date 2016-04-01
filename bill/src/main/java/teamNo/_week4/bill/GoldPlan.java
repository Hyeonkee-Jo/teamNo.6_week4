package teamNo._week4.bill;

public class GoldPlan implements Plan{
	double base_cost;
	String grade;
	double addline_cost;
	double overflow_traffic_cost;
	int base_traffic;
	
	public GoldPlan()
	{
		this.base_cost = 49.95;
		this.grade = "Gold";
		this.addline_cost = 14.50;
		this.overflow_traffic_cost = 0.45;
		this.base_traffic = 1000;
	}
	
	public void setBasecost(double base_cost)
	{
		this.base_cost = base_cost;
	}
	
	public double getBasecost()
	{
		return this.base_cost;
	}
	
	public void setAddLineCost(double addline_cost)
	{
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
	
	public double getOverflowTrafficCost()
	{
		return this.overflow_traffic_cost;
	}
	
	public void setBaseTraffic(int base_traffic)
	{
		this.base_traffic = base_traffic;
	}
	
	public int getBaseTraffic()
	{
		return this.base_traffic;
	}
}
