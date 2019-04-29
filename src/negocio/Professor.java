package negocio;

public class Professor extends Funcionario {

	private String[] cursos;
	
	@Override
	public void exibir() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		
		String cursos = "Cursos:";		
		for(String curso : this.getCursos()) {			
			cursos = cursos + String.format("\n- %s", curso);
		}
		
		return String.format(
				"%s: %s\n" +
				"%s",
				"M".equals(this.getSexo()) ? "Professor" : "Professora",
				super.toString(),
				cursos
			);
	}
	
	public String[] getCursos() {
		return cursos;
	}
	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
}