package negocio;

public class Coordenador extends Funcionario {

	private String curso;
	
	@Override
	public void exibir() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return String.format(
				"%s: %s\n" +
				"Curso: %s\n",
				"M".equals(this.getSexo()) ? "Coordenador" : "Coordenadora",
				super.toString(),
				this.getCurso()
			);
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
}