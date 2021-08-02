package eventosDeTextos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField texto;
	private JLabel labelEvento;
	private JLabel lblDigite;
	
	public Tela() {
		super("Testando Evento de Texto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblDigite = new JLabel("Digite");
		lblDigite.setBounds(149, 23, 70, 15);
		contentPane.add(lblDigite);
		
		labelEvento = new JLabel("Tipo de evento");
		labelEvento.setHorizontalAlignment(SwingConstants.CENTER);
		labelEvento.setBounds(79, 105, 185, 15);
		contentPane.add(labelEvento);
		
		texto = new JTextField();
		texto.setBounds(119, 60, 114, 19);
		contentPane.add(texto);
		texto.setColumns(10);
		
		// Classe anonima
		Textohandler handler = new Textohandler();
		texto.getDocument().addDocumentListener(handler);
		texto.addActionListener(handler);
		
	}
	
	// Classe de tratamento de evento
	public class Textohandler implements DocumentListener, ActionListener
	{
		@Override
		// Acontece toda vez que um caractere é inserido
		public void insertUpdate(DocumentEvent e)
		{
			labelEvento.setText("Atualizar Texto");
		}
		@Override
		// Acontece toda vez que um caractere é removido
		public void removeUpdate(DocumentEvent e)
		{
			labelEvento.setText("Remove Texto");
		}
		@Override
		// Acontece quando houve mudança no atributo do componente
		public void changedUpdate(DocumentEvent e)
		{
			System.out.println("Documento Atualizado");
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			labelEvento.setText("Acao");
			
		}
	}
}
