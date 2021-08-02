package boxLayout;

import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.BoxLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Tela extends JFrame{
	
	JPanel cena;
	
	Tela()
	{
		super("Exemplo BoxLayout");
		setDefaultLookAndFeelDecorated(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(500,500, 500, 500);
		JPanel cena = new JPanel();
		
		BoxLayout layout = new BoxLayout(cena, BoxLayout.Y_AXIS);
		cena.setLayout(layout);
		cena.setBorder(new EmptyBorder(new Insets(150, 200, 150, 200)));
		
		JButton btn1 = new JButton("Exemplo 1");
		JButton btn2 = new JButton("Exemplo 2");
		JButton btn3 = new JButton("Exemplo 3");
		
		cena.add(btn1);
		cena.add(btn2);
		cena.add(btn3);
		
		//pack();
		this.add(cena);
	}
}
