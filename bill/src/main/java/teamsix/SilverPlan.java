package teamsix;

public class SilverPlan implements Plan {
	double basecost;
	int basetraffic;
	String grade;
	double addlinecost;
	double overflowtrafficcost;
	
	public SilverPlan() {
		this.basecost = 29.95;
		this.basetraffic = 500;
		this.grade = "SILVER";
		this.addlinecost = 21.5;
		this.overflowtrafficcost = 0.54;	
	}
	
	/*public void setBasecost(double basecost)
	{
		this.basecost = basecost;
	}*/
	
	public double getBasecost() {
		return this.basecost;
	}
	
	/*public void setBaseTraffic(int basetraffic)
	{
		this.basetraffic = basetraffic;
	}*/
	
	public int getBaseTraffic() {
		return this.basetraffic;
	}
	
	/*public void setAddLineCost(double addlinecost) {
		this.addlinecost = addlinecost;
	}*/
	
	public String getGrade() {
		return this.grade;
	}
	
	public double getAddLineCost()
	{
		return this.addlinecost;
	}
	
	/*public void setOverflowTrafficCost(double overflowtrafficcost)
	{
		this.overflowtrafficcost = overflowtrafficcost;
	}*/
	
	public double getOverflowTrafficCost() {
		return this.overflowtrafficcost;
	}
	
}