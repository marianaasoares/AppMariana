package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import auxiliar.Constante;
import conexao.Conexao;
import negocio.Coordenador;

public class CoordenadorDao {

	
	public static List<Coordenador> obterLista(){
		return Constante.COORDENADORES;
	}
	
	public static boolean incluir(Coordenador coordenador){
		try {
			PreparedStatement ps = 
					Conexao.obterConexao().prepareStatement(
							"INSERT INTO tcoordenador "
							+ "(nome, login, senha, sexo, universidade, salario, curso) "
							+ "VALUES "
							+ "(?,?,?,?,?)"
						);

			ps.setString(1, coordenador.getNome());
			ps.setString(2, coordenador.getLogin());
			ps.setString(3, coordenador.getSenha());
			ps.setString(4, coordenador.getSexo());
			ps.setString(5, coordenador.getUniversidade());
			ps.setFloat(6, coordenador.getSalario());
			ps.setString(7, coordenador.getCurso());
			
			ps.execute();
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		return false;
	}
}
