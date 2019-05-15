package testes;

import dao.CoordenadorDao;
import negocio.Coordenador;

public class TestaCoordenador {

	public static void main(String[] args) {
		
		Coordenador coordenador = new Coordenador();
		coordenador.setNome("Manoel");
		coordenador.setLogin("tio.manoel");
		coordenador.setSenha("123456");
		coordenador.setSexo("M");
		coordenador.setUniversidade("Infnet");
		coordenador.setSalario(2000);
		coordenador.setCurso("Ciência da computação");

		
		CoordenadorDao.incluir(coordenador);
		
		coordenador.exibir();
		
		for (Coordenador c : CoordenadorDao.obterLista()) {
			c.exibir();
		}
	}
	
}