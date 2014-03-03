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
<title>添加管理员</title>
</head>
<body>
	<form action="<%=basePath%>pptpd/admin/PptpdAdminAction_insertPptpdAdmin.action" method="post">
		<table align="center">
			<tbody >
				<tr>
					<th align="right">管理员姓名</th>
					<td><input name="pptpdAdmin.username" id="username" value="${pptpdAdmin.username }"/></td>
				</tr>
				<tr>
					<th align="right">管理员密码</th>
					<td><input name="pptpdAdmin.password" id="password" value="${pptpdAdmin.password }"/></td>
				</tr>
				<tr>
					<th align="right">用户类型</th>
					<td>
						<select style="width:176px" name="pptpdAdmin.usertype" id="usertype">
							<!-- <option value="1">超级管理员</option> -->
							<option value="2" selected="selected">普通管理员</option>
						</select>
					</td>
				</tr>
				<tr>
					<th align="right">启用状态</th>
					<td>
						<select style="width:176px" name="pptpdAdmin.status" id="status">
							<option value="0">启用</option>
							<option value="1" selected="selected">禁用</option>
						</select>
					</td>
				</tr>
				<tr>
					<th align="right">备注</th>
					<td><input name="pptpdAdmin.memo" id="memo" value="${pptpdAdmin.memo }"/></td>
				</tr>
			</tbody>
		</table>
		<div align="center">
			<span>
				<input type="submit" value="添加"/>
			</span>
			<span>
				<input type="reset" value="重置"/>
			</span>
		</div>
	</form>
</body>
</html>