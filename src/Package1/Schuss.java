package Package1;

import java.util.Timer; 
import java.util.TimerTask;

public class Schuss {
	Timer schusstimer;
private int temp = 0;
	public Schuss() {
		schusstimer = new Timer();
		schusstimer.scheduleAtFixedRate(new TimerTask() {

			public void run() {

				if (Var.bolschuss == true) {
					Var.schussy -= 3;
				}

				for (int i = 0; i <= 4; i++) {
					if (Var.schussx >= Var.gegnerx[i] - 25 && Var.schussx <= Var.gegnerx[i] + 73
							&& Var.schussy >= Var.gegnery[i] - 70 && Var.schussy <= Var.gegnery[i] + 35) {

						Var.schusskollision = true;
						Var.bolschuss = false;

						Var.schussx = Var.screenwidth + 100;
						Var.schussy = Var.screenheight + 100;

						Var.posgegnerx = Var.gegnerx[i] - 10;
						Var.posgegnery = Var.gegnery[i] - 10;
						
						Var.gegnery[i] =-150;

					}

				}
				
				if(Var.schussy<=0){
					Var.bolschuss = false;
					
					Var.schussx = Var.screenwidth + 100;
					Var.schussy = Var.screenheight + 100;
				}

				
				if(Var.schusskollision ==true){
					
					if(temp<37){
						temp++;
					}else if(temp == 37){
						Var.schusskollision = false;
						
						Var.gifgegner.flush();
						temp=0;
					}
					
				}
				
			}

		}, 0, 8);
	}

}

