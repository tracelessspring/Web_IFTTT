<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user page</title>
</head>
<body>
	<h1>Welcome!${user.userName }</h1>
	<select name="url" onChange="if(value!=''){window.location=this.options[this.selectedIndex].value;} else{return false;}">
		<option value="" selected>${user.userName}</option>
		<option value="/Web_IFTTT/private_message">私信</option>
		<option value="/Web_IFTTT/user_information.jsp">账户信息</option>
		<option value="/Web_IFTTT/user_log.jsp">消费记录</option>
		<option value="/Web_IFTTT/tracelessspring.controller/LogoutServlet">退出</option>
	</select>
</body>
</html>