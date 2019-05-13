package testes;


import dao.DiretorDao;
import negocio.Diretor;

public class TestaDiretor {

	public static void main(String[] args) {
		Diretor diretor = new Diretor();
		
		diretor.setNome("tio manoel");
		diretor.setLogin("tio.manoel");
		diretor.setSenha("123456");
		diretor.setSexo("M");
		diretor.setUniversidade("Infnet");
		diretor.setSalario(1000);
		diretor.setAdicional(500);
		
		DiretorDao.incluir(diretor);
		
		diretor.exibir();
	}

}
