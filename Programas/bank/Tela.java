package bank;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;


public class Tela extends JFrame{
	
	private BorderLayout layout = null;
	private JPanel painelEsq = null;
	private JPanel painelDir = null;
	private JPanel painelTop = null;
	private JPanel painelNorth = null;
	
	Tela()
	{
		super("Bem vinda sr Maria ao seu Banco");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(650, 400));
		
		layout = new BorderLayout();
		setLayout(layout);
		setLayout(new BorderLayout());
		layout.setVgap(5);
		layout.setHgap(5);
		
		painelEsq = new JPanel();
		painelEsq.setLayout(new FlowLayout());
		painelEsq.setPreferredSize(new Dimension(350, 50));
		
		painelDir = new JPanel();
		painelDir.setLayout(new FlowLayout());
		painelDir.setPreferredSize(new Dimension(350, 50));
		
		painelTop = new JPanel();
		painelTop.setLayout(new FlowLayout());
		
		painelNorth = new JPanel();
		painelNorth.setLayout(new FlowLayout(FlowLayout.TRAILING));
		
		
		JTextField intro = new JTextField("Atenção! Finalize sua transação aqui");
		
		JTextField txt = new JTextField("Ofertas para você");
		txt.setToolTipText("Confira");
		
		JButton btnConta = new JButton("Conta Corrente");
		btnConta.setPreferredSize(new Dimension(315, 50));
		JButton btnPag = new JButton("Pagamento");
		btnPag.setPreferredSize(new Dimension(157, 50));
		JButton btnDep = new JButton("Depósito");
		btnDep.setPreferredSize(new Dimension(157, 50));
		JButton btnTrans = new JButton("Transferência");
		btnTrans.setPreferredSize(new Dimension(157, 50));
		JButton btnCred = new JButton("Crédito");
		btnCred.setPreferredSize(new Dimension(157, 50));
		JButton btnCel = new JButton("Recarga Celular");
		btnCel.setPreferredSize(new Dimension(157, 50));
		JButton btnOfert = new JButton("Minhas Ofertas");
		btnOfert.setPreferredSize(new Dimension(157, 50));
		JButton btnConf = new JButton("Configurações");
		btnConf.setPreferredSize(new Dimension(315, 50));
		JButton btnClose = new JButton("Fim");
		btnClose.setPreferredSize(new Dimension(100, 30));
		
		painelNorth.add(intro);
		painelNorth.add(btnClose);
		
		painelDir.add(btnConta);
		painelDir.add(btnPag);
		painelDir.add(btnDep);
		painelDir.add(btnTrans);
		painelDir.add(btnCred);
		painelDir.add(btnCel);
		painelDir.add(btnOfert);
		painelDir.add(btnConf);
		
		painelEsq.add(txt);
		
		add(painelDir, BorderLayout.EAST);
		add(painelEsq, BorderLayout.WEST);
		add(painelTop, BorderLayout.NORTH);
		add(painelNorth, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
}
