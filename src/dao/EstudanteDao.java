package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import auxiliar.Constante;
import conexao.Conexao;
import negocio.Estudante;

public class EstudanteDao {
	
	public static List<Estudante> obterLista(){
		return Constante.ESTUDANTES;
	}

	public static boolean incluir(Estudante estudante){
		try {
			PreparedStatement ps = 
					Conexao.obterConexao().prepareStatement(
							"INSERT INTO TEstudante "
							+ "(nome, idade, mensalidade, login, senha, sexo, municipio, disciplinas) "
							+ "VALUES "
							+ "(?,?,?,?,?)"
						);

			ps.setString(1, estudante.getNome());
			ps.setInt(2,estudante.getIdade());
			ps.setFloat(3, estudante.getMensalidade());
			ps.setString(3, estudante.getLogin());
			ps.setString(4, estudante.getSenha());
			ps.setString(5, estudante.getSexo());
			ps.setString(6, estudante.getMunicipio());
			ps.setString(7, Arrays.toString(estudante.getDisciplinas()));

			
			ps.execute();
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		return false;
	}
	
	
}
