package controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CoordenadorDao;
import dao.DiretorDao;
import dao.EstudanteDao;
import dao.ProfessorDao;

public class AppController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String tela;
	
    public AppController() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		tela = request.getParameter("tela").toLowerCase()+"Detalhe.html";
		
		request.getRequestDispatcher(tela).forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		tela = request.getParameter("tela").toLowerCase()+"Lista.jsp";
		
		request.setAttribute("lista", this.obterLista());
		
		request.getRequestDispatcher(tela).forward(request, response);
	}

	private List<?> obterLista(){
		switch (tela) {
		case "coordenadorLista.jsp":
			return CoordenadorDao.obterLista();
			
		case "diretorLista.jsp":
			return DiretorDao.obterLista();
			
		case "estudanteLista.jsp":
			return EstudanteDao.obterLista();
			
		case "professorLista.jsp":
			return ProfessorDao.obterLista();
		}
		
		return null; 
	}
}
