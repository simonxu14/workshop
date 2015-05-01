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

<title>首页</title>

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
                         <li><a href="index.jsp" class="nav_selected"> 首页  </a></li>
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
                    “        本系统是基于光栅尺的工厂车间中用来监控生产过程的监控系统，包括光栅数据的采集、数据汇聚统计、服务器存储、客户端查询数据及历史数据转存等系统基本构成部分。本方案采取C/S与B/S相结合的架构，利用C/S架构的灵活性来处理整个方案实施过程中的具体事务处理，B/S的方便与稳定性来进行数据传输与存储。”
                    </p>
                </div>
            
            
            </div>
            
            <div class="left_content">
            	<div class="calendar_box">
                	<div class="calendar_box_content">
                		<h1>欢迎来到我们的生产车间</h1>
                        <p>
                        <br>
“    本方案实施分为表示层、业务层、数据层和数据采集层。其中数据采集层由数据采集器和汇点路由器构成，采集器获取机床的信息并传输给汇点路由器然后发送到数据库服务器端和WEB服务器端.”<br><br> 

“    根据当前用户的使用步骤如登录、使用、选择查询时间段、添加/删除数据、退出等进行相应的事件响应及界面显示.” 
                        </p>
                	</div>
                </div>
                
                <div class="news_left">
                <h1>最近新闻</h1>
                	<div class="news_box">
                    	<div class="calendar">23</div>
                        <div class="news_content">
						<p><span>android客户端</span><br>
用户可以通过android客户端在平板或者手机上方便、快捷地实时查看工厂的车间和机床的实时信息 </p>
                        <a href="#" class="read_more">read more</a>                        
                        </div>
                    </div>
                    
                	<div class="news_box">
                    	<div class="calendar">23</div>
                        <div class="news_content">
						<p><span>曲线统计图</span><br>
在android客户端上可以实时看到机床是否在工作、机床一天的生产曲线以及机床在月份、年度的生产量 </p>
                        <a href="#" class="read_more">read more</a>                        
                        </div>
                    </div>                    
                    
                    
                    
                
                </div>
            
            
            </div><!--end of left content-->


            <div class="right_content">
            
         
                <h1>我们的系统</h1>
                
                <div class="project_box">
                    <a href="#"><img src="images/p1.png" alt="" title="" class="left_img" border="0"></a>
                    <p>
                    <span>描述:</span><br>
                    - Java Web<br>
                    - Mysql<br>
                    - Duapp<br>
                    - Android
                    </p>
                </div>

                <div class="project_box">
                    <a href="#"><img src="images/p2.png" alt="" title="" class="left_img" border="0"></a>
                    <p>
                    <span>描述:</span><br>
                    - 方    便<br>
                    - 快    捷<br>
                    - 实    时<br>
                    - 高    效
                    </p>
                </div>
                
                
              <h1 style="padding-top: 25px;">我们提供的服务</h1>          
                    
                  <div class="services">
                    <ul>                                        
                        <li><a href="FindManufacturerServlet">查看所有厂家</a></li>
                        <li><a href="Manufacturer/addManufacturer.jsp">增加厂家</a></li>
                        <li><a href="FindWorkshopServlet">查看所有车间</a></li>
                        <li><a href="Workshop/addWorkshop.jsp">增加车间</a></li>
                        <li><a href="FindMachineServlet">查看所有机床</a></li>
                        <li><a href="Machine/addMachine.jsp">增加机床</a></li>
                        <li><a href="FindProfessionServlet">查看所有工种</a></li>
                        <li><a href="Profession/addProfession.jsp">增加工种</a></li>
                        <li><a href="FindWorkerServlet">查看所有员工</a></li>
                        <li><a href="Worker/addWorker.jsp">增加员工</a></li>
                    </ul>
                </div>
                
                 <div class="services">
                    <ul>                                        
                        <li><a href="FindDynamicWorkshopServlet">查看所有车间动态信息</a></li>
                        <li><a href="DynamicWorkshop/addDynamicWorkshop.jsp">增加车间动态信息</a></li>
                        <li><a href="FindActiveMachineServlet">查看所有机床动态信息</a></li>
                        <li><a href="ActiveMachine/addActiveMachine.jsp">增加机床动态信息</a></li>
                        <li><a href="FindMachineConditionServlet">查看所有机床状态信息</a></li>
                        <li><a href="MachineCondition/addMachineCondition.jsp">增加机床状态信息</a></li>
                    </ul>
                </div>  
                   
            
            </div><!--end of right content-->


	<div id="footer">
    
    </div>


		</div> <!--end of center box-->
	</div> <!--end of main content-->
</div> <!--end of main container-->
</body></html>