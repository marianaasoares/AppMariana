package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import auxiliar.Constante;
import conexao.Conexao;
import negocio.Professor;

public class ProfessorDao {

	
	public static List<Professor> obterLista(){
		return Constante.PROFESSORES;
	}
	
	public static boolean incluir(Professor professor){
		try {
			PreparedStatement ps = 
					Conexao.obterConexao().prepareStatement(
							"INSERT INTO tprofessor "
							+ "(nome, login, senha, sexo, universidade, salario, cursos) "
							+ "VALUES "
							+ "(?,?,?,?,?)"
						);

			ps.setString(1, professor.getNome());
			ps.setString(2, professor.getLogin());
			ps.setString(3, professor.getSenha());
			ps.setString(4, professor.getSexo());
			ps.setString(5, professor.getUniversidade());
			ps.setFloat(6, professor.getSalario());
			ps.setString(7, Arrays.toString(professor.getCursos()));
			
			ps.execute();
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		return false;
	}
}
