<%@ page language="java" import="java.util.*,com.message.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ManufacturerMessage.jsp' starting page</title>
    
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
    <%
   		
   	 	ArrayList<Manufacturer> users = (ArrayList<Manufacturer>)request.getAttribute("users");
   	%>
   	<%
 				for(Manufacturer u:users){
 			 					out.println("<br><manufacturer></br>");
 			 					out.println("<br><ID>"+ u.getID()+"</ID></br>");
 			 					out.println("<br><name>"+ u.getName()+"</name></br>");
 			 					out.println("<br><principal>"+ u.getPrincipal()+"</principal></br>");
 			 					out.println("<br><phone>"+ u.getPhone()+"</phone></br>");
 			 					out.println("<br><address>"+ u.getAddress()+"</address></br>");
 			 					out.println("<br></manufacturer></br>");
   				}
   		%>
  </body>
</html>
