package aula1Exemplo001;

import javax.swing.JFrame;//Importa JFrame
import javax.swing.JLabel;//Importa JLabel
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Principal {
	public static void main(String[] args) {

		JFrame formulario = new JFrame();

		formulario.setVisible(true);// Inicia objeto do JFrame

		JLabel rotulo = new JLabel("Cria um texto JLabel");

		formulario.setSize(400, 500);// Seta o tamanho da tela
		formulario.setTitle("Formulario"); // Seta o titulo da tela
		formulario.setLocation(750, 300); // Seta a localizaÃ§Ã£o da tela
		
		formulario.add(rotulo); // Adiciona rotulo ao painel JFrame
		
		JMenuBar menuBarra = new JMenuBar();
		JMenuBar CadastroBarra = new JMenuBar();
		
		JMenu menu = new JMenu("Opções");
		JMenu menuCadastro = new JMenu("Cadastro");
		
		JMenuItem item1 = new JMenuItem("Carros");
		JMenuItem item2 = new JMenuItem("Motos");
		JMenuItem item3 = new JMenuItem("Barcos");
		JMenuItem item4 = new JMenuItem("Avioes");
		
		menu.add(item1);
		menu.add(item2);
		menuCadastro.add(item3);
		menuCadastro.add(item4);
		
		menuBarra.add(menu);
		CadastroBarra.add(menuCadastro);
		
		formulario.add(menuBarra);
		formulario.add(CadastroBarra);
		
		
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Termina objeto do JFrame
	}
}
