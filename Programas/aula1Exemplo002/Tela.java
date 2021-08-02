package aula1Exemplo002;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela extends JFrame{
	
	// Atributos
	private JLabel rotulo = null;
	
	// Construtor
	public Tela()
	{
		rotulo = new JLabel("Exemplo de Label");
		
		setSize(200, 100);
		setTitle("Tela");
		setLocation(19, 10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(rotulo);
	}
}
