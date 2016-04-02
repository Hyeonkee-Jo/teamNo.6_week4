package teamsix;

import java.util.logging.*;

public class App {
	
	private App(){
		
	}
	public static void main(String[] args) {
		Logger logger = Logger.getLogger("Bill");
		Cost cost = new Cost("S", 300, 4);
		logger.log(Level.INFO, cost.toString());
	}
}

