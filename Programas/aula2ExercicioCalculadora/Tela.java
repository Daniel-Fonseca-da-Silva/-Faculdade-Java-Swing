package aula2ExercicioCalculadora;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class Tela extends JFrame{
	
	JPanel listTop = new JPanel();
	JPanel centerHeart = new JPanel();
	JPanel screen = new JPanel();
	JPanel TwoInOne = new JPanel();
	
	Tela()
	{
		// Basic Configuration Frame
		super("The Calculator"); // The title of frame
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Configuration of close
		setPreferredSize(new Dimension(350, 400)); // Dimension of screen
		setLayout(new BorderLayout());
		add(listTop, BorderLayout.NORTH);
		add(TwoInOne, BorderLayout.CENTER);
		
		// ListTop
		listTop.setLayout(new FlowLayout(FlowLayout.LEFT));
		listTop.add(new JButton("View")).setPreferredSize(new Dimension(70, 25));
		listTop.add(new JButton("Edit")).setPreferredSize(new Dimension(70, 25));
		listTop.add(new JButton("Help")).setPreferredSize(new Dimension(70, 25));
		
		// Screen
		JTextField screen = new JTextField(30);
		screen.setPreferredSize(new Dimension(10,50));
		TwoInOne.add(screen, BorderLayout.NORTH);
		
		// center Health
		centerHeart.setLayout(new GridLayout(6, 5));
		
		TwoInOne.add(centerHeart, BorderLayout.CENTER);
		JButton btn1 = new JButton("MC");
		JButton btn2 = new JButton("MR");
		JButton btn3 = new JButton("MS");
		JButton btn4 = new JButton("M+");
		JButton btn5 = new JButton("M-");
		
		JButton btn6 = new JButton("←");
		JButton btn7 = new JButton("CE");
		JButton btn8 = new JButton("C");
		JButton btn9 = new JButton("±");
		JButton btn10 = new JButton("√");
		
		JButton btn11 = new JButton("7");
		JButton btn12 = new JButton("8");
		JButton btn13 = new JButton("9");
		JButton btn14 = new JButton("/");
		JButton btn15 = new JButton("%");
		
		JButton btn16 = new JButton("4");
		JButton btn17 = new JButton("5");
		JButton btn18 = new JButton("6");
		JButton btn19 = new JButton("*");
		JButton btn20 = new JButton("1/x");
		
		JButton btn21 = new JButton("1");
		JButton btn22 = new JButton("2");
		JButton btn23 = new JButton("3");
		JButton btn24 = new JButton("-");
		JButton btn25 = new JButton("0");
		
		JButton btn26 = new JButton(".");
		JButton btn27 = new JButton("+");
		JButton btn28 = new JButton("Reset");
		JButton btn29 = new JButton("=");
		
		centerHeart.add(btn1);
		centerHeart.add(btn2);
		centerHeart.add(btn3);
		centerHeart.add(btn4);
		centerHeart.add(btn5);
		centerHeart.add(btn6);
		centerHeart.add(btn7);
		centerHeart.add(btn8);
		centerHeart.add(btn9);
		centerHeart.add(btn10);
		centerHeart.add(btn11);
		centerHeart.add(btn12);
		centerHeart.add(btn13);
		centerHeart.add(btn14);
		centerHeart.add(btn15);
		centerHeart.add(btn16);
		centerHeart.add(btn17);
		centerHeart.add(btn18);
		centerHeart.add(btn19);
		centerHeart.add(btn20);
		centerHeart.add(btn21);
		centerHeart.add(btn22);
		centerHeart.add(btn23);
		centerHeart.add(btn24);
		centerHeart.add(btn25);
		centerHeart.add(btn26);
		centerHeart.add(btn27);
		centerHeart.add(btn28);
		centerHeart.add(btn29);
		
		// Other Configuration Frame
		pack();
		setVisible(true);
	}
}
