package bancoDeDados01;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;

public class Tela extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JLabel lblEstadoAtual;
	Connection connection = null;
	Statement statement = null;
	ResultSet  resultset = null;

	public Tela() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConectandoAoSgbd = new JLabel("Conectando ao SGBD");
		lblConectandoAoSgbd.setBounds(42, 70, 164, 15);
		contentPane.add(lblConectandoAoSgbd);
		
		JButton btnConectar = new JButton("Conectar");
		btnConectar.setBounds(260, 65, 117, 25);
		contentPane.add(btnConectar);
		btnConectar.addActionListener(this);
		
		lblEstadoAtual = new JLabel();
		lblEstadoAtual.setText("estado atual desconectado");
		lblEstadoAtual.setBounds(114, 131, 205, 15);
		contentPane.add(lblEstadoAtual);
	}
	
	public void conectarBanco()
	{
		
		String servidor = "jdbc:mysql://localhost:3306/gregs_list";
		String usuario = "root";
		String senha = "123";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try
		{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(servidor, usuario, senha);
			Statement st = con.createStatement();
			String query = "SELECT * FROM meus_contatos";
			ResultSet rs = st.executeQuery(query);
			lblEstadoAtual.setText("SQL OK");
			rs.close();
			st.close();
			con.close();
			
		}
		catch(ClassNotFoundException e)
		{
			lblEstadoAtual.setText(e.getMessage());
		}
		catch(SQLException e)
		{
			lblEstadoAtual.setText(e.getMessage());
		}
		catch(Exception e)
		{
			lblEstadoAtual.setText(e.getMessage());
		}
	}

	public void actionPerformed(ActionEvent e) {
		conectarBanco();
	}
}
