package eventoJComboBox;

// Importacao Swing
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;

import java.awt.event.ActionEvent;
// Importacao AWT
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Tela extends JFrame implements ActionListener, ItemListener{
	
	// Atributos
	private JButton btnIncluir, btnIncluirNovoEsporte;
	private JCheckBox chkNovoEsporte;
	private JComboBox cbxEsporte;
	private JLabel lblEsporte, lblMensagem, lblNovoEsporte;
	private JList lstEsportesSelecionados;
	private JTextField txtNovoEsporte;
	private JComboBox listaCombo;
	private DefaultListModel listaTexto;
	private JScrollPane painelRolamentoLista;
	// Construtor
	Tela()
	{
		super("Tratamento com ComboBox");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(null);
		setSize(500, 400);
		
		String[] esportes = {"", "Natação", "Ciclismo", "Calistenia", "Futebol", "Volei"};
		
		lblEsporte = new JLabel();
		lblEsporte.setText("Escolha um esporte");
		lblEsporte.setLocation(120, -150);
		lblEsporte.setSize(300, 400);
		
		cbxEsporte = new JComboBox(esportes);
		cbxEsporte.addItem("Basquete");
		cbxEsporte.setEditable(false);
		cbxEsporte.setBounds(120, 82, 150, 30);
		
		btnIncluir = new JButton();
		btnIncluir.setText("Incluir >");
		btnIncluir.setBounds(120, 125, 150, 25);
		btnIncluir.addActionListener(this);
		
		lblMensagem = new JLabel();
		lblMensagem.setFont(new java.awt.Font("Tahoma", 1 ,12));
		lblMensagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensagem.setText("Mensagens");
		lblMensagem.setBounds(120, 130, 150, 100);
		
		painelRolamentoLista = new JScrollPane();
		listaTexto = new DefaultListModel();
		lstEsportesSelecionados = new JList(listaTexto);
		painelRolamentoLista.setViewportView(lstEsportesSelecionados);
		painelRolamentoLista.setBounds(300, 85, 150, 150);
		
		chkNovoEsporte = new JCheckBox();
		chkNovoEsporte.setText("Inclusao de novos Esportes");
		chkNovoEsporte.setBounds(0, 215, 270, 25);
		chkNovoEsporte.addItemListener(this);
		
		lblNovoEsporte = new JLabel();
		lblNovoEsporte.setText("Novo esporte");
		lblNovoEsporte.setEnabled(false);
		lblNovoEsporte.setBounds(8, 265, 150, 25);
		
		txtNovoEsporte = new JTextField();
		txtNovoEsporte.setEnabled(false);
		txtNovoEsporte.setBounds(120, 265, 150, 25);
		
		btnIncluirNovoEsporte = new JButton();
		btnIncluirNovoEsporte.setText("Inclui na lista");
		btnIncluirNovoEsporte.setEnabled(false);
		btnIncluirNovoEsporte.setBounds(300, 265, 150, 25);
		btnIncluirNovoEsporte.addActionListener(this);
		
		add(lblEsporte);
		add(cbxEsporte);
		add(btnIncluir);
		add(lblMensagem);
		add(painelRolamentoLista);
		add(chkNovoEsporte);
		add(lblNovoEsporte);
		add(txtNovoEsporte);
		add(btnIncluirNovoEsporte);
		
		setLocationRelativeTo(null);
		
	// Listeners
	}
	public void itemStateChanged(ItemEvent e) {
		trataMudancaEstado();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnIncluir)
		{
			trataEventoBtnIncluir(e);
		} 
		else if(e.getSource() == btnIncluirNovoEsporte)
		{
			trataEventoBtnIncluirNovoEsporte(e);
		}
	}
	
	private void trataEventoBtnIncluirNovoEsporte(ActionEvent evt)
	{
		if(txtNovoEsporte.getText().equals(""))
		{
			lblMensagem.setText("Caixa Vazia");
		}
		else
		{
			cbxEsporte.addItem(txtNovoEsporte.getText());
			txtNovoEsporte.setText("");
		}
	}
	
	private void trataEventoBtnIncluir(ActionEvent evt)
	{
		lblMensagem.setText(cbxEsporte.getSelectedItem().toString());
		listaTexto.addElement(cbxEsporte.getSelectedItem());
		cbxEsporte.removeItemAt(cbxEsporte.getSelectedIndex());
	}
	
	private void trataMudancaEstado()
	{
		Object[] i = chkNovoEsporte.getSelectedObjects();
		if(i != null)
		{
			habilitaInclusao(true);
		}
		else
		{
			habilitaInclusao(false);
		}
	}
	
	private void habilitaInclusao(boolean e)
	{
		txtNovoEsporte.setEnabled(e);
		lblNovoEsporte.setEnabled(e);
		btnIncluirNovoEsporte.setEnabled(e);
	}
	
}
