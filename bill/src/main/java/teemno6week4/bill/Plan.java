package teemno6week4.bill;

public interface Plan {
		
	public void setBasecost(double base_cost);
	
	public double getBasecost();
	
	public void setBaseTraffic(int base_traffic);
	
	public int getBaseTraffic();
	
	public void setAddLineCost(double addline_cost);
	
	public double getAddLineCost();
	
	public void setOverflowTrafficCost(double overflow_traffic_cost);
	
	public double getOverflowTrafficCost();
	
	public String getGrade();
	
}