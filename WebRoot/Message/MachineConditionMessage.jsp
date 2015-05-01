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
   		
   	 	ArrayList<MachineCondition> users = (ArrayList<MachineCondition>)request.getAttribute("users");
   	%>
   	<%
 				for(MachineCondition u:users){
 			 		out.println("<br><MachineCondition></br>");
 					out.println("<br><MachineCondition_machineID>"+ u.getMachineID()+"</MachineCondition_machineID></br>");
 			 	    out.println("<br><MachineCondition_time>"+ u.getTime()+"</MachineCondition_time></br>");
 			 		out.println("<br><MachineCondition_moveTime>"+ u.getMoveTime()+"</MachineCondition_moveTime></br>");
 			 		out.println("<br><MachineCondition_restTime>"+ u.getRestTime()+"</MachineCondition_restTime></br>");
 			 		out.println("<br><MachineCondition_displacement>"+ u.getDisplacement()+"</MachineCondition_displacement></br>");
 			 		out.println("<br><MachineCondition_sTime>"+ u.getsTime()+"</MachineCondition_sTime></br>");
 			 		out.println("<br><MachineCondition_condition>"+ u.getCondition()+"</MachineCondition_condition></br>");
 			 		out.println("<br></MachineCondition></br>");
   				}
   		%>
  </body>
</html>
