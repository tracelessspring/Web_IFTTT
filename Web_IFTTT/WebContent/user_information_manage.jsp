<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="tracelessspring.model.*" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user's information</title>
</head>
<body>
	<h2>用户资料</h2>
	<div>
		<%
			System.out.println("fresh here");
			ArrayList<User> list=Dao.selectUser();
			for(int i=0;i<list.size();i++){
		%>
		用户名：<%=list.get(i).getUserName() %>   邮箱：<%=list.get(i).getUserMail() %>   会员等级：<%=list.get(i).getRank() %>  余额：<%=list.get(i).getMoney() %><br />
		<%} %>
	</div>
	<br />
	<div>
		这里需要添加用户的创建任务的记录！
	</div>
</body>
</html>