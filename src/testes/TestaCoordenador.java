package testes;

import negocio.Coordenador;

public class TestaCoordenador {

	public static void main(String[] args) {
		
		Coordenador coordenador = new Coordenador();
		
		coordenador.setNome("tio manoel");
		coordenador.setLogin("tio.manoel");
		coordenador.setSenha("123456");
		coordenador.setSexo("M");
		coordenador.setUniversidade("Infnet");
		coordenador.setSalario(1000);
		coordenador.setCurso("ciência da computação");
		
		coordenador.exibir();
	}
}