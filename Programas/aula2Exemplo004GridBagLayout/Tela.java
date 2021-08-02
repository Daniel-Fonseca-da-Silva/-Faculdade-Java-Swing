package aula2Exemplo004GridBagLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.List;
import java.awt.TextArea;
import java.awt.Button;

public class Tela extends JFrame {

	private GridBagLayout layout = null;
	private final int noLinhas = 3;

	public Tela() {
		super("Teste GridBagLayout");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(400, 200));
		layout = new GridBagLayout();
		getContentPane().setLayout(layout);
		;
		
		//Cria listas
		List lista = new List(noLinhas, true);
		
		//Adiciona listas
		lista.add("Um");
		lista.add("Dois");
		lista.add("Três");
		lista.add("Quatro");
		lista.add("Cinco");
		lista.add("Seis");
		lista.add("Sete");

		//Botões
		Button add = new Button(">>");
		Button clear = new Button("Clear");
		Button close = new Button("Close");
		TextArea textoArea = new TextArea("", noLinhas, 10, TextArea.SCROLLBARS_NONE);

		// Lista menu Esquerdo
		GridBagConstraints restricoes = new GridBagConstraints();
		restricoes.gridx = 0;
		restricoes.gridy = 0;
		restricoes.gridwidth = 1;
		restricoes.gridheight = 3;
		restricoes.fill = GridBagConstraints.VERTICAL;
		add(lista, restricoes);
		
		restricoes.gridx = 2;
		add(textoArea, restricoes);

		// Lista menu Direito
		Insets margens = new Insets(4, 3, 4, 3);
		restricoes.gridx = 1;
		restricoes.gridy = 0;
		restricoes.gridwidth = 1;
		restricoes.gridheight = 1;
		restricoes.fill = GridBagConstraints.BOTH;
		restricoes.ipadx = 4;
		restricoes.ipady = 4;
		restricoes.insets = margens;

		// Botão adicionar
		add(add, restricoes);

		// Botão clear
		restricoes.gridy = 1;
		add(clear, restricoes);

		// Botão close
		restricoes.gridx = 3;
		add(close, restricoes);

		pack();

		setVisible(true);
	}

}
