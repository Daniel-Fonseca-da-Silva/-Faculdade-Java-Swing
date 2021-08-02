package jLabel_e_icon;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

public class Tela extends JFrame{
	
	JFrame t = null;
	JLabel l = null;
	JLabel imageLabel = null;
	
	Tela()
	{
		t = new JFrame("Programa de JLabel");
		l = new JLabel("Olá pessoas");
		
		Icon canada = new ImageIcon("src/jLabel_e_icon/canada.png");
		imageLabel = new JLabel("O Canada", canada, JLabel.RIGHT);
		
		JLabel lImg0 = new JLabel();
		JLabel lImg1 = new JLabel(canada);
		JLabel lImg2 = new JLabel(canada, JLabel.CENTER);
		JLabel lImg3 = new JLabel("Canada");
		JLabel lImg4 = new JLabel("Canada", canada, JLabel.CENTER);
		JLabel lImg5 = new JLabel("Canada", JLabel.CENTER);
		
		t.setBounds(100, 100, 300, 100);
		l.setFont(new Font("Serif", Font.BOLD, 18));
		l.setOpaque(true);
		l.setBackground(Color.YELLOW);
		l.setForeground(Color.BLUE);
		l.setBorder(new LineBorder(Color.RED));
		l.setPreferredSize(new Dimension(200, 50));
		t.getContentPane().setLayout(new FlowLayout());
		t.add(l);
		t.add(imageLabel);
		t.add(lImg0);
		t.add(lImg1);
		t.add(lImg2);
		t.add(lImg3);
		t.add(lImg4);
		t.add(lImg5);
		t.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		t.setVisible(true);
		
	}
}
