<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
</head>
<script language="JavaScript">

//检测注册表单
function checkRegistForm(form){
//用户名是否为空
	if(form.userName.value == ""){
		alert("请输入用户名");
		form.userName.focus();
			return(false);
	}
	//判断用户名长度和合法性

	if(form.userName.value.length>20){
		alert("对不起，用户名长度不能超过20个字符");
		return(false);
		}
	
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
	//重复密码的输入
	if (form.confirmPwd.value == ""){
		alert("请再次输入注册密码");
		form.confirmPwd.focus();
		return (false);
	}
	
	//两次密码是否一致
	if(form.userPwd.value != form.confirmPwd.value){
		alert("两次输入的密码不一致");
		form.confirmPwd.focus();
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
}
</script>

<body style="text-align:center;">
	<h2>注册</h2>
	<hr>
	
	<form method="post" action="/Web_IFTTT/tracelessspring.servlet/RegisterServlet" onsubmit="return checkRegistForm(form)" name="form">
		<table width="100%" border="0" align="center">
    <tr>
      <td width="19%" height="26"><div align="center">*用户名</div></td>
      <td width="26%"><input name="userName" type="text" size="20" maxlength="20" /></td>
      <td width="55%">只允许输入字母，长度在5-20之间</td>
    </tr>
	 <tr>
      <td><div align="center">*密码</div></td>
      <td height="5"><label>
        <input name="userPwd" type="password" size="20" maxlength="20" />
        </label>      </td>
      <td height="5">长度在5-20之间</td>
    </tr>
    <tr>
	<td><div align="center">*重复密码</div></td>
      <td height="7"><label>
        <input name="confirmPwd" type="password" size="20" maxlength="20" />
        </label>      </td>
      <td height="7">请与所填密码一致</td>
    </tr>
	<tr>
      <td><div align="center">*电子邮箱</div></td>
      <td height="14"><input name="userMail" type="text" size="20" maxlength="20" /></td>
      <td height="14">请输入正确的邮箱地址</td>
	</tr>
    
    <tr>
      <td height="22">&nbsp;</td>
      <td height="22" colspan="2"><input name="submit" type="submit"  value="提交" />
          <input name="Submit22" type="reset" value="重置">      </td>
    </tr>
  </table>
</form>            
                             

</body>
</html>