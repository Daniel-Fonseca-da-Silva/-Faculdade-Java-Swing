package bordeLayout;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Tela {
	JFrame f;
	
	Tela()
	{
		f = new JFrame("Programa3");
		
		f.setVisible(true);
		
		JButton b1 = new JButton("Norte");
		JButton b2 = new JButton("Sul");
		JButton b3 = new JButton("Leste");
		JButton b4 = new JButton("Oeste");
		JButton b5 = new JButton("Centro");
		
		f.add(b1, BorderLayout.NORTH);
		f.add(b2, BorderLayout.SOUTH);
		f.add(b3, BorderLayout.EAST);
		f.add(b4, BorderLayout.WEST);
		f.add(b5, BorderLayout.CENTER);
		
		f.setLocation(650, 450);
		f.setSize(600, 400);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
