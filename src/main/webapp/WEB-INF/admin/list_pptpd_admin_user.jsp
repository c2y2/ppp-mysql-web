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
<title>查询管理员</title>
  <link href="<%=basePath %>css/main.css" type="text/css" rel="stylesheet">
</head>
<body>
	<form action="<%=basePath%>pptpd/admin/PptpdAdminAction_queryPptpdAdmin.action">
		<div align="left">
			<table >
				<tr>
					<td align="right">管理员姓名</td>
					<td><input name="pptpdAdmin.username" id="username" value="${pptpdAdmin.username }"/></td>
					<td align="right">用户类型</td>
					<td>
						<select style="width:176px" name="pptpdAdmin.usertype" id="usertype">
						 	<option value="">选择管理员类型</option> 
						 	<option value="1">超级管理员</option> 
							<option value="2">普通管理员</option>
						</select>
					</td>
					<td align="right">启用状态</td>
					<td>
						<select style="width:176px" name="pptpdAdmin.status" id="status">
							<option value="">启用状态</option>
							<option value="0">启用</option>
							<option value="1">禁用</option>
						</select>
					</td>
				</tr>
			</table>
		</div>
		<div align="center">
			<span>
				<input type="submit" class="btn" value="查询" />
			</span>		
		</div>
		<div align="left">
			<table width="60%" board="1px">
				<thead>
					<tr>
						<th>管理员姓名</th>
						<th>管理员类型</th>
						<th>管理员状态</th>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="%{pm.list}" status="status">
						<tr>
							<td>${username }</td>
							<td>
								<s:if test="usertype==1">超级管理员</s:if>
								<s:else>
									普通管理员
								</s:else>
							</td>
							<td>
								<s:if test="status==0">启用</s:if>
								<s:else>
									禁用
								</s:else>
							</td>
						</tr>
					</s:iterator>
					<s:if test="%{pm.list.size() == 0}">
							<tr>
								<td colspan="100"><font>没有管理员存在</font></td>
							</tr>
					</s:if>
				</tbody>
			</table>
		</div>
		<s:if test="%{pm.list.size() > 0}">
			<jsp:include page="/common/page.jsp"></jsp:include>
		</s:if>
	</form>
</body>
</html>