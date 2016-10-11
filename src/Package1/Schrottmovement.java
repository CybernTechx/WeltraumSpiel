package Package1;

import java.util.Timer; 
import java.util.TimerTask;

public class Schrottmovement {
	Timer movement;
	private int temp = 0;

	public Schrottmovement() {
		
		for (int i = 0; i <= 4; i++) {
			Var.schrottx1[i] = 20 + temp;
			Var.schrotty1[i] = -200 - temp;

			temp += 160;
		}

		Var.schrottx2[0] = 266;
		Var.schrottx2[1] = 532;
		Var.schrotty2[0] = -1000;
		Var.schrotty2[1] = -1500;

		Var.schrottx3 = 375;
		Var.schrotty3 = -4000;

		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {


			public void run() {

				if(Var.imSpiel){
				
				for (int i = 0; i <= 4; i++) {
					Var.schrotty1[i] += Var.schrottspeed1[i];

					if (Var.schrotty1[i] >= Var.screenheight) {
						Var.schrotty1[i] = -350;
					}
				}

				for (int i = 0; i <= 1; i++) {
					Var.schrotty2[i] += Var.schrottspeed2[i];

					if (Var.schrotty2[i] >= Var.screenheight) {
						Var.schrotty2[i] = -1500;
					}
				}

				Var.schrotty3 +=Var.schrottspeed3;
				if(Var.schrotty3>=Var.screenheight){
					Var.schrotty3 =-4000;
				}
			
			}
			}
		
		}, 0, 9);
	}

}
