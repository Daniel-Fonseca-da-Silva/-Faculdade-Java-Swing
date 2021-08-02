package eventoJButton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

//Programa implementado com listener com classe anonima

public class Tela extends JFrame {
	private JButton btn = null;

	Tela() {
		super("Acao de botao");
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(300, 200));

		btn = new JButton("Me Clica!");
		add(btn);

		// classe interna para tratamento de evento do botao
		class HandlerBotao implements ActionListener 
		{
			public void actionPerformed(ActionEvent evento) 
			{
				btn.setVisible(false);
				JOptionPane.showMessageDialog(btn, String.format("Você me clicou! %s", evento.getActionCommand()));
				btn.setVisible(true);
				btn.setBackground(Color.BLACK);
				btn.setForeground(Color.RED);
				btn.setText("Eu já fui clicado");
			}
		}

		// Cria novo handler para tratamento de evento do botao
		HandlerBotao handler = new HandlerBotao();
		btn.addActionListener(handler);

		pack();
	}
}
