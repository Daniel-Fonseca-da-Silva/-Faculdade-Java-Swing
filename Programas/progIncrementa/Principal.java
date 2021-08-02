package progIncrementa;

import javax.swing.WindowConstants;
import javax.swing.JFrame;

public class Principal {
	public static void main(String args[])
	{
		Tela tela = new Tela();
		
		tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		tela.setVisible(true);
	}
}
