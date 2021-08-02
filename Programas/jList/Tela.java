package jList;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class Tela extends JFrame{
	private JList listaCor;
	private final String cores[] = {"Vermelho", "Amarelo", "Laranja", "Azul", "Preto", "Branco",
	"Violeta", "Roxo", "Cinza", "Magenta", "Marron", "Verde", "Ciano", "Amarelo", "Rosa"};
	
	public Tela()
	{
		super("JLista de cores");
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(200,150));
		setLocation(750, 500);
		
		listaCor = new JList(cores);
		listaCor.setVisibleRowCount(5); // Número de itens a sereme exibidos
		listaCor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // Tipo de seleção
		
		add(new JScrollPane(listaCor)); /*adiciona barra de rolagem ao JLista /
		 sem o JScrollPane ele mostra um texto de lista*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);	
	}
	
	
}
