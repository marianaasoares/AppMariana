package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AppController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AppController() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tela = request.getParameter("tela").toLowerCase()+"Detalhe.html";
		
		request.getRequestDispatcher(tela).forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tela = request.getParameter("tela").toLowerCase()+"Lista.jsp";
		
		request.getRequestDispatcher(tela).forward(request, response);
	}

}
