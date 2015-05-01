<%@ page language="java" import="java.util.*,com.active_machine.dao.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <head>
    <base href="<%=basePath%>">
    <title>修改动态机床信息</title>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
    <link rel="stylesheet" type="text/css" href="./style.css">
    <!--[if IE 6]>
    <link rel="stylesheet" type="text/css" href="./iecss.css" />
    <![endif]-->

  </head>
  
  <body>
  <div id="main_container">
	<div class="parrot"><img src="./images/arrow.jpg" alt="" title=""></div>
	<div class="main_content">
    	<div id="header">
        	<div class="logo"><a href="#"><img src="./images/logo.png" alt="" title="" border="0"></a></div>
        </div>
        <div class="top_center_box"></div>
        <div class="center_box">

    
            <div id="menu_tab">                                     
                    <ul class="menu">                                                                               
                         <li><a href="index.jsp" class="nav"> 首页  </a></li>
                         <li class="divider"></li>
                         <li><a href="manufacturer.jsp" class="nav"> 工厂</a></li>
                         <li class="divider"></li>
                         <li><a href="workshop.jsp" class="nav"> 车间</a></li>
                         <li class="divider"></li>
                         <li><a href="machine.jsp" class="nav"> 机床 </a></li>
                         <li class="divider"></li>
                         <li><a href="worker.jsp" class="nav"> 员工 </a></li>
                         <li class="divider"></li>
                         <li><a href="contact.jsp" class="nav"> 联系我们 </a></li>

                    </ul>
            </div> 

            
            <div class="middle_box">
            	<div class="middle_box_text_content">
                	<div class="middle_box_title"></div>
                    <p class="middle_text">
                    <font size="4px">修改动态机床信息</font>
                    </p>
                </div>
            
            
            </div>
  	<%
  		ActiveMachine u =(ActiveMachine)request.getAttribute("user");
  	%>
   <form action="updateActiveMachineServlet" method="post">
   <table width="694" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
  </tr>
  </table>
  <table width="694" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
      <td width="547" valign="top"><table width="100%"  border="0" cellspacing="0" cellpadding="0">
   	      <tr>
            <td width="17%" height="29" align="center">信息编号：</td>
            <td colspan="2"><input type="text" name="ID" value="<%=u.getID()%>" maxlength="20"></td>
          </tr>
          <tr>
            <td height="28" align="center">时&nbsp间&nbsp段：</td>
            <td height="28" colspan="2"><input type="text" name="time" value="<%=u.getTime()%>" size="20" maxlength="20"></td>
          </tr>
          <tr>
            <td width="17%" height="29" align="center">运动时间：</td>
            <td colspan="2"><input type="text" name="moveTime" value="<%=u.getMoveTime()%>" maxlength="20"></td>
          </tr>
          <tr>
            <td width="17%" height="29" align="center">静止时间：</td>
            <td colspan="2"><input type="text" name="restTime" value="<%=u.getRestTime()%>" maxlength="20"></td>
          </tr>
          <tr>
            <td width="17%" height="29" align="center">位&nbsp&nbsp&nbsp&nbsp移：</td>
            <td colspan="2"><input type="text" name="displacement" value="<%=u.getDisplacement()%>" maxlength="20"></td>
          </tr>
          <tr>
            <td width="17%" height="29" align="center">换位次数：</td>
            <td colspan="2"><input type="text" name="sTime" value="<%=u.getsTime()%>" maxlength="20"></td>
          </tr>
          <tr>
            <td width="17%" height="29" align="center">机床编号：</td>
            <td colspan="2"><input type="text" name="machineID" value="<%=u.getMachineID()%>" maxlength="20"></td>
          </tr>
       
   	      <tr>
   	      	<td><input type="submit" value="修改"/></td>
   	      </tr>
   </form>
       </table></td>
    </tr>
  </table>
   	<div id="footer">
    
    </div>
               </div>
            </div>
            </div>
  </body>
</html>
