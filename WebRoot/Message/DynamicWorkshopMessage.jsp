<%@ page language="java" import="java.util.*,com.message.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'DynamicWorkshopMessage.jsp' starting page</title>
    
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
   		
   	 	ArrayList<DynamicWorkshop> users = (ArrayList<DynamicWorkshop>)request.getAttribute("users");
   	%>
   	<%
 				for(DynamicWorkshop u:users){
 			 		out.println("<br><dynamicWorkshop></br>");
 					out.println("<br><dynamicWorkshop_ID>"+ u.getID()+"</dynamicWorkshop_ID></br>");
 			 	    out.println("<br><dynamicWorkshop_workshopID>"+ u.getWorkshopID()+"</dynamicWorkshop_workshopID></br>");
 			 		out.println("<br><dynamicWorkshop_temperature>"+ u.getTemperature()+"</dynamicWorkshop_temperature></br>");
 			 		out.println("<br><dynamicWorkshop_humidity>"+ u.getHumidity()+"</dynamicWorkshop_humidity></br>");
 			 		out.println("<br><dynamicWorkshop_noise>"+ u.getNoise()+"</dynamicWorkshop_noise></br>");
 			 		out.println("<br></dynamicWorkshop></br>");
   				}
   		%>
  </body>
</html>
