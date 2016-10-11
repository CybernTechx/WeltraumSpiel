package Package1;

import java.util.Timer; 
import java.util.TimerTask;

public class Gegnerkollision {
	Timer kollision;
	private int temp = 0;

	public Gegnerkollision() {
		kollision = new Timer();
		kollision.scheduleAtFixedRate(new TimerTask() {

			public void run() {
				if (Var.imSpiel) {

					for (int i = 0; i <= 4; i++) {
						if (temp == 0) {
							if (Var.x >= Var.gegnerx[i] - 50 && Var.x <= Var.gegnerx[i] + 73
									&& Var.y >= Var.gegnery[i] - 70 && Var.y <= Var.gegnery[i] + 35) {

								Var.kollidiert = true;

								Var.gegnery[i] = -150;

								if (Var.schildanzahl > 0) {
									Var.schildanzahl -= 1;
								} else if (Var.schildanzahl == 0) {
									if (Var.leben >= 1) {
										Var.leben -= 1;
									}
									if (Var.leben == 0) {
										Var.verloren = true;

									} else if (Var.leben > 0) {
										Var.verloren = false;
									}
								}

								temp++;
							}
						}
					}

					if (temp >= 1 && temp <= 65) {
						temp++;
					} else if (temp == 66) {
						temp = 0;
					}
				}

			}

		}, 0, 15);
	}

}


