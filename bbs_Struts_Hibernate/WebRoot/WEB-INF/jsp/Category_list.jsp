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
    
    <title>My JSP 'category_list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	

  </head>
  
  <body>
  		<br><br><br>
  		<table align="center" border="1">
  			<tr>
				<th><s:property value="getText('content.name')"/></th><th><s:property value="getText('content.discription')"/></th><th><s:property value="getText('content.operation')"/></th>
  			</tr>
			<s:iterator value="#request.categorys" var="c">
			<tr>
				<th><s:property value="#c.name"/></th><th><s:property value="#c.discription"/></th><th><a href="categoryManager/Category_delete?category.id=<s:property value="#c.id"/>"><s:property value="getText('content.delete')"/></a><a href="categoryManager/Category_updateui?category.id=<s:property value="#c.id"/>"><s:property value="getText('content.alter')"/></a></th>			
			<tr>
			</s:iterator>
  		</table>
	<s:debug></s:debug>  
  </body>
</html>
