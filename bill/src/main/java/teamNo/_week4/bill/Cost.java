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
	
	public int getNumLine(int num){
		return num;
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
		total_cost = plan.getBasecost() + this.calculate_overflow_traffic_cost() + this.calculate_Addline_Cost();
		return total_cost;
	}
	
	public double calculate_Addline_Cost(){
		int get_Number_Of_Line = getNumLine(num);
		if(plan.getGrade()==GOLD){
			if (get_Number_Of_Line < 4)
				return 14.50 * (get_Number_Of_Line-1); 
			else 
				return ( 14.50 * 2 ) + ( 5 * (get_Number_Of_Line-3) );
			
		}	
		else if(plan.getGrade()==SILVER){
			if(get_number_of_Line <4)
				return 21.50 * (get_Number_Of_Line-1);
			else
				return 21.50 * 2 + ( 5 * ( get_Number_Of_Line - 3 ) );
		}
	}
	
	
}

