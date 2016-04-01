package teamNo._week4.bill;

public class Cost {
	
	Plan plan;
	static String GOLD = "GOLD";
	static STring SILVER = "SILVER";
	int minutes_used;
	int num;
	
	public Cost(){
		this.calculate_overflow_traffic_cost();
		this.calculate_Addline_Cost();
		this.calculate_total_cost();
	}
	
	public void setUsed(int userUsed) {
		this.minutes_used = userUsed;
	}
	
	public int getUsed(){
		return minutes_used;
	}
	
	public void setNumLine(int num) {
		this.num = num;
	}
	public int getNumLine(){
		return num;
	}
	
	public double calculate_overflow_traffic_cost(){
		double expected_bill = 0;
		if(plan.getGrade() == GOLD){
			if(minutes_used >= 1000)
				expected_bill = plan.getOverflowTrafficCost()*(minutes_used-1000);
		}
		else if(plan.getGrade() == SILVER){
			if(minutes_used >= 500)
				expected_bill = plan.getOverflowTrafficCost()*(minutes_used-500);
		}
		
		return expected_bill;
	}
	
	public double calculate_total_cost(){
		double total_cost = 0;
		total_cost = plan.getBasecost() + this.calculate_overflow_traffic_cost() + this.calculate_Addline_Cost();
		return total_cost;
	}
	
	public double calculate_Addline_Cost(){
		int get_Number_Of_Line = getNumLine();
		double addlineCost = plan.getAddLineCost();
		if(plan.getGrade()==GOLD){
			if (get_Number_Of_Line < 4)
				return addlineCost * (get_Number_Of_Line-1); 
			else 
				return ( addlineCost * 2 ) + ( 5 * (get_Number_Of_Line-3) );
			
		}	
		else if(plan.getGrade()==SILVER){
			if(get_Number_Of_Line <4)
				return addlineCost * (get_Number_Of_Line-1);
			else
				return addlineCost * 2 + ( 5 * ( get_Number_Of_Line - 3 ) );
		}
		
		return 0;
	}
	
	
}

