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
	
	@Test
	public void testGoldThreelineBelowThau() {
		set("G", 700, 3);
		assertEquals("78.95$", c.toString());
	}
	
	@Test
	public void testGoldOverThreelineBelowThau() {
		set("G", 700, 4);
		assertEquals("83.95$", c.toString());
	}
	
	@Test
	public void testGoldOnelineOverThau() {
		set("G", 1200, 1);
		assertEquals("139.95$", c.toString());
	}
	
	@Test
	public void testGoldTwolineOverThau() {
		set("G", 1200, 2);
		assertEquals("154.45$", c.toString());
	}
	
	@Test
	public void testGoldThreelineOverThau() {
		set("G", 1200, 3);
		assertEquals("168.95$", c.toString());
	}
	
	@Test
	public void testGoldOverThreelineOverThau() {
		set("G", 1200, 4);
		assertEquals("173.95$", c.toString());
	}
	
	@Test
	public void testSilverOnelineBelowFiveHund() {
		set("S", 400, 1);
		assertEquals("29.95$", c.toString());
	}
	
	@Test
	public void testSilverTwolineBelowFiveHund() {
		set("S", 400, 2);
		assertEquals("51.45$", c.toString());
	}
	
	@Test
	public void testSilverThreelineBelowFiveHund() {
		set("S", 400, 3);
		assertEquals("72.95$", c.toString());
	}
	
	@Test
	public void testSilverOverThreelineBelowFiveHund() {
		set("S", 400, 4);
		assertEquals("77.95$", c.toString());
	}
	
	@Test
	public void testSilverOnelineOverFiveHund() {
		set("S", 700, 1);
		assertEquals("137.95$", c.toString());
	}
	
	@Test
	public void testGoldTwolineOverFiveHund() {
		set("S", 700, 2);
		assertEquals("159.45$", c.toString());
	}
	
	@Test
	public void testGoldThreelineOverFiveHund() {
		set("S", 700, 3);
		assertEquals("180.95$", c.toString());
	}
	
	@Test
	public void testGoldOverThreelineOverFiveHund() {
		set("S", 700, 4);
		assertEquals("185.95$", c.toString());
	}
	
	
}
