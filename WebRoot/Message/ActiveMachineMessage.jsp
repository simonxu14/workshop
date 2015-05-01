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
   		
   	 	ArrayList<ActiveMachine> users = (ArrayList<ActiveMachine>)request.getAttribute("users");
   	%>
   	<%
 				for(ActiveMachine u:users){
 			 		out.println("<br><activeMachine></br>");
 					out.println("<br><activeMachine_ID>"+ u.getID()+"</activeMachine_ID></br>");
 			 	    out.println("<br><activeMachine_time>"+ u.getTime()+"</activeMachine_time></br>");
 			 		out.println("<br><activeMachine_moveTime>"+ u.getMoveTime()+"</activeMachine_moveTime></br>");
 			 		out.println("<br><activeMachine_restTime>"+ u.getRestTime()+"</activeMachine_restTime></br>");
 			 		out.println("<br><activeMachine_displacement>"+ u.getDisplacement()+"</activeMachine_displacement></br>");
 			 		out.println("<br><activeMachine_sTime>"+ u.getsTime()+"</activeMachine_sTime></br>");
 			 		out.println("<br><activeMachine_machine>"+ u.getMachineID()+"</activeMachine_machine></br>");
 			 		out.println("<br></activeMachine></br>");
   				}
   		%>
  </body>
</html>
