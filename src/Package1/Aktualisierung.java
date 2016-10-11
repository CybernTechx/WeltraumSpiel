package Package1;

import java.util.Timer; 
import java.util.TimerTask;

public class Aktualisierung {
	Timer aktual;
	static int tempAktualisierung = 0;

	public Aktualisierung() {
		aktual = new Timer();
		aktual.scheduleAtFixedRate(new TimerTask() {

			public void run() {

				if (Var.imMenü) {
					if (tempAktualisierung == 0) {
						Var.btnresume.requestFocus();
						Var.btnoptionen.requestFocus();
						Var.btnshop.requestFocus();
						Var.btnexit.requestFocus();
						tempAktualisierung++;
						
					} else if (tempAktualisierung == 1) {
						Var.jf1.requestFocus();
					}
				}

			}

		}, 0, 50);
	}

}
