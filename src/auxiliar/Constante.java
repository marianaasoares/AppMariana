package auxiliar;


import java.util.Arrays;
import java.util.List;

import negocio.Usuario;

public class Constante {
	public static final List <Usuario> USUARIOS = Arrays.asList(
			new Usuario ("joao@silva.com", "123"), 
			new Usuario ("maria@soares.com", "456"),
			new Usuario("paulo@santos.com", "789"));
}
