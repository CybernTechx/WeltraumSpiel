package Package1;

import java.util.Timer;
import java.util.TimerTask;

public class Zeit {
	Timer Zeit;
	public Zeit(){
		Zeit = new Timer();
		Zeit.scheduleAtFixedRate(new TimerTask(){

			public void run() {
				if(Var.imSpiel){
						System.out.println("einhörner");
				}
				
				}	
		}, 0, 10);
		
	}

}
