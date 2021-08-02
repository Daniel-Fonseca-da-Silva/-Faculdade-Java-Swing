package aula2Exemplo002;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class Tela extends JFrame{
	
	private FlowLayout layout = null; // Variável do tipo FlowLayout
	
	public Tela()
	{
		
		super("Teste FlowLayout");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		setSize(new Dimension(400, 200));
		
		layout = new FlowLayout();// Inicializa
		setLayout(layout);// tela é do tipo flowlayout
		layout.setAlignment(FlowLayout.CENTER);
		
		add(new JButton("Botao - 0"));
		add(new JButton("Botao - 1"));
		add(new JButton("Botao - 2"));
		add(new JButton("Botao - 3"));
		add(new JButton("Botao - 4"));
		
		pack();
		setVisible(true);
	}
	
}
