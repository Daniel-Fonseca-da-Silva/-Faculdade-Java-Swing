package itemListener;

// importacoes swing
import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JList;
//importacoes awt
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Tela extends JFrame implements ActionListener, TextListener, KeyListener, FocusListener, ItemListener {

	// Atributos privados locais
	private DefaultListModel lista = null;
	private JButton btnIncluirLista = null;
	private JButton btnTirarLista = null;
	private JCheckBox caixa = null;
	private JLabel lblTexto = null;
	private JLabel lblMenssagem = null;
	private JScrollPane rolagem = null;
	private JTextField txtItem = null;
	private JTextField txtTexto = null;
	private JList JLista = null;

	public Tela() {
		// Tela
		super("Programa de Teclas");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(null);

		// Texto
		lblTexto = new JLabel();
		lblTexto.setText("Entre com o Texto");
		lblTexto.setLocation(40, 100);
		lblTexto.setSize(300, 28);

		// Menssagem
		lblMenssagem = new JLabel("");
		lblMenssagem.setFont(new java.awt.Font("Calibri", 1, 20));
		lblMenssagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblMenssagem.setText("Menssagens de Informacao");
		lblMenssagem.setLocation(100, 420);
		lblMenssagem.setSize(300, 28);

		// txtItem
		txtItem = new JTextField();
		txtItem.setLocation(40, 125);
		txtItem.setSize(120, 28);
		txtItem.addKeyListener(this);
		txtItem.addFocusListener(this);

		// Texto
		txtTexto = new JTextField();
		txtTexto.setLocation(40, 220);
		txtTexto.setSize(120, 20);
		txtTexto.setText("Texto");

		// btnIncluirLista
		btnIncluirLista = new JButton();
		btnIncluirLista.setText("Colocar >>");
		btnIncluirLista.setLocation(170, 168);
		btnIncluirLista.setSize(120, 20);
		btnIncluirLista.addActionListener(this);

		// btnTirarLista
		btnTirarLista = new JButton();
		btnTirarLista.setText("Retirar");
		btnTirarLista.setLocation(300, 320);
		btnTirarLista.setSize(120, 28);
		btnTirarLista.addActionListener(this);

		// Lista
		lista = new DefaultListModel();
		JLista = new JList(lista);

		// Adiciona um ScrollPane
		rolagem = new JScrollPane(JLista);
		rolagem.setLocation(300, 100);
		rolagem.setSize(120, 180);

		// caixa JCheckBox
		caixa = new JCheckBox();
		caixa.setText("Caixa Selecionada");
		caixa.setLocation(40, 244);
		caixa.setSize(160, 180);
		caixa.addItemListener(this);

		// Adiciona ao Frame
		add(lblTexto);
		add(lblMenssagem);
		add(txtItem);
		add(txtTexto);
		add(btnIncluirLista);
		add(btnTirarLista);
		add(rolagem);
		add(caixa);

		setLocationRelativeTo(this);// Centraliza a tela
	}

////////////////////////////////////////////////////////////////////////////////////////////////
	
	/* Tratamento dos eventos Listeners */
	
		// Quando algum botao for pressionado
		public void actionPerformed(ActionEvent evt) 
		{
			System.out.println("Um botao foi pressionado!");
			if (evt.getSource() == btnIncluirLista) // Se for o botao Colocar
			{
				trataEventoBtnIncluirLista(evt); // Chame o metodo de incluir
			}  
			else if (evt.getSource() == btnTirarLista) // Se for o botao Retirar
			{
				trataEventoBtnRetirarLista(evt); // Chame esse metodo de retirar
			}
		}

		// Chamado quando o valor do texto for alterado.
		public void textValueChanged(TextEvent e) 
		{
			trataEventoTxtTexto(e);
		}

		// Chamado quando uma chave for clicada
		public void keyTyped(KeyEvent e) 
		{
			trataEventokeyTypedTxtItem(e);
		}

		// Chamado quando uma tecla for pressionada.
		public void keyPressed(KeyEvent e) 
		{

		}

		// Chamado quando uma chave for solta.
		public void keyReleased(KeyEvent e) 
		{

		}
		
		// Ganha foco
		public void focusGained(FocusEvent e) {
			trataEventoGanhoFocoTxtItem(e);
		}

		// Perde foco
		public void focusLost(FocusEvent e) {
			trataEventoPercoFocoTxtItem(e);
		}

		// Item evento
		
		public void itemStateChanged(ItemEvent e) {
			trataEventoMudancaEstadoCheckBox(e);
			
		}

////////////////////////////////////////////////////////////////////////////////////////////////
		
	/* Metodos */

	// Botao Colocar
	private void trataEventoBtnIncluirLista(ActionEvent evt) 
	{
		if (txtItem.getText().equals("")) // Se o txtItem que é um JTextField estiver vazio
		{
			lblMenssagem.setText("Caixa Vazia");
		} else { //Se txtItem estiver cheio	
			lista.addElement(txtItem.getText());// Adiciona o que foi escrito na lista
			txtItem.setText(""); // Limpa o campo do txtItem que é um JTextField
			lblMenssagem.setText(""); // Limpa o campo do lblMenssagem que é um JTextField
		}
	}

	// Botao Retirar
	private void trataEventoBtnRetirarLista(ActionEvent evt) 
	{
		if (JLista.getSelectedIndex() >= 0) // Se a lista tiver algum elemento
		{	
			System.out.println("A Lista tinha conteudo");
			// Descricao de baixo
			// TxtItem recebe o valor
			// lista remove o conteudo dela
			txtItem.setText((String) lista.remove(JLista.getSelectedIndex()));
		}
	}

	// Teclas 
	
	// Toda vez que se escreve em txtItem converte para número
	private void trataEventokeyTypedTxtItem(KeyEvent e) 
	{
		String s = txtItem.getText();
		s.concat(Integer.toString(e.getKeyChar()));
		lblMenssagem.setText("Tecla ->" + Integer.toString(e.getKeyChar()));

		if (e.getKeyChar() == 10) 
		{
			trataEventoBtnIncluirLista(null);
		}
	}
	
	// Texto

	private void trataEventoTxtTexto(TextEvent e) 
	{
		lblMenssagem.setText("Texto mudou!" + e.toString());
	}
	
	private void trataEventoGanhoFocoTxtItem(FocusEvent e)
	{
		lblMenssagem.setText("Caixa de texto com foco!");
	}
	
	// Focu
	
	private void trataEventoPercoFocoTxtItem(FocusEvent e)
	{
		lblMenssagem.setText("Perdeu o foco!");
	}
	
	// CheckBox
	
	private void trataEventoMudancaEstadoCheckBox(ItemEvent e)
	{
		System.out.println("Estado mudou!");
		Object [] i = caixa .getSelectedObjects();
		
		if(i != null)
		{
			lblMenssagem.setText("Caixa de texto esta selecionada");
		}
		else
		{
			lblMenssagem.setText("Caixa de texto nao esta selecionada");
		}
	}
}
