<%@ page language="java" import="java.util.*,com.message.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'WorkerMessage.jsp' starting page</title>
    
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
   		
   	 	ArrayList<Worker> users = (ArrayList<Worker>)request.getAttribute("users");
   	%>
    <%
    	for(Worker u:users){
     									out.println("<br><worker></br>");
     			 						out.println("<br><ID>"+ u.getID()+"</ID></br>");
     			 						out.println("<br><name>"+ u.getName()+"</name><br>");
     			 						out.println("<br><authority>"+ u.getAuthority()+"</authority><br>");
     			 						out.println("<br><IDCard>"+ u.getIDCard()+"</IDCard><br>");
     			 						out.println("<br><profession>"+ u.getProfession()+"</profession><br>");
     			 						out.println("<br><pNumber>"+ u.getpNumber()+"</pNumber><br>");
     			 						out.println("<br><sex>"+ u.getSex()+"</sex><br>");
     			 						out.println("<br><age>"+ u.getAge()+"</age><br>");
     			 						out.println("<br><address>"+ u.getAddress()+"</address><br>");
     			 						out.println("<br><email>"+ u.getEmail()+"</email><br>");
     			 						out.println("<br></worker></br>");
     			 				}
    %>
  </body>
</html>
