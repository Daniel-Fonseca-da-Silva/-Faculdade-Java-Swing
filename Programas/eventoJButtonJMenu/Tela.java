package eventoJButtonJMenu;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

// Programa implementado com listener com classe anonima

public class Tela extends JFrame{
	private JTextField caixaDeTexto;
	private JCheckBox negrito;
	private JCheckBox italico;
	
	Tela()
	{
		super("Troca a fonte");
		setLayout(new FlowLayout());
		
		caixaDeTexto = new JTextField("Vamos mudar o estilo da fonte?", 20);
		caixaDeTexto.setFont(new Font("Sans Serif", Font.PLAIN, 14));
		add(caixaDeTexto);
		
		negrito = new JCheckBox("Negrito");
		italico = new JCheckBox("Italico");
		add(negrito);
		add(italico);
		
		HandlerTrocaFont handler = new HandlerTrocaFont();
		negrito.addItemListener(handler);
		italico.addItemListener(handler);
	}
	
	private class HandlerTrocaFont implements ItemListener
	{
		private int iNegrito = Font.PLAIN;
		private int iItalico = Font.PLAIN;
		
		public void itemStateChanged(ItemEvent evento)
		{
			if(evento.getSource() == negrito)
			{
				iNegrito = negrito.isSelected()?Font.BOLD:Font.PLAIN;
			}
			
			if(evento.getSource() == italico)
			{
				iItalico = italico.isSelected()?Font.ITALIC:Font.PLAIN;
			}
			caixaDeTexto.setFont(new Font("Sans Serif", iNegrito+iItalico, 14));
		}
		
	}
	
	
}
