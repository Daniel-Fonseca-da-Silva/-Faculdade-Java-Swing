package bancoDeDados02Inclusao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tela {

	Scanner teclado = new Scanner(System.in);
	Pessoa pessoa = new Pessoa();
	Connection con;
	Statement st;

	public Tela() {
		System.out.println("Seu nome?");
		pessoa.setNome(teclado.next());
		
		System.out.println("cidade?");
		pessoa.setCidade(teclado.next());
		
		System.out.println("idade?");
		pessoa.setIdade(teclado.nextInt());
		
		System.out.println("senha?");
		pessoa.setSenha(teclado.nextInt());

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/funcionarios", "root", "123");
			st = con.createStatement();
			st.executeUpdate("INSERT INTO funcionarios.contratados VALUES('" + pessoa.getNome() + "',  '" + pessoa.getCidade()
					+ "', '" + pessoa.getIdade() + "',  '" + pessoa.getSenha() + "')");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Espaços não são permitidos, obs: 'SP', 'RJ', 'PR'" + e.getMessage());
		}
		catch(Exception e) 
		{
			System.out.println("Erro" + e.getMessage());
		}

	}

}
