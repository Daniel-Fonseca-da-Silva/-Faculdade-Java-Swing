package gridBagLayout;

import javax.swing.*;
import java.awt.*;

public class Tela extends JFrame{
	private GridBagLayout layout;
	private GridBagConstraints constraints;
	private JFrame f;
	
	Tela()
	{
		f = new JFrame("Programa 5");
		
		layout = new GridBagLayout();
		f.setLayout(layout);
		constraints = new GridBagConstraints();
		
		JTextArea textArea1 = new JTextArea("TextArea1", 5, 10);
		JTextArea textArea2 = new JTextArea("TextArea2", 2, 2);
		JTextField textField = new JTextField("TextField");
		
		JButton botao1 = new JButton("Botao 1");
		JButton botao2 = new JButton("Botao 2");
		JButton botao3 = new JButton("Botao 3");
		JButton botao4 = new JButton("Botao 4");
		
		constraints.fill = GridBagConstraints.BOTH;
		adiciona(textArea1, 0, 0, 1, 3);
		constraints.fill = GridBagConstraints.HORIZONTAL;
		adiciona(botao1, 0, 1, 2, 1);
		adiciona(botao4, 2, 1, 2, 1);
		constraints.weightx = 1000;
		constraints.weighty = 1;
		constraints.fill = GridBagConstraints.BOTH;
		adiciona(botao2, 1, 1, 1, 1);
		constraints.weightx = 0;
		constraints.weighty = 0;
		adiciona(botao3, 1, 2, 1, 1);
		adiciona(textField, 3, 0, 2, 1);
		adiciona(textArea2, 3, 2, 1, 1);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 300);
		f.setVisible(true);
	}
	
	private void adiciona(Component component, int row, int column, int width, int height)
	{
		constraints.gridx = column;
		constraints.gridy = row;
		constraints.gridwidth = width;
		constraints.gridheight = height;
		layout.setConstraints(component, constraints);
		f.add(component);
	}
}
