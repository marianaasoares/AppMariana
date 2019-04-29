package controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Diretor;

public class DiretorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DiretorController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Diretor diretor = new Diretor();
		
		diretor.setNome(request.getParameter("nome"));
		diretor.setLogin(request.getParameter("login"));
		diretor.setSenha(request.getParameter("senha"));
		diretor.setSexo(request.getParameter("sexo"));
		diretor.setUniversidade(request.getParameter("universidade"));
		diretor.setSalario(Float.parseFloat(request.getParameter("salario")));
		diretor.setAdicional(Float.parseFloat(request.getParameter("adicional")));
		
		PrintWriter html = response.getWriter();		
		html.println("<h3>"+diretor+"</h3>");
		
		
		
	}

}
