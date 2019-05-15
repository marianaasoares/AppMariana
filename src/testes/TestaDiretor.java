package testes;

import dao.DiretorDao;
import negocio.Diretor;

public class TestaDiretor {

	public static void main(String[] args) {
		Diretor diretor = new Diretor();
		
		diretor.setNome("Márcio");
		diretor.setLogin("tio.manoel");
		diretor.setSenha("123456");
		diretor.setSexo("M");
		diretor.setUniversidade("Infnet");
		diretor.setSalario(5000);
		diretor.setAdicional(500);

		DiretorDao.incluir(diretor);
		
		diretor.exibir();
		
		for (Diretor d : DiretorDao.obterLista()) {
			d.exibir();
		}
	}

}
