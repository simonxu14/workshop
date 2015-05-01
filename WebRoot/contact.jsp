<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">    
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<title>联系我们</title>

<link rel="stylesheet" type="text/css" href="style.css">
<!--[if IE 6]>
<link rel="stylesheet" type="text/css" href="iecss.css" />
<![endif]-->
</head>


<body>

<div id="main_container">
	<div class="parrot"><img src="images/arrow.jpg" alt="" title=""></div>
	<div class="main_content">
    	<div id="header">
        	<div class="logo"><a href="#"><img src="images/logo.png" alt="" title="" border="0"></a></div>
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
                         <li><a href="contact.jsp" class="nav_selected"> 联系我们 </a></li>

                    </ul>
            </div> 
            
            <div class="middle_box">
            	<div class="middle_box_text_content">
                	<div class="middle_box_title"></div>
                    <p class="middle_text">
                    “        本系统是基于光栅尺的工厂车间中用来监控生产过程的监控系统，包括光栅数据的采集、数据汇聚统计、服务器存储、客户端查询数据及历史数据转存等系统基本构成部分。本方案采取C/S与B/S相结合的架构，利用C/S架构的灵活性来处理整个方案实施过程中的具体事务处理，B/S的方便与稳定性来进行数据传输与存储。”
                    </p>
                </div>
            
            
            </div>
            
            <div class="left_content">
            	<div class="calendar_box">
                	<div class="calendar_box_content">
                		<h1>联系我们</h1>
                        <img src="images/togather.jpg" alt="" title="">
                        <p class="contact_info">
<span class="orange">负责人:</span> Simon Xu<br>

<span class="orange">地址:</span> 四川省成都市四川大学<br>

<span class="orange">Email:</span> 784121690@qq.com</a><br>
                        </p>
                	</div>
                </div>

                
               
                  <div id="contact_form">
                  
                   <h1>Contact Us</h1>
                   
                    <div class="form_row">
                    <label>Name:</label><input name="name" class="contact_input" type="text">
                    </div>
                    
                    <div class="form_row">
                    <label>Email:</label><input name="email" class="contact_input" type="text">
                    </div>                    
                    
                     <div class="form_row">
                    <label>Phone:</label><input name="phone" class="contact_input" type="text">
                    </div>                   
                    
                    <div class="form_row">
                    <label>Message:</label><textarea name="name" class="contact_textarea"></textarea>
                    </div> 
                    
                    
					<a href="#" class="read_more">send</a>              
            
                </div>               

            
            </div><!--end of left content-->


            <div class="right_content">
            
         
                <h1>Our Clients</h1>
                
                <div class="project_box">
                    <a href="#"><img src="images/clients_icon.gif" alt="" title="" class="left_img" border="0"></a>
                    <p>陈正海
                    </p>
                </div>

                <div class="project_box">
                    <a href="#"><img src="images/clients_icon.gif" alt="" title="" class="left_img" border="0"></a>
                    <p>黄顺婷
                    </p>
                </div>
                
                <div class="project_box">
                    <a href="#"><img src="images/clients_icon.gif" alt="" title="" class="left_img" border="0"></a>
                    <p>赵辉
                    </p>
                </div>

                <div class="project_box">
                    <a href="#"><img src="images/clients_icon.gif" alt="" title="" class="left_img" border="0"></a>
                    <p>杨频
                    </p>
                </div>                
            
                 <div class="project_box">
                    <a href="#"><img src="images/clients_icon.gif" alt="" title="" class="left_img" border="0"></a>
                    <p>张天庆
                    </p>
                </div>

                <div class="project_box">
                    <a href="#"><img src="images/clients_icon.gif" alt="" title="" class="left_img" border="0"></a>
                    <p>杨红
                    </p>
                </div>                  
            
            </div><!--end of right content-->

	<div id="footer">
    
    </div>


		</div> <!--end of center box-->
	</div> <!--end of main content-->
</div> <!--end of main container-->
</body></html>