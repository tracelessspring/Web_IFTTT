package tracelessspring.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	private static Connection conn=null;
	
	private Dao(){
		String url="jdbc:mysql://localhost:3306/first";
		String username="root";
		String password="5801lc";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static int executeUpdate(String sql){
		if(conn==null)
			new Dao();
		PreparedStatement pstm = null;
		try {
			pstm = conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			return pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error in executeUpdate");
			return -2;
		}
	}
	
	private static ResultSet executeQuery(String sql){
		if(conn==null){
			new Dao();
		}
		PreparedStatement pstm = null;
		try {
			pstm = conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			return pstm.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	private static void closeLink(){
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{conn=null;}
	}
	
	public static void addUser(User user){             //添加用户
		String sql="insert into users(userName,userPwd,userMail,money,rank) values ('"+user.getUserName()+
				"','"+user.getUserPwd()+"','"+user.getUserMail()+"','"+user.getMoney()+"','"+user.getRank()+"')";
		executeUpdate(sql);
		closeLink();
	}
	
	public static void modifyUser(User user){        //修改用户信息，主键用户名不能被修改
		String sql="update users set userPwd='"+user.getUserPwd()+"', userMail='"+user.getUserMail()+"', money='"+user.getMoney()+"', rank='"+user.getRank()+"'";
		executeUpdate(sql);
		closeLink();
	}
	
	public static void deleteUser(User user){
		String sql="delete from users where username='"+user.getUserName()+"'";
		executeUpdate(sql);
		closeLink();
	}
	
	public static boolean userName_validate(String userName){
		String sql="select * from users";
		boolean correct=true;
		ResultSet rs=executeQuery(sql);
		try {
			while(rs.next()){
				try {
					if(userName.equals(rs.getString("userName"))){
						correct=false;
						break;
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeLink();
		return correct;
	}
	
	public static boolean login_validate(String userName,String userPwd){
		String sql="select * from users";
		boolean correct=false;
		ResultSet rs=executeQuery(sql);
		try {
			while(rs.next()){
				try {
					if(userName.equals(rs.getString("userName"))&&userPwd.equals(rs.getString("userPwd"))){
						correct=true;
						break;
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeLink();
		return correct;
	}
	
}
