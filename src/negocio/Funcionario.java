package negocio;

public abstract class Funcionario {

	private String nome;
	private String login;
	private String senha;
	private String sexo;
	private String universidade;
	private float salario;
	
	public abstract void exibir();
	
	@Override
	public String toString() {
		return String.format(
				"%s (%s)\n" + 
				"Salário: R$%.2f\n" +		
				"Instituição: %s",
				this.getNome(),
				this.getLogin(),
				this.getSalario(),
				this.getUniversidade()
			);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getUniversidade() {
		return universidade;
	}
	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
}
