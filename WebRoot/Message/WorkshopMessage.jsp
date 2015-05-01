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
   		ArrayList<Workshop> users1 = (ArrayList<Workshop>)request.getAttribute("users1");
   		ArrayList<Machine> users2 = (ArrayList<Machine>)request.getAttribute("users2");
   	 	ArrayList<Worker> users3 = (ArrayList<Worker>)request.getAttribute("users3");
   	%>
    <%
    	for(Workshop u1:users1){
     		out.println("<br><workshop></br>");
     		out.println("<br><workshop_ID>"+ u1.getID()+"</workshop_ID></br>");
 			out.println("<br><workshop_type>"+ u1.getType()+"</workshop_type></br>");
 			out.println("<br><workshop_bTime>"+ u1.getbTime()+"</workshop_bTime></br>");
 			out.println("<br><workshop_manufacturer>"+ u1.getManufacturer()+"</workshop_manufacturer></br>");
 			out.println("<br><workshop_principal>"+ u1.getPrincipal()+"</workshop_principal></br>");
     		out.println("<br></workshop></br>");
     	}
    %>
  </body>
</html>
