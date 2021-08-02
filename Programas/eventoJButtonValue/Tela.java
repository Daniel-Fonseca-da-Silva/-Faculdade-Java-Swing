package eventoJButtonValue;

import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import javax.swing.JTextField;


	// Programa implementado com listener na própria interface

public class Tela extends JFrame implements ActionListener{
	
	private JButton btn1;
	private JButton btn2;
	private JTextField texto;
	
	Tela()
	{
		super("Gerenciador de Valores");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		btn1 = new JButton("Clique!");
		btn2 = new JButton("Limpar");
		texto = new JTextField(10);
		
		add(btn1);
		add(btn2);
		add(texto);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		pack();
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent evento)
	{
		if(evento.getActionCommand().equals("Clique!"))
		{
			texto.setText("Botao clicado!");
		}
		else
		{
			texto.setText(null);
		}
	}
}
