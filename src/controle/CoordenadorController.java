package controle;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CoordenadorDao;
import negocio.Coordenador;

public class CoordenadorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CoordenadorController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Coordenador coordenador = new Coordenador();
		
		coordenador.setNome(request.getParameter("nome"));
		coordenador.setLogin(request.getParameter("login"));
		coordenador.setSenha(request.getParameter("senha"));
		coordenador.setSexo(request.getParameter("sexo"));
		coordenador.setUniversidade(request.getParameter("universidade"));
		coordenador.setSalario(Float.valueOf(request.getParameter("salario")));
		coordenador.setCurso(request.getParameter("curso"));
		
		CoordenadorDao.incluir(coordenador);
		
		request.setAttribute("titulo", "Coordenador");
		request.setAttribute("mensagem", coordenador.toString());
	}
}