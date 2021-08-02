package eventoMouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JPanel;

public class Tela extends JFrame implements MouseListener{

	private JLabel texto; // Declara texto
	private JLabel CoordenadaX; // Declara CoordenadaX
	private JLabel CoordenadaY; // Declara CoordenadaY
	private JPanel painelSul; // Declara painelSul

	Tela() {
		// O padrão default de tela já é FlowLayout
		setTitle("Gerenciando o Mouse"); // Define o texto do Frame
		setLayout(new BorderLayout()); // Define um gerenciador de Borda
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Tipo de saída do Frame
		setSize(450, 350); // Define o tamanho do Frame
		setLocation(750, 350); // Localização do Frame na tela do computador

		//
		texto = new JLabel("Mensagem: ");
		CoordenadaX = new JLabel("x");
		CoordenadaY = new JLabel("y");
		painelSul = new JPanel(); // Inicializa painelSul
		
		
		
		// Inicializa todas variaveis e guarda elas dentro do JPanel painelSul

		painelSul.add(texto); // Adiciona texto ao painelSul
		painelSul.add(CoordenadaX); // Adiciona x ao painelSul
		painelSul.add(CoordenadaY); // Adiciona y ao painelSul
		add(painelSul, BorderLayout.SOUTH); // Adicionao JLabel painelSul a Tela que extende um JFrame
		
		// Registra eventos
		addMouseListener(this);
		
		setLocationRelativeTo(null);
		setVisible(true); // torna o frame visivel
	}
	// Função privada para todos os outros
	private void setaTexto(String msg, int x, int y)
	{
		texto.setText(msg);
		CoordenadaX.setText("x" + x);
		CoordenadaY.setText("y" + y);
		
	}

	
	// Tratamentos de eventos do mouse
	
	public void mouseClicked(MouseEvent evento)
	{
		// Dispara quando clicado
		setaTexto("Mouse foi clicado nas coordenadas: ", evento.getX(), evento.getY());
	}
	
	public void mouseEntered(MouseEvent evento)
	{
		// Dispara quando o mouse entra na area
		setaTexto("Mouse entrou nas coordenadas: ", evento.getX(), evento.getY());
	}
	public void mouseExited(MouseEvent evento)
	{
		// Dispara quando o mouse sai da regiao
		setaTexto("Mouse saiu das coordenadas: ", evento.getX(), evento.getY());
		
	}
	
	public void mousePressed(MouseEvent evento)
	{
		// Disparado quando o mouse é pressionado
		setaTexto("Mouse está pressionado nas coordenadas: ", evento.getX(), evento.getY());
	}
	public void mouseReleased(MouseEvent evento)
	{
		// Disparado quando o mouse é solto
		setaTexto("Mouse foi solto nas coordenadas: ", evento.getX(), evento.getY());
	}
}
