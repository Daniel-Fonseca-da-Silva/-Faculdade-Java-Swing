package gridLayout_e_borderLayout;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Tela extends JFrame{
	JFrame f;
	JPanel painelBotoes;
	JButton botoes[];
	
	Tela()
	{
		f = new JFrame("Programa combinado");
		botoes = new JButton[5];
		painelBotoes = new JPanel();
		painelBotoes.setLayout(new GridLayout(1, botoes.length));
		
		botoes[0] = new JButton("Inserir");
		botoes[1] = new JButton("Apagar");
		botoes[2] = new JButton("Consultar");
		botoes[3] = new JButton("Editar");
		botoes[4] = new JButton("Limpar");
		
		painelBotoes.add(botoes[0]);
		painelBotoes.add(botoes[1]);
		painelBotoes.add(botoes[2]);
		painelBotoes.add(botoes[3]);
		painelBotoes.add(botoes[4]);
		
		f.add(painelBotoes, BorderLayout.SOUTH);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(450, 200);
		f.setVisible(true);
	}
}
