package flowLayout;

import java.awt.*;
import javax.swing.*;

public class Tela {
	JFrame f;
	
	Tela()
	{
		f = new JFrame("Programa1");
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JLabel text = new JLabel("Bem vindo");
		
		text.setToolTipText("Boas vindas");
		
		f.add(b1);
		f.add(b2);
		f.add(text);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		
		f.setLayout(new FlowLayout(FlowLayout.LEFT));
		f.setBounds(670, 400, 500, 200);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
