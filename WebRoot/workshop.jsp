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

<title>车间</title>

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
                         <li><a href="workshop.jsp" class="nav_selected"> 车间</a></li>
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
                		<h1>我们的生产车间</h1>
                        <p>
                        <br>
“    公司生产的彩钢复合板设备是西南地区最先进的夹芯板设备，技术来源于德国，且拥有一批技术人员专门开发新技术，本公司拥有的光栅数控技术得到了国家信息产业部的技术支持，是中国的龙头企业.”<br><br> 

“    公司一直坚持以可靠的质量，快捷的服务和高效的生产率，以多元化发展的思路，坚持不懈的进行新产品开发和研究工作” 
                        </p>
                	</div>
                </div>
                
                <div class="news_left">
                <h1>车间动态</h1>
                	<div class="news_box">
                    	<div class="calendar">25</div>
                        <div class="news_content">
						<p><span>车间Android客户端</span><br>
用户可以通过android客户端在平板或者手机上方便、快捷地实时查看工厂的车间和机床的实时信息 </p>
                        <a href="#" class="read_more">read more</a>                        
                        </div>
                    </div>
                    
                	<div class="news_box">
                    	<div class="calendar">4</div>
                        <div class="news_content">
						<p><span>车间曲线统计图</span><br>
在android客户端上可以实时看到车间每天的温度、湿度变化曲线 </p>
                        <a href="#" class="read_more">read more</a>                        
                        </div>
                    </div>                    
                    
                    
                    
                
                </div>
            
            
            </div><!--end of left content-->


            <div class="right_content">
            
         
                <h1>欢迎来到我们的车间</h1>
                
                <div class="project_box">
                    <a href="#"><img src="images/p5.png" alt="" title="" class="left_img" border="0"></a>
                    <p>
                    <span>描述:</span><br>
                    - 高    效<br>
                    - 高    产<br>
                    - 高  性  能<br>
                    - 高  水  平
                    </p>
                </div>

                <div class="project_box">
                    <a href="#"><img src="images/p6.png" alt="" title="" class="left_img" border="0"></a>
                    <p>
                    <span>描述:</span><br>
                    万明机械生产的彩钢瓦设备出口南非，因为服务质量优良，技术先进，受到了外国客户的极大赞誉。<br>

                    </p>
                </div>
                
                
              <h1 style="padding-top: 25px;">车间功能</h1>          
                    
                  <div class="services">
                    <ul>                                        
                        <li><a href="FindWorkshopServlet">查看所有车间</a></li>
                        <li><a href="Workshop/addWorkshop.jsp">增加车间</a></li>
                    </ul>
                </div>
                   
            
            </div><!--end of right content-->


	<div id="footer">
    
    </div>


		</div> <!--end of center box-->
	</div> <!--end of main content-->
</div> <!--end of main container-->
</body></html>