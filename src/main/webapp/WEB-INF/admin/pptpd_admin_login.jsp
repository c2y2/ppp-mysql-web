<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>超级管理员登录</title>
</head>
<body>
	<div align="center">
		<form action="<%=basePath%>pptpd/admin/PptpdAdminAction_pptpdAdminLogin.action" method="post">
			<table>
				<tr>
					<th>管理员姓名</th>
					<td>
						<input name="pptpdAdmin.username" id="username"/>
					</td>
					<th>密码</th>
					<td>
						<input name="pptpdAdmin.password" id="password"/>
					</td>
				</tr>
			</table>
			<div>
				<span><input type="submit" value="登录" /></span>
				<span><input type="button" value="取消" onclick="window.close();" /></span>
			</div>
		</form>
	</div>
</body>
</html>