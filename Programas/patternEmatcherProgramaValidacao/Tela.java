package patternEmatcherProgramaValidacao;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.WindowConstants;

import java.util.ArrayList;

public class Tela extends JFrame{
	
	// variáveis locais
	
	private ButtonGroup tipoSexo;
	private JLabel lblNome, lblSexo, lblEmail, lblValidade, lblMensagem;
	private JRadioButton rdbMasculino, rdbFeminino;
	private JTextField txtEmail,txtNome;
	private JButton btnLimpar, btnIncluir;
	//private List pessoas;
	
	// Construtor
	public Tela()
	{
		// Configuracoes da tela
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // encerre o programa ao clicar
		setTitle("Validacao de Cadastro"); // texto da tela
		setSize(500, 450); // tamanho da tela
		setLayout(null); // layout nulo
		
		//pessoas = new ArrayList();
		
		// Declaracao dos objetos
		
		lblNome = new JLabel();
		lblNome.setText("Nome:");
		lblNome.setBounds(80, 70, 50, 25);
		
		txtNome = new JTextField();
		txtNome.setBounds(130, 70, 200, 25);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(130, 200, 200, 25);
		
		lblSexo = new JLabel();
		lblSexo.setText("Sexo:");
		lblSexo.setBounds(80, 120, 50, 25);
		
		rdbMasculino = new JRadioButton();
		rdbMasculino.setSelected(true);
		rdbMasculino.setText("Masculino");
		rdbMasculino.setBounds(130, 120, 200, 25);
		
		rdbFeminino = new JRadioButton();
		rdbFeminino.setText("Feminino");
		rdbFeminino.setBounds(130, 150, 200, 25);
		
		tipoSexo = new ButtonGroup();
		tipoSexo.add(rdbMasculino);
		tipoSexo.add(rdbFeminino);
		
		lblEmail = new JLabel();
		lblEmail.setText("E-Mail");
		lblEmail.setBounds(80, 200, 50, 25);
		
		lblValidade = new JLabel();
		lblValidade.setBounds(130, 250, 200, 25);
		
		btnIncluir = new JButton();
		btnIncluir.setText("Incluir");
		btnIncluir.setEnabled(false);
		btnIncluir.setBounds(120, 300, 100, 25);
		
		
		btnLimpar = new JButton();
		
		
		
		// Adiciona objetos no frame
		add(lblNome);
		add(txtNome);
		add(lblEmail);
		add(txtEmail);
		add(lblSexo);
		add(rdbMasculino);
		add(rdbFeminino);
		add(lblValidade);
		add(btnIncluir);
		
		
		
		
		setLocationRelativeTo(null); // fixa tela no centro
	}
}
