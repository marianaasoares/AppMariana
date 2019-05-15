package auxiliar;


import java.util.Arrays;
import java.util.List;

import negocio.Coordenador;
import negocio.Diretor;
import negocio.Estudante;
import negocio.Professor;
import negocio.Usuario;

public class Constante {
	public static final List <Usuario> USUARIOS = Arrays.asList(
			new Usuario ("joao@silva.com", "123"), 
			new Usuario ("maria@soares.com", "456"),
			new Usuario("paulo@santos.com", "789"));
	
	public static final List<Coordenador> COORDENADORES = Arrays.asList(
		new Coordenador("Jo�o", "Est�cio", 1500, "Computa��o"),
		new Coordenador("Marcela", "Est�cio", 2000, "Moda")
			);
	public static final List<Diretor> DIRETORES = Arrays.asList(
			new Diretor("Orlando", "Est�cio", 4100, 200),
			new Diretor("Pauolo", "Infnet", 5000, 300)
			);
	
	public static final List<Professor> PROFESSORES = Arrays.asList(
			new Professor("Amanda", "Est�cio", 2000, new String[]{"Moda", "Desenho"}),
			new Professor("Luiz", "Est�cio", 2500, new String[]{"Java", "OPP"})
			);
	
	public static final List<Estudante> ESTUDANTES = Arrays.asList(
			new Estudante("Maria", 50, 200, "Maric�"),
			new Estudante("Mauro", 30, 500, "Rio de Janeiro")			
			);
}
