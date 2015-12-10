package tracelessspring.controller;


import tracelessspring.model.*;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//private PreparedStatement st;
	//private Connection conn;
    /**
     * @throws SQLException 
     * @throws ClassNotFoundException 
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() throws ClassNotFoundException, SQLException {
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
	
	/*private void link2mysql(){
		String url="jdbc:mysql://localhost:3306/first";
		String username="root";
		String password="5801lc";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("cannot load the mysql driver");
			e.printStackTrace();
		}
		try {
			conn=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("cannot connected to mysql");
			e.printStackTrace();
		}
	}
	private void insert2mysql(String userName,String userPwd,String userMail){
		link2mysql();
		try {
			st=conn.prepareStatement("insert into users values(?,?,?,?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			st.setString(1, userName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			st.setString(2, userPwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			st.setString(3, userMail);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			st.setString(4, "1000");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			st.setString(5, "1");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error in executeUpdate");
			e.printStackTrace();
		}
		try {
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("insert a user to mysql");
	}
	protected boolean form_validate(String userName){
		link2mysql();

		try {
			st=conn.prepareStatement("select * from users");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean correct=true;
		ResultSet rs = null;
		try {
			rs = st.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(rs.next()){
				if(userName.equals(rs.getString("name"))){
					correct=false;
					break;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return correct;
	}*/

	
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html;charset=UTF-8");
		String userName=request.getParameter("userName");
		String userPwd=request.getParameter("userPwd");
		String userMail=request.getParameter("userMail");
		
		User user=new User(userName,userPwd,userMail);
		
		/*response.setContentType("text/html");
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*System.out.print(form.getUserName());
		System.out.print(form.getUserPwd());
		System.out.print(form.getUserMail());*/
		/*String userName=request.getParameter("userName");
		String userPwd=request.getParameter("userPwd");
		String confirmPwd=request.getParameter("confirmPwd");
		String userMail=request.getParameter("userMail");
		out.println(userName);
		out.println(userPwd);
		out.println(confirmPwd);
		
		RegisterForm form=new RegisterForm();
		form.setUserName(userName); 
		form.setUserPwd(userPwd); 
		form.setUserMail(userMail); 
		out.println(form.getUserName());
		out.println(form.getUserPwd());
		out.println(form.getUserMail());*/
		
		
		
		if(!Dao.userName_validate(userName)){
			//System.out.println("you username have been used by another one,please use a new username");
			String message=String.format("your username have been seleted by other people,please choose a new username!"
					+ "<meta http-equiv='refresh' content='3;url=%s'",request.getContextPath()+"/register.jsp" );
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
		else{
			//insert2mysql(userName,userPwd,userMail);
			Dao.addUser(user);
			String message=String.format("register successfully!!!<meta http-equiv='refresh' content='3;url=%s'",request.getContextPath()+"/login.jsp");
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
}
