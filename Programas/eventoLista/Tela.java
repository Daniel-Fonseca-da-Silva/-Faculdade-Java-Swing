package eventoLista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField texto;
	private JLabel lblEntreComTexto;
	private JButton btnColocar;
	private JButton btnRetirar;
	
	public Tela() {
		super("Programa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblEntreComTexto = new JLabel("Entre com texto:");
		lblEntreComTexto.setBounds(30, 66, 123, 15);
		contentPane.add(lblEntreComTexto);
		
		textField = new JTextField();
		textField.setBounds(30, 93, 114, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(30, 169, 114, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		btnColocar = new JButton("Colocar >>");
		btnColocar.setBounds(156, 90, 117, 25);
		contentPane.add(btnColocar);
		
		texto = new JTextField();
		texto.setBounds(295, 12, 131, 202);
		contentPane.add(texto);
		texto.setColumns(10);
		
		btnRetirar = new JButton("Retirar");
		btnRetirar.setBounds(305, 226, 117, 25);
		contentPane.add(btnRetirar);
	}
}
