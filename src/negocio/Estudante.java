package negocio;


public class Estudante {

	private String nome;
	private int idade;
	private float mensalidade;
	private String login;
	private String senha;
	private String sexo;
	private String municipio;
	private String[] disciplinas;
	
	
	public Estudante() {
		
	}
	
	public Estudante(String nome, int idade, float mensalidade, String municipio) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setMensalidade(mensalidade);
		this.setMunicipio(municipio);
	}

	public void exibir() {
		System.out.println(this.toString());
		System.out.println("Disciplinas:"); 
		if(this.getDisciplinas() != null) {
		for(String disciplina : this.getDisciplinas()) {			
			System.out.println("- " + disciplina);
			}
		}else {
			System.out.println("N�o existe!");
		}
	}
	
	@Override
	public String toString() {
		return String.format(
				"%s: %s (%s)\n" + 
						"%s de %s\n",
						"M".equals(this.getSexo()) ? "Aluno" : "Aluna",
						this.getNome(),
						this.getLogin(),
						"M".equals(this.getSexo()) ? "Morador" : "Moradora",
						this.getMunicipio()
			);
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
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
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String[] getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}
}