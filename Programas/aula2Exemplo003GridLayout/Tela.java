package aula2Exemplo003GridLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Dimension;

public class Tela extends JFrame{

	private GridLayout layout = null;
	
	Tela()
	{
		super("Testando GridLayout");
		
		setPreferredSize(new Dimension(800,400));
		
		layout = new GridLayout(3, 3, 5, 5);
		setLayout(layout);
		pack();
		
		for(int i = 0; i < 21; i++)
		{
			add(new JButton("Botao - " + i));
		}
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}

}
