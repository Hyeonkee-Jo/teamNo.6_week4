package teamsix;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
	  
	private Cost c;
	
	@Before
	public void setUp(){
		c = new Cost(null, 0, 0);
	}
	
	private void set(String p, int traffic , int num){
		c.traffic = traffic;
		c.num = num;
		if(("S").equals(p)){
			c.plan = new SilverPlan();		
		}
		else if(("G").equals(p)) {
			c.plan = new GoldPlan();
		}
	}
	
	@Test
	public void testGoldOnelineBelowThau() {
		set("G", 700, 1);
		assertEquals("49.95$", c.toString());
	}
	
	@Test
	public void testGoldTwolineBelowThau() {
		set("G", 700, 2);
		assertEquals("64.45$", c.toString());
	}
}
