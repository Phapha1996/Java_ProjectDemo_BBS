<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'category_add.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
  </head>
  
  <body style="text-align:center">
  <br><br><br>
  <form action="categoryManager/Category_add" method="post"> 
	<table align="center" border="1">
		<tr>
			<td><s:property value="getText('content.name')"/></td><td><input type="text" name="category.name"></td>
		</tr>
		<tr>
			<td><s:property value="getText('content.discription')"/></td><td><textarea rows="10" cols="50" name="category.discription"></textarea></td>
		</tr>
	</table>
	<input type="submit" value="确定">
	</form>
  </body>
</html>
