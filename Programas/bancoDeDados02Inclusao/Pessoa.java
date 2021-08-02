package bancoDeDados02Inclusao;

public class Pessoa {
	private String nome, cidade;
	private int idade, senha;
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public void setCidade(String cidade)
	{
		this.cidade = cidade;
	}
	
	public void setSenha(int senha)
	{
		this.senha = senha;
	}
	
	public void setIdade(int idade)
	{
		this.idade = idade;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public String getCidade()
	{
		return cidade;
	}
	
	public int getIdade()
	{
		return idade;
	}
	
	public int getSenha()
	{
		return senha;
	}
}
