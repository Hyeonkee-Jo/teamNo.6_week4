package teamNo._week4.bill;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cost cost = new Cost();

		System.out.print("사용자의 통화정보를 입력하세요 : [Gold : (g or G), Silver : (s or S)], [Addline], [Total Traffic]");
		String plan = scan.nextLine();
		int addline = scan.nextInt();
		int traffic = scan.nextInt();

		if (plan.toUpperCase().equals("G")) {
			cost.plan = new GoldPlan();
			cost.setNumLine(addline);
			cost.setUsed(traffic);
			System.out.println("User Plan : " + plan);
			System.out.println("User Number of Line : " + addline);
			System.out.println("User Total Traffic : " + traffic);
			System.out.printf("총 사용 요금 : %.2f", cost.calculate_total_cost());
		}

		else if (plan.toUpperCase().equals("S")) {
			cost.plan = new SilverPlan();
			cost.setNumLine(addline);
			cost.setUsed(traffic);
			System.out.println("User Plan : " + plan);
			System.out.println("User Number of Line : " + addline);
			System.out.println("User Total Traffic : " + traffic);
			System.out.printf("총 사용 요금 : %.2f", cost.calculate_total_cost());
		}
	}
}
