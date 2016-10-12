package Package1;

import java.util.Timer;   
import java.util.TimerTask;

public class Verloren {
	Timer loose;
	private int temp = 0, temp1 = 0, temp2 = 0;

	public Verloren() {
		loose = new Timer();
		loose.scheduleAtFixedRate(new TimerTask() {

			public void run() {

				if (Var.verloren) {
					if (temp >= 0 && temp <= 55) {
						temp++;
					} else if (temp == 56) {

						//Menü
						Var.imSpiel = false;
						Var.imMenü = false;
						Var.imShop = true;
						Var.imOptionen = false;
						Var.btnresume.setVisible(true);
						Var.btnshop.setVisible(false);
						Var.btnoptionen.setVisible(false);
						Var.btnexit.setVisible(false);
						
						Var.btnupgrade1.setVisible(true);
						Var.btnupgrade2.setVisible(true);
						Var.btnupgrade3.setVisible(true);
						Var.btnleben.setVisible(true);
						KeyHandler.tempKeyhandler++;
						Var.btnresume.requestFocus();
						Var.jf1.requestFocus();
						
						
						// Schrottplatzierung
						for (int i = 0; i <= 4; i++) {
							Var.schrottx1[i] = 20 + temp1;
							Var.schrotty1[i] = -200 - temp1;

							temp1 += 160;
						}

						Var.schrottx2[0] = 266;
						Var.schrottx2[1] = 532;
						Var.schrotty2[0] = -1000;
						Var.schrotty2[1] = -1500;

						Var.schrottx3 = 375;
						Var.schrotty3 = -4000;
						// Gegnerplatzierung

						for (int i = 0; i <= 4; i++) {
							Var.gegnery[i] = 0;
						}

						for (int i = 0; i <= 4; i++) {
							Var.gegnery[i] = -100 - temp2;

							temp2 += 160;
						}

						temp = 0;						
						Var.leben = Var.maxleben;
						Var.verloren = false;
						Var.score = 0;
					}
				}

			}

		}, 0, 15);
	}

}