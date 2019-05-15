package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import auxiliar.Constante;
import conexao.Conexao;
import negocio.Diretor;

public class DiretorDao {

	
	public static List<Diretor> obterLista(){
		return Constante.DIRETORES;
	}
	
	public static boolean incluir(Diretor diretor){
		try {
			PreparedStatement ps = 
					Conexao.obterConexao().prepareStatement(
							"INSERT INTO TDiretor "
							+ "(nome, login, senha, sexo, universidade, salario, adicional) "
							+ "VALUES "
							+ "(?,?,?,?,?)"
						);

			ps.setString(1, diretor.getNome());
			ps.setString(2, diretor.getLogin());
			ps.setString(3, diretor.getSenha());
			ps.setString(4, diretor.getSexo());
			ps.setString(5, diretor.getUniversidade());
			ps.setFloat(6, diretor.getSalario());
			ps.setFloat(7, diretor.getAdicional());
			
			ps.execute();
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		return false;
	}
}
