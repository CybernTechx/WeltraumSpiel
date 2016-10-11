package Package1;

import java.awt.Image;  
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Var {
	//JFrameEinstellungen
	static JFrame jf1;
	static int screenwidth = 800, screenheight = 600;
	static int backgroundY1 = 0, backgroundY2 = -600, backgroundspeed = 9;
	//Raketenposition und -geschwindigkeit
	static int x = 400, y = 400;
	static int speedup = 3, speeddown = 2, speedleft = 2, speedright = 2;
	//Flammenanimation
	static int flammeanimation;
	//Schrott- und Lebensanzahl
	static int schrott = 0, leben = 2, maxleben = 2;
	//Upgrades und Preise
	static int up1anzahl = 0, up2anzahl = 0, up3anzahl = 0;
	static int up1preis = 100, up2preis = 10, up3preis = 100, uplebenpreis = 100;
	//Schildanzahl
	static int schildanzahl = 0, schildarraymax = 3;
	//Munition
	static int ammo = 10, maxammo = 10;
	//Score
	static int score;
	
	
	//Buttons
	static JButton btnresume, btnshop, btnoptionen, btnexit;
	static JButton btnmute;
	static JButton btnupgrade1, btnupgrade2, btnupgrade3, btnleben;
	static Label lbl1;
	
	//Gegner Position und Speed
	static int gegnerx[] = new int[5], gegnery[] = new int[5];
	static int gegnerspeed[] = new int[5];
	//Schrott Position und Speed
	static int schrottx1[] = new int[5], schrotty1[] = new int[5];
	static int schrottx2[] = new int[5], schrotty2[] = new int[5];
	static int schrottx3, schrotty3;
	static int schrottspeed1[] = new int[5], schrottspeed2[] = new int[2], schrottspeed3;
	//Explosionsanimation
	static int expanimation;
	//Schussposition
	static int schussx, schussy;
	//Gegnerposition
	static int posgegnerx, posgegnery;
	
	//Steuerung
	static boolean moveup = false, movedown = false, moveleft = false, moveright = false;
	//Kollision
	static boolean kollidiert = false, verloren = false;
	//Status(Menü, Spiel, Optionen, Shop
	static boolean imSpiel = true, imMenü = false, imOptionen = false, imShop = false;
	static boolean bolschuss = false;
	static boolean schusskollision = false;
	
	//Bilder
	static BufferedImage ib1, ib2;
	static BufferedImage irakete, iflamme1, iflamme2;
	static BufferedImage igegner1;
	static BufferedImage ischrott1, ischrott2, ischrott3;
	static BufferedImage ileben;
	static BufferedImage ischild[] = new BufferedImage[4];
	static BufferedImage iammo;
	
	//Gifs
	static Image gifexplosion;
	static Image gifschuss;
	static Image gifgegner;

	public Var() {

		try {
			// Background
			ib1 = ImageIO.read(new File("rsc/b1.png"));
			ib2 = ImageIO.read(new File("rsc/b1.png"));
			// Rakete
			irakete = ImageIO.read(new File("rsc/rakete.png"));
			// Flamme
			iflamme1 = ImageIO.read(new File("rsc/flamme1.1.png"));
			iflamme2 = ImageIO.read(new File("rsc/flamme1.2.png"));
			// Gegner
			igegner1 = ImageIO.read(new File("rsc/gegner1.png"));
			gifgegner = Toolkit.getDefaultToolkit().createImage("rsc/gegner.gif");
			// Leben
			ileben = ImageIO.read(new File("rsc/leben.png"));
			// Schrott
			ischrott1 = ImageIO.read(new File("rsc/schrott1.png"));
			ischrott2 = ImageIO.read(new File("rsc/schrott2.png"));
			ischrott3 = ImageIO.read(new File("rsc/schrott3.png"));
			// Explosion
			gifexplosion = Toolkit.getDefaultToolkit().createImage("rsc/explosion.gif");
			// Schild
			for (int i = 0; i < ischild.length; i++) {
				ischild[i] = ImageIO.read(new File("rsc/schild" + (i + 1) + ".png"));
			}
			//Schuss
			gifschuss = Toolkit.getDefaultToolkit().createImage("rsc/schuss.gif");
			//Munition
			iammo = ImageIO.read(new File("rsc/ammo.png"));

		} catch (IOException e) {

			e.printStackTrace();
			System.out.println("Bilder konnten nicht geladen werden");
		}

		gegnerspeed[0] = 3;
		gegnerspeed[1] = 4;
		gegnerspeed[2] = 3;
		gegnerspeed[3] = 4;
		gegnerspeed[4] = 3;

		schrottspeed1[0] = 2;
		schrottspeed1[1] = 3;
		schrottspeed1[2] = 2;
		schrottspeed1[3] = 4;
		schrottspeed1[4] = 3;

		schrottspeed2[0] = 4;
		schrottspeed2[1] = 5;

		schrottspeed3 = 6;
		
		//Musik
		Musik.music("audio/track1.wav");

	}

}