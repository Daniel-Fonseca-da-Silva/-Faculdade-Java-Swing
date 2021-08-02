package aula1Exemplo003;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;

public class Tela extends JFrame{
	
	private JLabel lblTitulo = null;
	private JLabel lblNome = null;
	private JLabel lblEmail = null;
	private JLabel lblSexo = null;
	private JLabel lblSenha = null;
	private JLabel lblEstiloLeitura = null;
	private JLabel lblTimeFutebol = null;
	private JTextField txtNome = null;
	private JTextField txtEmail = null;
	private JPasswordField  psvSenha = null;
	private JRadioButton rdtMasculino = null;
	private JRadioButton rdtFeminino = null;
	private JCheckBox chkEsportes = null;
	private JCheckBox chkEducacao = null;
	private JCheckBox chkCulinaria = null;
	private JComboBox JComboBox1 = null;
	private JButton btnButton = null;
	
	private ButtonGroup tipoSexo = null;
	
	JFrame f;
	
	public Tela()
	{
		f =  new JFrame("Cadastro de Clientes");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(410, 409);
		f.setLocation(0, 23);
		
		lblTitulo = new JLabel("Cadastro do Cliente");
		lblTitulo.setLocation(118, 6);
		lblTitulo.setSize(154, 23);
		lblTitulo.setFont(new Font("Calibri", Font.BOLD, 14));
		
		lblNome = new JLabel("Nome");
		lblNome.setLocation(106, 52);
		lblNome.setSize(41, 16);
		
		txtNome = new JTextField(10);
		txtNome.setLocation(150, 46);
		txtNome.setSize(123, 28);
		
		lblEmail = new JLabel("E-mail");
		lblEmail.setLocation(106, 92);
		lblEmail.setSize(38, 16);
		
		txtEmail = new JTextField(10);
		txtEmail.setLocation(150, 83);
		txtEmail.setSize(123, 28);
		
		lblSenha = new JLabel("Senha");
		lblSenha.setBounds(103, 126, 41, 16);
		
		psvSenha = new JPasswordField();
		psvSenha.setBounds(150, 120, 123, 28);
		
		lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(110,175, 34, 16);
		
		rdtMasculino = new JRadioButton("Masculino");
		rdtMasculino.setBounds(150, 160, 96, 23);
		
		rdtFeminino = new JRadioButton("Feminino");
		rdtFeminino.setBounds(150, 195, 99, 23);
		
		lblEstiloLeitura = new JLabel("Estilo de leitura");
		lblEstiloLeitura.setBounds(39, 233, 105, 16);
		
		chkEsportes = new JCheckBox("Esportes");
		chkEsportes.setBounds(150, 229, 86, 23);
		
		chkEducacao = new JCheckBox("Educacao");
		chkEducacao.setBounds(150, 248, 91, 23);
		
		chkCulinaria = new JCheckBox("Culinaria");
		chkCulinaria.setBounds(150, 267, 88, 23);
		
		lblTimeFutebol = new JLabel("Time de futebol");
		lblTimeFutebol.setBounds(39, 226, 145, 161);
		
		JComboBox1 = new JComboBox();
		JComboBox1.setBounds(150, 295, 102, 27);
		JComboBox1.addItem("Fluminense");
		JComboBox1.addItem("Vasco");
		JComboBox1.addItem("America");
		JComboBox1.addItem("Sao Paulo");
		
		btnButton = new JButton("Enviar");
		btnButton.setBounds(350, 326, 77, 29);
		
		tipoSexo = new ButtonGroup();
		
		tipoSexo.add(rdtMasculino);
		tipoSexo.add(rdtFeminino);
		
		f.add(lblTitulo);
		f.add(lblNome);
		f.add(lblEmail);
		f.add(lblSexo);
		f.add(lblSenha);
		f.add(lblEstiloLeitura);
		f.add(lblTimeFutebol);
		f.add(txtNome);
		f.add(txtEmail);
		f.add(psvSenha);
		f.add(rdtMasculino);
		f.add(rdtFeminino);
		f.add(chkEsportes);
		f.add(chkCulinaria);
		f.add(chkEducacao);
		f.add(JComboBox1);
		f.add(btnButton);
		
		f.setLayout(new FlowLayout(FlowLayout.TRAILING));
	}
	
}
