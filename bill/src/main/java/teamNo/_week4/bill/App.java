package teamNo._week4.bill;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("사용자의 통화정보를 입력하세요 : [Gold or Silver], [Addline], [Total Traffic]");
        String plan = scan.nextLine();
        int addline = scan.nextInt();
        int traffic = scan.nextInt();
        
        if(plan.toUpperCase()=="GOLD")
        {
        	GoldPlan gold = new GoldPlan();
        }
        
        else if(plan.toUpperCase()=="SILVER")
        {
        	SilverPlan silver = new SilverPlan();
        }
    }
}
