<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>用户注册</title>
</head>
<body style="text-align:center;">
	<h2>注册</h2>
	<hr>
	
	<form action="/Web_IFTTT/tracelessspring.servlet/RegisterServlet" method="post">
            <table width="60%" border="1">
                <tr>
                    <td>用户名</td>
                    <td>
                        
                        <input type="text" name="userName">
                    </td>
                </tr>
                <tr>
                    <td>密码</td>
                    <td>
                        <input type="password" name="userPwd">
                    </td>
                </tr>
                <tr>
                    <td>确认密码</td>
                    <td>
                        <input type="password" name="confirmPwd">
                    </td>
                </tr>
         		<tr>
                    <td>邮箱</td>
                    <td>
                        <input type="text" name="userMail">
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="reset" value="reset">
                    </td>
                    <td>
                        <input type="submit" value="register">
                    </td>
                </tr>
                
                
                
            </table>
        </form>
        
</body>
</html>