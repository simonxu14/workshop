<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <head>
    <base href="<%=basePath%>">
    <title>机床状态信息</title>
	
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
                    <font size="4px">增加机床状态信息：  添加到系统中</font>
                    </p>
                </div>
            
            
            </div>
  <form action="addMachineConditionServlet" method="post">
  <table width="694" border="0" align="center" cellpadding="0" cellspacing="0">

  </table>
  <table width="694" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
      <td width="547" valign="top"><table width="100%"  border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="17%" height="29" align="center">机床编号：</td>
            <td colspan="2"><input type="text" name="machineID" maxlength="20"></td>
          </tr>
          <tr>
            <td height="28" align="center">时&nbsp间&nbsp段：</td>
            <td height="28" colspan="2"><input type="text" name="time" size="20" maxlength="20"></td>
          </tr>
          <tr>
            <td width="17%" height="29" align="center">运动时间：</td>
            <td colspan="2"><input type="text" name="moveTime" maxlength="20"></td>
          </tr>
          <tr>
            <td width="17%" height="29" align="center">静止时间：</td>
            <td colspan="2"><input type="text" name="restTime" maxlength="20"></td>
          </tr>
          <tr>
            <td width="17%" height="29" align="center">位&nbsp&nbsp&nbsp&nbsp移：</td>
            <td colspan="2"><input type="text" name="displacement" maxlength="20"></td>
          </tr>
          <tr>
            <td width="17%" height="29" align="center">换位次数：</td>
            <td colspan="2"><input type="text" name="sTime" maxlength="20"></td>
          </tr>
          <tr>
            <td width="17%" height="29" align="center">机床状态：</td>
            <td colspan="2"><input type="text" name="condition" maxlength="20"></td>
          </tr>

          <tr>
            <td height="34">&nbsp;</td>
            <td width="30%" class="word_grey"><input type="submit" value="确定保存"/>
            <input name="Reset" type="reset" class="btn_grey" id="Reset" value="重新填写"></td>
          </tr>
      </table></td>
    </tr>
  </table>

   </form>
   	<div id="footer">
    
    </div>
               </div>
            </div>
            </div>
  </body>
</html>

