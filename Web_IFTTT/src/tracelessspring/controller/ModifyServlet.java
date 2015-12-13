package tracelessspring.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tracelessspring.model.Dao;
import tracelessspring.model.User;

/**
 * Servlet implementation class ModifyServlet
 */
@WebServlet("/ModifyServlet")
public class ModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doAction(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html;charset=UTF-8");
		
		String userName=request.getParameter("userName");
		String userPwd=request.getParameter("userPwd");
		String userMail=request.getParameter("userMail");
		String money=request.getParameter("money");
		String rank=request.getParameter("rank");
		
		System.out.println(userName);
		System.out.println(userPwd);
		System.out.println(userMail);
		System.out.println(money);
		System.out.println(rank);
		
		User user=new User();
		user.setUserName(userName);
		user.setUserPwd(userPwd);
		user.setUserMail(userMail);
		user.setMoney(money);
		user.setRank(rank);
		
		System.out.println(user.getUserName());
		System.out.println(user.getUserPwd());
		System.out.println(user.getUserMail());
		System.out.println(user.getMoney());
		System.out.println(user.getRank());
		
		Dao.modifyUser(user);
		
		
		
		String message=String.format("changed you information successfully!!!<meta http-equiv='refresh' content='1;url=%s'",request.getContextPath()+"/login.jsp");
		request.setAttribute("message", message);
		try {
			request.getRequestDispatcher("/WEB-INF/pages/message.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
