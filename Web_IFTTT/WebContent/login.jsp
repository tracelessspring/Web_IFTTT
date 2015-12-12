<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
</head>
<body>
	login page!
	<hr>
	<form action="/Web_IFTTT/tracelessspring.controller/LoginServlet" method="post">
            <table width="60%" border="1">
                <tr>
                    <td>userName</td>
                    <td>
                        <input type="text" name="userName">
                    </td>
                </tr>
                <tr>
                    <td>userPwd</td>
                    <td>
                        <input type="password" name="userPwd">
                    </td>
                </tr>
                
                <tr>
                	<td>登陆类型</td>
                	<td>
                		<select name="loginType">
                			<option value="user">用户</option>
                			<option value="admin">管理员</option>
                		</select>
                	</td> 
                </tr>
                
                <tr>
                    <td>
                        <input type="reset" value="reset">
                    </td>
                    <td>
                        <input type="submit" value="login">
                    </td>
                </tr>
            </table>
        </form>
	
</body>
</html>