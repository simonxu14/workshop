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

<title>机床</title>

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
                         <li><a href="machine.jsp" class="nav_selected"> 机床 </a></li>
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
                    “        本系统是基于光栅尺的工厂车间中用来监控生产过程的监控系统，包括光栅数据的采集、数据汇聚统计、服务器存储、客户端查询数据及历史数据转存等系统基本构成部分。本方案采取C/S与B/S相结合的架构，利用C/S架构的灵活性来处理整个方案实施过程中的具体事务处理，B/S的方便与稳定性来进行数据传输与存储。”
                    </p>
                </div>
            
            
            </div>
            
            <div class="left_content">
            	<div class="calendar_box">
                	<div class="calendar_box_content">
                		<h1>我们的机床</h1>
                        <p>
                        <br>
                         - 普通840型彩瓦机<br>
                         - 普通900型彩瓦机<br>
                         - 普通850波型彩瓦机<br>
                         - 电缆桥架成型机<br>
                         - 电缆桥架成型机<br>
                         - 车轮毂成型机<br>
                         - 落水管成型机<br>
                         - 雨棚瓦成型机<br>
                         - 数控900型彩瓦机
                        </p>
                	</div>
                </div>
                
                <div class="news_left">
                <h1>最近新闻</h1>
                	<div class="news_box">
                    	<div class="calendar">21</div>
                        <div class="news_content">
						<p><span>彩钢瓦设备的需求量增大</span><br>
彩钢瓦是我国现阶段建筑行业比较重要的一部分，由于这几年我国地震地质灾害的频发，活动板房的需求量加大，彩钢瓦设备的需求量也进一步加大</p>
                        <a href="#" class="read_more">read more</a>                        
                        </div>
                    </div>
                    
                	<div class="news_box">
                    	<div class="calendar">23</div>
                        <div class="news_content">
						<p><span>彩钢复合板设备即将完工</span><br>
由万明机械和信息产业部联合开创，四川大学教授开发的彩钢瓦设备·彩钢复合板设备的光栅数显系统即将完工，第一期我们开发的数显系统已经开始运用 </p>
                        <a href="#" class="read_more">read more</a>                        
                        </div>
                    </div>                    
                    
                    
                    
                
                </div>
            
            
            </div><!--end of left content-->


            <div class="right_content">
            
         
                <h1>我们的系统</h1>
                
                <div class="project_box">
                    <a href="#"><img src="images/p7.png" alt="" title="" class="left_img" border="0"></a>
                    <p>
                    <span>普通850波型彩瓦机:</span><br>
                    -性能：850型弧形波瓦<br>
                    -九组辊压成型<br>
                    -有效宽度：85公分<br>
                    -适用：屋面板，围档板
                    </p>
                </div>

                <div class="project_box">
                    <a href="#"><img src="images/p8.png" alt="" title="" class="left_img" border="0"></a>
                    <p>
                    <span>4米彩钢板剪板机</span><br>
                    -13组辊压成型<br>
                    -功率23.5千瓦<br>
                    -压型速度8-10米/分<br>
                    -压制厚度≤3MM
                    </p>
                </div>
                
                
              <h1 style="padding-top: 25px;">机床功能</h1>          
                    
                  <div class="services">
                    <ul>                                        
                        <li><a href="FindMachineServlet">查看所有机床</a></li>
                        <li><a href="Machine/addMachine.jsp">增加机床</a></li>
                    </ul>
                </div>
                
                   
            
            </div><!--end of right content-->


	<div id="footer">
    
    </div>


		</div> <!--end of center box-->
	</div> <!--end of main content-->
</div> <!--end of main container-->
</body></html>