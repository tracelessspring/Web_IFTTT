package tracelessspring.model;

public class User {
	private String userName;
	private String userPwd;
	private String userMail;
	private String money;
	private String rank;
	
	public User(){}
	
	public User(String userName,String userPwd,String userMail){
		this.userName=userName;
		this.userPwd=userPwd;
		this.userMail=userMail;
		this.money="1000";
		this.rank="1";
	}
	
	public String getUserName(){
		return this.userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getUserPwd(){
		return this.userPwd;
	}
	public void setUserPwd(String userPwd){
		this.userPwd=userPwd;
	}
	public String getUserMail(){
		return this.userMail;
	}
	public void setUserMail(String userMail){
		this.userMail=userMail;
	}
	public String getMoney(){
		return this.money;
	}
	public void setMoney(String money){
		this.money=money;
	}
	public String getRank(){
		return this.rank;
	}
	public void setRank(String rank){
		this.rank=rank;
	}
}
