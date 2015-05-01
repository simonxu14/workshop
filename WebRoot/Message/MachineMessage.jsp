<%@ page language="java" import="java.util.*,com.message.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MachineMessage.jsp' starting page</title>
    
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
   		
   	 	ArrayList<Machine> users = (ArrayList<Machine>)request.getAttribute("users");
   	%>
   	<%
 				for(Machine u:users){
 			 		out.println("<br><machine></br>");
 					out.println("<br><machine_ID>"+ u.getID()+"</machine_ID></br>");
 			 	    out.println("<br><machine_type>"+ u.getType()+"</machine_type></br>");
 			 		out.println("<br><machine_mNumber>"+ u.getmNumber()+"</machine_mNumber></br>");
 			 		out.println("<br><machine_sNumber>"+ u.getsNumber()+"</machine_sNumber></br>");
 			 		out.println("<br><machine_workshop>"+ u.getWorkshop()+"</machine_workshop></br>");
 			 		out.println("<br><machine_manufacturer>"+ u.getManufacturer()+"</machine_manufacturer></br>");
 			 		out.println("<br><machine_pDate>"+ u.getpDate()+"</machine_pDate></br>");
 			 		out.println("<br><machine_workerID>"+ u.getWorkerID()+"</machine_workerID></br>");
 			 		out.println("<br></machine></br>");
   				}
   		%>
  </body>
</html>
