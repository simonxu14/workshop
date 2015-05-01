<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <table width="694" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td><img src="images/01.gif" width="694" height="168"></td>
  </tr>
  </table>
  <table width="694" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
      <td width="103" height="231" valign="top"><img src="images/02.gif" width="35"></td>
      <td width="547" valign="top"><table width="100%"  border="0" cellspacing="0" cellpadding="0">
    <div><a href="FindDynamicWorkshopServlet">查看所有车间动态信息</a></div>
    <div><a href="DynamicWorkshop/addDynamicWorkshop.jsp">增加车间动态信息</a></div>
    </table></td>
      <td width="44" valign="top"><img src="images/04.gif" width="44"></td>
    </tr>
  </table>
  </body>
</html>
