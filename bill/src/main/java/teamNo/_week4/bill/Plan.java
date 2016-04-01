package teamNo._week4.bill;

public interface Plan {
		
	public void setBasecost(double base_cost);
	
	public double getBasecost();
	
	public void setBaseTraffic(double base_traffic);
	
	public double getBaseTraffic();
	
	public void setAddLineCost(double addline_cost);
	
	public double getAddLineCost();
	
	public void setOverflowTrafficCost(double overflow_traffic_cost);
	
	public double getOverflowTrafficCost();
	
}