package aula2Exemplo002FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.FlowLayout;
import java.awt.Dimension;

public class Tela extends JFrame{
	
	Tela()
	{
		super("Exemplo de FlowLayout");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(400, 200));
		
		getContentPane().setLayout(new FlowLayout());
		
		for(int i = 0; i < 5; i++)
		{
			add(new JButton("Botao - " + i));
		}
		
		pack();
		setVisible(true);
	}
}
