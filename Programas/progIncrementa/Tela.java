package progIncrementa;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Tela extends JFrame{
	
	private JLabel valor;
	private JLabel telaShow;
	private JTextField telaAtual;
	private JButton btnIncr;
	private JButton btnClear;
	private JButton btnClose;
	
	Tela()
	{
		super("Programa Simplificado");
		setDefaultLookAndFeelDecorated(true);
		JPanel menu = new JPanel();
		setBounds(650, 300, 500, 300);
		
		valor = new JLabel("valor");
		telaShow = new JLabel("Janela Atual:");
		telaAtual = new JTextField(5);
		btnIncr = new JButton("Incrementar");
		btnClear = new JButton("Zerar");
		btnClose = new JButton("Sair");
		
		menu.add(valor);
		menu.add(telaShow);
		menu.add(telaAtual);
		menu.add(btnIncr);
		menu.add(btnClear);
		menu.add(btnClose);
		
		add(menu);
	}
}
