package teamNo._week4.bill;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cost cost = new Cost();

		System.out.println("사용자의 Plan을 입력하세요 : [Gold : (g or G), Silver : (s or S)]");
		String plan = "s";
		System.out.println("사용자의 Line개수를 입력하세요 : ");
		int addline = 5;
		System.out.println("사용자의 총 통화량을 입력하세요 : ");
		int traffic = 499;

		if (plan.toUpperCase().equals("G")) {
			cost.plan = new GoldPlan();
			cost.setNumLine(addline);
			cost.setUsed(traffic);
			System.out.println("User Plan : GOLD");
			System.out.println("User Number of Line : " + addline);
			System.out.println("User Total Traffic : " + traffic);
			System.out.printf("총 사용 요금 : %.2f", cost.calculate_total_cost());
		}

		else if (plan.toUpperCase().equals("S")) {
			cost.plan = new SilverPlan();
			cost.setNumLine(addline);
			cost.setUsed(traffic);
			System.out.println("User Plan : SILVER");
			System.out.println("User Number of Line : " + addline);
			System.out.println("User Total Traffic : " + traffic);
			System.out.printf("총 사용 요금 : %.2f", cost.calculate_total_cost());
		}
	}
}
