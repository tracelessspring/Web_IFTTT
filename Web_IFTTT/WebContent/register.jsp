<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>user register</title>
</head>
<body style="text-align:center;">
	<h2>please register!</h2>
	<hr>
	
	<form action="/Web_IFTTT/tracelessspring.servlet/RegisterServlet" method="post">
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
                    <td>confirmPwd</td>
                    <td>
                        <input type="password" name="confirmPwd">
                    </td>
                </tr>
                <tr>
                    <td>userMail</td>
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