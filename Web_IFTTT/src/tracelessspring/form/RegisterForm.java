package tracelessspring.form;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterForm {
	private String userName;
	private String userPwd;
	private String comfirmPwd;
	private String userMail;
	
	
	/*public boolean form_validate(){
		boolean correct=true;
		if(this.userName==null||this.userName.length()>30){
			;
		}
	}*/
	
	
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getUserPwd(){
		return userPwd;
	}
	public void setUserPwd(String userPwd){
		this.userPwd=userPwd;
	}
	public String getUserMail(){
		return userMail;
	}
	public void setUserMail(String userMail){
		this.userMail=userMail;
	}
	public void setComfirmPwd(String comfirmPwd){
		this.comfirmPwd=comfirmPwd;
	}
}
