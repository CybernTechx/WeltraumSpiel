package Package1;

import java.util.Timer;  	
import java.util.TimerTask;	

public class Explosion {	
	Timer exp;
	private int temp = 0;

	public Explosion() {
		exp = new Timer();
		exp.scheduleAtFixedRate(new TimerTask() {

			public void run() {

				if(Var.imSpiel){
				
				if (Var.kollidiert) {
					if (temp < 23) {
						
						temp++;
					} else if (temp == 23) {
						Var.gifexplosion.flush();
						temp = 0;
						Var.kollidiert = false;
					}
				}
			}
				}

		}, 0, 50);
	}

}
