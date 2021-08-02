package eventoJButtonChange;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Programa implementado com listener com classe anonima

public class Tela extends JFrame{
	
	private int value = 0;
	private FlowLayout layout;
	
	Tela()
	{
		super("Muda Valor com Evento");
		layout = new FlowLayout();
		setLayout(layout);
		setBounds(450, 350, 300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel valor;
		JTextField tela;
		JButton btnAumenta;
		JButton btnZera;
		JButton btnDiminui;
		JButton btnClose;
		
		valor = new JLabel("Valor: ");
		tela = new JTextField(10);
		btnAumenta = new JButton("Incrementar");
		btnZera = new JButton("Zerar");
		btnDiminui = new JButton("Diminui");
		btnClose = new JButton("Fechar");
		
		add(valor);
		add(tela);
		add(btnAumenta);
		add(btnDiminui);
		add(btnZera);
		add(btnClose);
		
		// Tratamentos de eventos
		
		class AumentaValor implements ActionListener
		{
			public void actionPerformed(ActionEvent evento)
			{
					value++;
					tela.setText(Integer.toString(value));
			}
		}
		
		class DiminuiValor implements ActionListener
		{
			public void actionPerformed(ActionEvent evento)
			{
				value--;
				tela.setText(Integer.toString(value));
			}
		}
		
		class ZeraValor implements ActionListener
		{
			public void actionPerformed(ActionEvent evento)
			{
				tela.setText(" ");
			}
		}
		
		class Close implements ActionListener
		{
			public void actionPerformed(ActionEvent evento)
			{
				int botao = JOptionPane.YES_NO_OPTION;
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair", "Encerramento", botao, JOptionPane.QUESTION_MESSAGE);
				if(resposta == 0)
				{
					System.exit(0);
				}
			}
		}
		
		AumentaValor handlerA = new AumentaValor();
		btnAumenta.addActionListener(handlerA);
		
		DiminuiValor handlerD = new DiminuiValor();
		btnDiminui.addActionListener(handlerD);
		
		ZeraValor handlerZ = new ZeraValor();
		btnZera.addActionListener(handlerZ);
		
		Close handlerC = new Close();
		btnClose.addActionListener(handlerC);
		
		setVisible(true);
	}
}
