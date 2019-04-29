package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Estudante;

public class EstudanteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public EstudanteController() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Estudante estudante = new Estudante();
		
		estudante.setNome(request.getParameter("nome"));
		estudante.setIdade(Integer.valueOf(request.getParameter("idade")));
		estudante.setMensalidade(Float.valueOf(request.getParameter("mensalidade")));
		estudante.setLogin(request.getParameter("login"));
		estudante.setSenha(request.getParameter("senha"));
		estudante.setSexo(request.getParameter("sexo"));
		estudante.setMunicipio(request.getParameter("municipio"));
		estudante.setDisciplinas(request.getParameterValues("disciplinas"));
		
		estudante.exibir();		
	}
}