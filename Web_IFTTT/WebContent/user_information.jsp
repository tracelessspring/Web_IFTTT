<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="tracelessspring.model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user's information</title>
</head>

<body>
	<h1>用户资料</h1>
	<form action="/Web_IFTTT/tracelessspring.controller/ModifyServlet" method="post" onsubmit="return checkRegistForm(form1)" name="form1">
            <table width="60%" border="1">
                <tr>
                    <td> 用户名</td >
                    <td>
                        <input type="text" name="userName" value=${user.userName } readonly  />
                    </td>
                   
                </tr>
                <tr>
                    <td> 密码</td >
                    <td>
                        <input type="password" name="userPwd" value=${user.userPwd} />
                    </td>
                </tr>
                <tr>
                    <td> 邮箱</td >
                    <td>
                        <input type="text" name="userMail" value=${user.userMail} />
                    </td>
                </tr>
                <tr>
                    <td> 账户余额</td >
                    <td>
                        <input type="text" name="money" value=${user.money} />
                    </td>
                </tr>
                <tr>
                    <td> 账户等级</td >
                    <td>
                        <input type="text" name="rank" value=${user.rank} readonly />
                    </td>
                </tr>
                <tr>
                   <td>
                         <input type="reset" value="放弃修改" />
                         <input type="submit" value="保存修改" />
                   </td>
                </tr>
            </table>
    </form >

<script language="JavaScript">

//检测注册表单
function checkRegistForm(form){
	//密码是否为空
	if (form.userPwd.value == ""){
		alert("请输入注册密码");
		form.userPwd.focus();
		return (false);
	}
	//判断密码合法性
	if(form.userPwd.value.length>20){
		alert("对不起，密码长度不能超过20个字符");
		return(false);
	}
	
	//电子邮箱是否正确
	if(form.userMail.value == "" ){
		alert("请输入电子邮箱地址");
		form.userMail.focus();
		return(false);
	}
	if(form.userMail.value.search(/^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/) == -1){
		alert("你输入的电子邮箱地址不正确");
		form.userMail.focus();
		return(false);
	}
	if(form.money.value==""){
		alert("请输入账户余额");
		form.money.focus();
		return false;
	}
}
</script>



</body>
</html>