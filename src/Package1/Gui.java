package Package1;

import java.awt.Color;   
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;


public class Gui {

	public Gui() {
		//Jframe
		Var.jf1 = new JFrame();
		Var.jf1.setSize(Var.screenwidth,Var.screenheight);
		Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.jf1.setLocationRelativeTo(null);
		Var.jf1.setLayout(null);
		Var.jf1.setTitle("Space Adventure");
		Var.jf1.setResizable(false);
		Var.jf1.addKeyListener(new KeyHandler());
		Var.jf1.requestFocus();
		Var.jf1.setVisible(true);
		//JLabel
		Var.lbl1 = new Label();
		Var.lbl1.setBounds(0,0,Var.screenwidth,Var.screenheight);
		Var.lbl1.setVisible(true);
		//Resume Button
		Var.btnresume = new JButton();
		Var.btnresume.setText("Resume");
		Var.btnresume.setBounds(30,50,725,50);
		Var.btnresume.setVisible(false);
		Var.btnresume.addActionListener(new ActionHandler());
		Var.btnresume.setBackground(Color.BLACK);
		Var.btnresume.setFont(new Font("Arial",Font.BOLD,40));
		Var.btnresume.setForeground(Color.WHITE);
		Var.btnresume.setBorder(null);
		Var.btnresume.setFocusPainted(false);
		Var.btnresume.addMouseListener(new MouseAdapter(){
			
			public void mouseEntered(MouseEvent evt){
				Var.btnresume.setBackground(new Color(0,230,115));
				Var.btnresume.setForeground(Color.BLACK);
			}
			public void mouseExited(MouseEvent evt){
				Var.btnresume.setBackground(Color.BLACK);
				Var.btnresume.setForeground(Color.WHITE);
			}
			
		});
		Var.jf1.add(Var.btnresume);
		
		//Shop Button
		Var.btnshop = new JButton();
		Var.btnshop.setText("Upgrades");
		Var.btnshop.setBounds(30,150,725,50);
		Var.btnshop.setVisible(false);
		Var.btnshop.addActionListener(new ActionHandler());
		Var.btnshop.setBackground(Color.BLACK);
		Var.btnshop.setFont(new Font("Arial",Font.BOLD,40));
		Var.btnshop.setForeground(Color.WHITE);
		Var.btnshop.setBorder(null);
		Var.btnshop.setFocusPainted(false);
		Var.btnshop.addMouseListener(new MouseAdapter(){
			
			public void mouseEntered(MouseEvent evt){
				Var.btnshop.setBackground(new Color(0,230,115));
				Var.btnshop.setForeground(Color.BLACK);
			}
			public void mouseExited(MouseEvent evt){
				Var.btnshop.setBackground(Color.BLACK);
				Var.btnshop.setForeground(Color.WHITE);
			}
			
		});
		Var.jf1.add(Var.btnshop);
		
		//Optionen Button
		Var.btnoptionen = new JButton();
		Var.btnoptionen.setText("Optionen");
		Var.btnoptionen.setBounds(30,250,725,50);
		Var.btnoptionen.setVisible(false);
		Var.btnoptionen.addActionListener(new ActionHandler());
		Var.btnoptionen.setBackground(Color.BLACK);
		Var.btnoptionen.setFont(new Font("Arial",Font.BOLD,40));
		Var.btnoptionen.setForeground(Color.WHITE);
		Var.btnoptionen.setBorder(null);
		Var.btnoptionen.setFocusPainted(false);
		Var.btnoptionen.addMouseListener(new MouseAdapter(){
			
			public void mouseEntered(MouseEvent evt){
				Var.btnoptionen.setBackground(new Color(0,230,115));
				Var.btnoptionen.setForeground(Color.BLACK);
			}
			public void mouseExited(MouseEvent evt){
				Var.btnoptionen.setBackground(Color.BLACK);
				Var.btnoptionen.setForeground(Color.WHITE);
			}
			
		});
		Var.jf1.add(Var.btnoptionen);
		//Exit Button
		Var.btnexit = new JButton();
		Var.btnexit.setText("Beenden");
		Var.btnexit.setBounds(30,350,725,50);
		Var.btnexit.setVisible(false);
		Var.btnexit.addActionListener(new ActionHandler());
		Var.btnexit.setBackground(Color.BLACK);
		Var.btnexit.setFont(new Font("Arial",Font.BOLD,40));
		Var.btnexit.setForeground(Color.WHITE);
		Var.btnexit.setBorder(null);
		Var.btnexit.setFocusPainted(false);
		Var.btnexit.addMouseListener(new MouseAdapter(){
			
			public void mouseEntered(MouseEvent evt){
				Var.btnexit.setBackground(new Color(0,230,115));
				Var.btnexit.setForeground(Color.BLACK);
			}
			public void mouseExited(MouseEvent evt){
				Var.btnexit.setBackground(Color.BLACK);
				Var.btnexit.setForeground(Color.WHITE);
			}
			
		});
		Var.jf1.add(Var.btnexit);
		
		//Upgrades Button
		//1
		Var.btnupgrade1 = new JButton();
		Var.btnupgrade1.setText("+");
		Var.btnupgrade1.setBounds(450,300,50,50);
		Var.btnupgrade1.setVisible(false);
		Var.btnupgrade1.addActionListener(new ActionHandler());
		Var.btnupgrade1.setBackground(Color.BLACK);
		Var.btnupgrade1.setFont(new Font("Arial",Font.BOLD,40));
		Var.btnupgrade1.setForeground(Color.WHITE);
		Var.btnupgrade1.setBorder(null);
		Var.btnupgrade1.setFocusPainted(false);
		Var.btnupgrade1.addMouseListener(new MouseAdapter(){
		//Mausklick	
			public void mouseEntered(MouseEvent evt){
				Var.btnupgrade1.setBackground(new Color(0,230,115));
				Var.btnupgrade1.setForeground(Color.BLACK);
				if(Var.schrott<Var.up1preis){
					Var.btnupgrade1.setText("x");
				}
				
			}
			public void mouseExited(MouseEvent evt){
				Var.btnupgrade1.setBackground(Color.BLACK);
				Var.btnupgrade1.setForeground(Color.WHITE);
				Var.btnupgrade1.setText("+");
			}
			
		});
		Var.jf1.add(Var.btnupgrade1);
		
		//2
		Var.btnupgrade2 = new JButton();
		Var.btnupgrade2.setText("+");
		Var.btnupgrade2.setBounds(450,375,50,50);
		Var.btnupgrade2.setVisible(false);
		Var.btnupgrade2.addActionListener(new ActionHandler());
		Var.btnupgrade2.setBackground(Color.BLACK);
		Var.btnupgrade2.setFont(new Font("Arial",Font.BOLD,40));
		Var.btnupgrade2.setForeground(Color.WHITE);
		Var.btnupgrade2.setBorder(null);
		Var.btnupgrade2.setFocusPainted(false);
		Var.btnupgrade2.addMouseListener(new MouseAdapter(){
			
			public void mouseEntered(MouseEvent evt){
				Var.btnupgrade2.setBackground(new Color(0,230,115));
				Var.btnupgrade2.setForeground(Color.BLACK);
				if(Var.schrott<Var.up2preis){
					Var.btnupgrade2.setText("x");
				}
				
			}
			public void mouseExited(MouseEvent evt){
				Var.btnupgrade2.setBackground(Color.BLACK);
				Var.btnupgrade2.setForeground(Color.WHITE);
				Var.btnupgrade2.setText("+");
			}
			
		});
		Var.jf1.add(Var.btnupgrade2);
		
		//3
		Var.btnupgrade3 = new JButton();
		Var.btnupgrade3.setText("+");
		Var.btnupgrade3.setBounds(450,450,50,50);
		Var.btnupgrade3.setVisible(false);
		Var.btnupgrade3.addActionListener(new ActionHandler());
		Var.btnupgrade3.setBackground(Color.BLACK);
		Var.btnupgrade3.setFont(new Font("Arial",Font.BOLD,40));
		Var.btnupgrade3.setForeground(Color.WHITE);
		Var.btnupgrade3.setBorder(null);
		Var.btnupgrade3.setFocusPainted(false);
		Var.btnupgrade3.addMouseListener(new MouseAdapter(){
			
			public void mouseEntered(MouseEvent evt){
				Var.btnupgrade3.setBackground(new Color(0,230,115));
				Var.btnupgrade3.setForeground(Color.BLACK);
				if(Var.schrott<Var.up3preis){
					Var.btnupgrade3.setText("x");
				}
				
			}
			public void mouseExited(MouseEvent evt){
				Var.btnupgrade3.setBackground(Color.BLACK);
				Var.btnupgrade3.setForeground(Color.WHITE);
				Var.btnupgrade3.setText("+");
			}
			
		});
		Var.jf1.add(Var.btnupgrade3);
		
		//Leben Button
		Var.btnleben = new JButton();
		Var.btnleben.setText("+");
		Var.btnleben.setBounds(700,200,50,50);
		Var.btnleben.setVisible(false);
		Var.btnleben.addActionListener(new ActionHandler());
		Var.btnleben.setBackground(Color.BLACK);
		Var.btnleben.setFont(new Font("Arial",Font.BOLD,40));
		Var.btnleben.setForeground(Color.WHITE);
		Var.btnleben.setBorder(null);
		Var.btnleben.setFocusPainted(false);
		Var.btnleben.addMouseListener(new MouseAdapter(){
			
			public void mouseEntered(MouseEvent evt){
				Var.btnleben.setBackground(new Color(0,230,115));
				Var.btnleben.setForeground(Color.BLACK);
				if(Var.schrott<Var.uplebenpreis||Var.leben==Var.maxleben){
					Var.btnleben.setText("x");
				}
				
			}
			public void mouseExited(MouseEvent evt){
				Var.btnleben.setBackground(Color.BLACK);
				Var.btnleben.setForeground(Color.WHITE);
				Var.btnleben.setText("+");
			}
			
		});
		Var.jf1.add(Var.btnleben);
		
		Var.jf1.add(Var.lbl1);
		
		
	}

}