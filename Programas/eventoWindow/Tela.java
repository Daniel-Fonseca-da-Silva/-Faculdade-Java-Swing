package eventoWindow;

import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import javax.swing.JButton;

public class Tela extends JFrame implements WindowListener, ActionListener{
	private JTextField texto1 = null; // Declara texto1
	private JButton btnClose = null; // Declara btnClose
	private JButton btnClear = null; // Declara btnClear
	private JTextField introValue = null; // Declara introvalue

	Tela() {
		super("Programa x");// Titulo inicial
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// define o fechamento
		setLayout(new FlowLayout());// Define um gerenciador de layout

		introValue = new JTextField("Insira o valor");
		texto1 = new JTextField(10);// Inicializa texto1
		btnClose = new JButton("Sair");
		btnClear = new JButton("Limpar");

		introValue.setEditable(false); // Desativa edicao
		introValue.setForeground(Color.DARK_GRAY); // Cor do Texto
		introValue.setBorder(null); // Retira Borda
		introValue.setFont(new Font("Consolas", Font.BOLD, 20));// Define o estilo de fonte
		
		texto1.setToolTipText("Insira somente valores números"); // Define uma dica
		btnClose.setToolTipText("Fecha a aplicacao atual"); // Define uma dica
		btnClear.setToolTipText("Limpa os dados inseridos"); // Define uma dica
		
		add(introValue);
		add(texto1);
		add(btnClear);
		add(btnClose);

		addWindowListener(this); // Registra eventos
		btnClear.addActionListener(this);

		pack();// Organiza o layout
		setLocationRelativeTo(this);// Centraliza a tela
		setVisible(true);// torna visivel
	}
	
	// Tratamento dos Botoes
	
	// Tratamento do btnClear
	public void actionPerformed(ActionEvent evento)
	{
		if(texto1.getText() != null)
		{
			texto1.setText(null);
		}
	}
	// Tratamento do btnClose
	/*
	public void actionPerformed(ActionEvent evento)
	{
		
	}
	*/
	// Tratamento de eventos para a tela
	public void windowOpened(WindowEvent evento) {
		JOptionPane.showMessageDialog(rootPane, "Janela Aberta");
		// windowOpened dispara quando a janela é aberta
	}

	public void windowClosing(WindowEvent evento) {
		JOptionPane.showMessageDialog(rootPane, "Deseja finalizar a janela?");
		// windowOpened dispara quando a janela vai fechando
	}

	public void windowClosed(WindowEvent evento) {
		JOptionPane.showMessageDialog(rootPane, "Fechando...");
		// windowOpened dispara quando a janela é fechada
	}

	public void windowIconified(WindowEvent evento) {
		JOptionPane.showMessageDialog(rootPane, "Minimiza");
		// windowOpened dispara quando a janela é minimizada
	}

	public void windowDeiconified(WindowEvent evento) {
		JOptionPane.showMessageDialog(rootPane, "Maximiza");
		// windowOpened dispara quando a janela é maximizada
	}

	public void windowActivated(WindowEvent evento) {
		// windowOpened dispara quando a janela recebe foco

	}

	public void windowDeactivated(WindowEvent evento) {
		// windowOpened dispara quando a janela perde foco

	}

	// Tratamento de evento

}
