<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MyIFTTT</title>
</head>

<body>
	<!-- THIS THAT -->
	<h1>Hello!Welcome to MyIFTTT!</h1>
	<p>we are here waitting for you.</p>
	
	<hr>
	<%	if(session.getAttribute("user")==null){%>
			<a href="/Web_IFTTT/register.jsp"><input type="button" value="register"></input></a>
			<a href="/Web_IFTTT/login.jsp"><input type="button" value="login"></input></a>
	<% 	}else{	%>
		welcome:${user}
   		<input type="button" value="logout" onclick="doLogout()">
	<% 		}%>
	
	
</body>
</html>