package eventoJanela;

import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//Programa implementado com listener com classe anonima

public class Tela extends JFrame{
	
	private JLabel label1;
	private JLabel labelContador;
	private int contador;
	
	public Tela()
	{
		super("Testando eventos janela");
		setLayout(new FlowLayout());
		label1 = new JLabel("Eventos na janela");
		add(label1);
		
		labelContador = new JLabel("0");
		add(labelContador);
		
		HandlerJanela handler = new HandlerJanela();
		this.addWindowListener(handler);
	}
	
	private class HandlerJanela implements WindowListener
	{
		@Override
		public void windowIconified(WindowEvent evento)
		{
			JOptionPane.showMessageDialog(null, "Minimizando...");
			contador++;
			labelContador.setText(Integer.toString(contador));
		}
		@Override
		public void windowOpened(WindowEvent evento)
		{
			JOptionPane.showMessageDialog(null, "Abrindo...");
			contador++;
			labelContador.setText(Integer.toString(contador));
		}
		@Override
		public void windowClosing(WindowEvent evento)
		{
			JOptionPane.showMessageDialog(null, "Tchau :(");
			contador++;
			labelContador.setText(Integer.toString(contador));
		}
		@Override
		public void windowClosed(WindowEvent evento)
		{
			contador++;
			labelContador.setText(Integer.toString(contador));
		}
		@Override
		public void windowDeiconified(WindowEvent evento)
		{
			JOptionPane.showMessageDialog(null, "Restaurando...");
			contador++;
			labelContador.setText(Integer.toString(contador));
		}
		@Override
		public void windowActivated(WindowEvent evento)
		{
			labelContador.setText(Integer.toString(contador));
		}
		@Override
		public void windowDeactivated(WindowEvent evento)
		{
			contador++;
			labelContador.setText(Integer.toString(contador));
		}
	}
}
