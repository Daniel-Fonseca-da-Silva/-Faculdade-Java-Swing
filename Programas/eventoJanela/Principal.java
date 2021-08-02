package eventoJanela;

import javax.swing.JFrame;

public class Principal {
	public static void main(String args[])
	{
		Tela eventoJanela = new Tela();
		eventoJanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		eventoJanela.setSize(270, 110);
		eventoJanela.setVisible(true);
	}
}
