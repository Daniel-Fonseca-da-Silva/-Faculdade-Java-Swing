package eventosMouseMotion;

import javax.swing.JFrame;

public class Principal {
	public static void main(String args[])
	{
		JFrame tela = new JFrame();
		tela.setBounds(500, 500, 500, 500);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tela.add(new Cena());
		tela.setVisible(true);
	}
}
