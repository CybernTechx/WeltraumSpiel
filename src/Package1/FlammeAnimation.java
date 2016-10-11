package Package1;

import java.util.Timer; 
import java.util.TimerTask;

public class FlammeAnimation {
	Timer flamme;
	private int temp = 0;

	public FlammeAnimation() {
		flamme = new Timer();
		flamme.scheduleAtFixedRate(new TimerTask() {

			public void run() {
				if(Var.imSpiel){
				if(temp == 0){
					Var.flammeanimation =0;
					temp++;
				}else if(temp==1){
					Var.flammeanimation=1;
					temp--;
				}
				}
			}

		}, 0, 100);
	}

}
