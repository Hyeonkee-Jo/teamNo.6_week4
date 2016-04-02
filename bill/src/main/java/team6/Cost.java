package team6;

public class Cost {
	
	Plan plan;
	int traffic;
	int num;
	
	public Cost(String p,int traffic ,int num) {
		
		this.traffic = traffic;
		this.num=num;
		if(p.equals("S")){
			plan = new SilverPlan();
			System.out.println(this.calculatetotalcost()+"$");
		}
		else if(p.equals("G")) {
			plan = new GoldPlan();
			System.out.println(this.calculatetotalcost()+"$");
		}
	}
	
	public void setUsed(int userUsed) {
		this.traffic = userUsed;
	}
	
	public int getUsed(){
		return traffic;
	}
	
	public void setNumLine(int num) {
		this.num = num;
	}
	public int getNumLine(){
		return num;
	}
	
	public double calculateoverflowtrafficcost(){
		double expectedBill = 0;
		if(traffic >= plan.getBaseTraffic())
			expectedBill = plan.getOverflowTrafficCost()*(traffic-plan.getBaseTraffic());
	
		return expectedBill;
	}
	
	public double calculatetotalcost(){
		double total_cost = 0;
		total_cost = plan.getBasecost() + this.calculateoverflowtrafficcost() + this.calculateAddlineCost();
		return total_cost;
	}
	
	public double calculateAddlineCost(){
		int numofLine = getNumLine();
		double addlineCost = plan.getAddLineCost();
		double calculateCost = 0;
		if (numofLine < 4)
			calculateCost = addlineCost * (numofLine-1); 
		else 
			calculateCost = ( addlineCost * 2 ) + ( 5 * (numofLine-3) );
				
		return calculateCost;
	}

}
