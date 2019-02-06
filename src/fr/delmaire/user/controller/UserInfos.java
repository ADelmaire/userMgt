package fr.delmaire.user.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;

import fr.delmaire.user.bean.user;
import fr.delmaire.user.business.impl.UsersBusiness;

/**
 * Servlet implementation class UserInfos
 */
@WebServlet(name = "user_infos", urlPatterns = { "/userinfos" })
public class UserInfos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 UsersBusiness usersbusiness = new UsersBusiness();
  
    public UserInfos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String iString = request.getParameter("i");
		int i = Integer.parseInt(iString);
		
		ArrayList<user>users = usersbusiness.getUser();
		
		user utilisateur = users.get(i);
		
		request.setAttribute("utilisateur", utilisateur);
		
		
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/user-infos.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
