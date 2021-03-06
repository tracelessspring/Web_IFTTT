package tracelessspring.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tracelessspring.model.Dao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	//private PreparedStatement st;
	//private Connection conn;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
	}*/
	
	/*protected boolean login_right(String userName,String userPwd){
		link2mysql();
		try {
			st=conn.prepareStatement("select * from users");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = null;
		try {
			rs = st.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean correct=false;
		try {
			while(rs.next()){
				if(userName.equals(rs.getString("userName"))&&userPwd.equals(rs.getString("userPwd"))){
					correct=true;
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
		response.setContentType("text/html");
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("loginType is:"+request.getParameter("loginType"));
		
		String userName=request.getParameter("userName");
		String userPwd=request.getParameter("userPwd");
		out.println(userName);
		out.println(userPwd);
		
		if("user".equals(request.getParameter("loginType"))){
			if(Dao.login_validate(userName,userPwd)){
				System.out.println("find the user");
				
				request.getSession().setAttribute("user", Dao.getUser(userName));
				//request.getSession().setAttribute("userName", userName);
				//request.getSession().setAttribute("userMail", userMail);
			
				String message=String.format("congulations!%s,you've been login successfully!!!<meta http-equiv='refresh' content='3;url=%s'",
						userName,request.getContextPath()+"/user_page.jsp"); 
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
				System.out.println("cannot find the user");
				String message=String.format("error in username or password,please check it!!!<meta http-equiv='refresh' content='3;url=%s'",
						request.getContextPath()+"/login.jsp"); 
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
		else if("admin".equals(request.getParameter("loginType"))){
			if(Dao.adminlogin_validate(userName,userPwd)){
				System.out.println("admin login successfully");
				
				request.getSession().setAttribute("userName", userName);
				
				String message=String.format("congulations!%s,you've been login successfully!!!<meta http-equiv='refresh' content='3;url=%s'",
						userName,request.getContextPath()+"/admin_page.jsp"); 
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
				System.out.println("cannot find the admin");
				String message=String.format("error in username or password,please check it!!!<meta http-equiv='refresh' content='3;url=%s'",
						request.getContextPath()+"/login.jsp"); 
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
		else{
			System.out.println("system error");
		}
		
		
		
		
		
		/*try {
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
		System.out.println("here is up");*/
		
		
	}
}

