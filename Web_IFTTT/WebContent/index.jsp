<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MyIFTTT</title>
</head>

<body>
	<!-- THIS THAT -->
	<h1>Hello!Welcome to MyIFTTT!</h1>
	<p>we are here waitting for you.</p>
	
	<hr>
	
	<%	if(session.getAttribute("userName")==null){%>
			当前没有用户
			<a href="/Web_IFTTT/register.jsp"><input type="button" value="register"></input></a>
			<a href="/Web_IFTTT/login.jsp"><input type="button" value="login"></input></a>
	<% 	}else{	%>
		welcome:${userName}
		当前有用户
   		<a href="/Web_IFTTT/tracelessspring.controller/LogoutServlet"><input type="button" value="Logout"></input></a>
	<% 		}%>
	
	<h2>IF THIS THEN THAT</h2>
	
	<form action="/Web_IFTTT/tracelessspring.controller/LoginServlet" method="post">
            <table width="60%" border="1">
                <tr>
                    <td>userName</td>
                    <td>
                        <input type="text" name="userName">
                    </td>
                </tr>
            </table>
    </form>
	
</body>
</html>