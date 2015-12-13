package tracelessspring.model;

public class Task {
	private int taskId;
	private String userName;
	private String createTime;
	private String taskName;
	private String thisType;
	private String thatType;
	private String sendTime;
	private String thisUserName;
	private String thisUserPwd;
	private String thisContent;
	private String timeLength;
	private String thatUserName;
	private String thatUserPwd;
	private String thatContent;
	private String costMoney;
	
	public Task(){
		userName="";
		createTime="";
		taskName="";
		thisType="";
		thatType="";
		sendTime="";
		thisUserName="";
		thisUserPwd="";
		thisContent="";
		timeLength="";
		thatUserName="";
		thatUserPwd="";
		thatContent="";
		costMoney="";
	}
	
	public Task(String userName,String createTime,String taskName,String thisType,String thatType,
			String sendTime,String thisUserName,String thisUserPwd,String thisConte,
			String timeLength,String thatUserName,String thatUserPwd,String thatContent,String costMoney){
		this.userName=userName;
		this.createTime=createTime;
		this.taskName=taskName;
		this.thisType=thisType;
		this.thatType=thatType;
		this.sendTime=sendTime;
		this.thisUserName=thisUserName;
		this.thisUserPwd=thisUserPwd;
		this.thisContent=thisContent;
		this.timeLength=timeLength;
		this.thatUserName=thatUserName;
		this.thatUserPwd=thatUserPwd;
		this.thatContent=thatContent;
		this.costMoney=costMoney;
	}
	
	public int getTaskId(){
		return this.taskId;
	}
	public void setTaskId(int taskId){
		this.taskId=taskId;
	}
	public String getUserName(){
		return this.userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getCreateTime(){
		return this.createTime;
	}
	public void setCreateTime(String createTime){
		this.createTime=createTime;
	}
	public String getTaskName(){
		return this.taskName;
	}
	public void setTaskName(String taskName){
		this.taskName=taskName;
	}
	public String getThisType(){
		return this.thisType;
	}
	public void setThisType(String thisType){
		this.thisType=thisType;
	}
	public String getThatType(){
		return this.thatType;
	}
	public void setThatType(String thatType){
		this.thatType=thatType;
	}
	public String getSendTime(){
		return this.sendTime;
	}
	public void setSendTime(String sendTime){
		this.sendTime=sendTime;
	}
	public String getThisUserName(){
		return this.thisUserName;
	}
	public void setThisUserName(String thisUserName){
		this.thisUserName=thisUserName;
	}
	public String getThisUserPwd(){
		return this.thisUserPwd;
	}
	public void setThisUserPwd(String thisUserPwd){
		this.thisUserPwd=thisUserPwd;
	}
	public String getThisContent(){
		return this.thisContent;
	}
	public void setThisContent(String thisContent){
		this.thisContent=thisContent;
	}
	public String getTimeLength(){
		return this.timeLength;
	}
	public void setTimeLength(String timeLength){
		this.timeLength=timeLength;
	}
	public String getThatUserName(){
		return this.thatUserName;
	}
	public void setThatUserName(String thatUserName){
		this.thatUserName=thatUserName;
	}
	public String getThatUserPwd(){
		return this.thatUserPwd;
	}
	public void setThatUserPwd(String thatUserPwd){
		this.thatUserPwd=thatUserPwd;
	}
	public String getThatContent(){
		return this.thatContent;
	}
	public void setThatContent(String thatContent){
		this.thatContent=thatContent;
	}
	public String getCostMoney(){
		return this.costMoney;
	}
	public void setCostMoney(String costMoney){
		this.costMoney=costMoney;
	}
	
}
