package testes;

import dao.EstudanteDao;
import negocio.Estudante;

public class TestaEstudante {
	
	public static void main(String[] args) {
		
		String[] lista = {"portugu�s", "matem�tica", "estudos sociais", "ci�ncias"};
		
		Estudante estudante = new Estudante();
		estudante.setNome("Jo�o da Silva");
		estudante.setIdade(20);
		estudante.setLogin("joao.silva");
		estudante.setSenha("123456");
		estudante.setSexo("F");
		estudante.setMunicipio("Maric�");
		estudante.setMensalidade(1000);
		estudante.setDisciplinas(lista);
//		
//		EstudanteDao.incluir(estudante);
//		
//		estudante.exibir();
		
		for (Estudante e : EstudanteDao.obterLista()) {
			e.exibir();
		}
	}
}