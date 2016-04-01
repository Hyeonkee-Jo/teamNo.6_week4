package teamNo._week4.bill;

public class Cost {
	
	Plan plan;
	static String GOLD, SILVER;
	int minutes_used;
	
	public Cost(){
		this.calculate_overflow_traffic_cost();
	}
	
	public int getUsed(int userUsed){
		return userUsed;
	}
	
	public double calculate_overflow_traffic_cost(){
		double expected_bill = 0;
		if(plan.getGrade() == GOLD){
			if(minutes_used >= 1000)
				expected_bill = 0.45*(minutes_used-1000);
		}
		else if(plan.getGrade() == SILVER){
			if(minutes_used >= 500)
				expected_bill = 0.54*(minutes_used-500);
		}
		
		return expected_bill;
	}
	
	public double calculate_total_cost(){
		double total_cost = 0;
		total_cost = plan.getBasecost() + this.calculate_overflow_traffic_cost();
		return total_cost;
	}
}
