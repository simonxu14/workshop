<%@ page language="java" import="java.util.*,com.profession.dao.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <head>
    <base href="<%=basePath%>">
    <title>查看职位信息</title>
	
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
                    <font size="4px">查看职位信息</font>
                    </p>
                </div>
            
            
            </div>
    <table width="694" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
  </tr>
  </table>
  <table width="694" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
      <td width="500" valign="top"><table width="500"  border="0" cellspacing="0" cellpadding="0">
 		<%
 			String msg = (String)request.getAttribute("msg");
 		 			//1.从request对象中取出数据
 		 			ArrayList<Profession> users = (ArrayList<Profession>)request.getAttribute("users");
 		 			//2.循环遍历list,并将数据显示
 		%>
		<font color="red">
			<%
				if(msg != null)
						out.println(msg);
			%>
		</font>
		
 		<table align="center" border="1">
 			<tr>
 				<th>工种编号</th><th>工种名称</th>
 			</tr>
 			<%
 				for(Profession u:users){
 			 					out.println("<tr>");
 			 						out.println("<td>"+ u.getID()+"</td>");
 			 						out.println("<td>"+ u.getName()+"</td>");

 			 						out.println("<td><a href=\"deleteProfessionServlet?ID="+u.getID()+"\">删除</a></td>");
 			 						out.println("<td><a href=\"queryProfessionByIdServlet?ID="+u.getID()+"\">更新</a></td>");
 			 					out.println("</tr>");
 			 				}
 			%>
 		</table>
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














