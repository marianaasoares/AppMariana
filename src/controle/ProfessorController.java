package controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Professor;

public class ProfessorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProfessorController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Professor professor = new Professor();
		
		professor.setNome(request.getParameter("nome"));
		professor.setLogin(request.getParameter("login"));
		professor.setSenha(request.getParameter("senha"));
		professor.setSexo(request.getParameter("sexo"));
		professor.setUniversidade(request.getParameter("universidade"));
		professor.setSalario(Float.valueOf(request.getParameter("salario")));
		professor.setCursos(request.getParameterValues("cursos"));
		
		PrintWriter html = response.getWriter();		
		html.println("<h3>"+professor+"</h3>");
	}
}