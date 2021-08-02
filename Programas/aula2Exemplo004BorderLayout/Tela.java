package aula2Exemplo004BorderLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import java.awt.BorderLayout;
import java.awt.Dimension;


public class Tela extends JFrame {
	
	private BorderLayout layout = null;
	
	Tela()
	{
		super("Teste BorderLayout");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		layout = new BorderLayout();
		setLayout(layout);
		layout.setHgap(5);
		layout.setVgap(5);
		
		setPreferredSize(new Dimension(450, 300));
		//getContentPane().setLayout(new BorderLayout());
		add(new JButton("Norte"), BorderLayout.NORTH);
		add(new JButton("Sul"), BorderLayout.SOUTH);
		add(new JButton("Leste"), BorderLayout.WEST);
		add(new JButton("Oeste"), BorderLayout.EAST);
		add(new JTextField("Centro"), BorderLayout.CENTER);
		
		pack();
		setVisible(true);
		
	}
}
