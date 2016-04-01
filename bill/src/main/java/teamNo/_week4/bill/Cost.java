package teamNo._week4.bill;
import java.util.*;

public class Cost {
	
	static String GOLD, SILVER;
	int minutes_used;
	Scanner scan = new Scanner(System.in);
	
	public Cost(){
		System.out.println("사용한 통화시간을 입력하십시요 : ");
		minutes_used = scan.nextInt();
		this.calculate_overflow_traffic_cost();
	}
	
	public double calculate_overflow_traffic_cost(){
		double expected_bill = 0;
		if(plan == GOLD){
			if(minutes_used >= 1000)
				expected_bill = 0.45*(minutes_used-1000);
		}
		else if(plan == SILVER){
			if(minutes_used >= 500)
				expected_bill = 0.54*(minutes_used-500);
		}
		
		
		return expected_bill;
	}
	
	public void calculate_total_cost(){
		System.out.println("초과 통화량에 대한 추가금은 : "+this.calculate_overflow_traffic_cost());
	}
}
