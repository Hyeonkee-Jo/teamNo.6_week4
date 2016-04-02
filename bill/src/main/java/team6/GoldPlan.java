package team6;

public class GoldPlan implements Plan{
	double basecost;
	String grade;
	double addlinecost;
	double overflowtrafficcost;
	int basetraffic;
	
	public GoldPlan()
	{
		this.basecost = 49.95;
		this.grade = "Gold";
		this.addlinecost = 14.50;
		this.overflowtrafficcost = 0.45;
		this.basetraffic = 1000;
	}
	
	public void setBasecost(double basecost)
	{
		this.basecost = basecost;
	}
	
	public double getBasecost()
	{
		return this.basecost;
	}
	
	public void setAddLineCost(double addlinecost)
	{
		this.addlinecost = addlinecost;
	}
	
	public double getAddLineCost()
	{
		return this.addlinecost;
	}
	
	public void setOverflowTrafficCost(double overflowtrafficcost)
	{
		this.overflowtrafficcost = overflowtrafficcost;
	}
	
	public double getOverflowTrafficCost()
	{
		return this.overflowtrafficcost;
	}
	
	public void setBaseTraffic(int basetraffic)
	{
		this.basetraffic = basetraffic;
	}
	
	public int getBaseTraffic()
	{
		return this.basetraffic;
	}

	public String getGrade() {
		return this.grade;
	}
}