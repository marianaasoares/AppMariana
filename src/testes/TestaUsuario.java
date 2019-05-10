package testes;

import conexao.Conexao;
import negocio.Usuario;

public class TestaUsuario {

	public static void main(String[] args) {

		if (Conexao.obterConexao() != null) {
			System.out.println("Conectou!!");
			
			Usuario usuario = new Usuario("mariana.soares@gmail.com", "123");
			
			System.out.println(usuario.getEmail());
		}else {
			System.out.println("Erro!!");
		}
		
	}

}
