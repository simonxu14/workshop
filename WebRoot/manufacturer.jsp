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

<title>工厂</title>

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
                         <li><a href="manufacturer.jsp" class="nav_selected"> 工厂</a></li>
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
                		<h1>成都万明机械设备制造有限公司</h1>
                        <p>
                        <br>
“    成都万明机械设备制造有限公司创建于1993年，是集自主开发、设计、制造为一体的专业生产各型冷弯成型设备的大型企业.”<br><br> 

“    公司一直坚持以可靠的质量，快捷的服务和高效的生产率，创造出国内最先进的彩钢瓦设备第一品牌的企业价值观，以多元化发展的思路，坚持不懈的进行新产品开发和研究工作.” 
                        </p>
                	</div>
                </div>
                
                <div class="news_left">
                <h1>工厂新闻</h1>
                	<div class="news_box">
                    	<div class="calendar">1</div>
                        <div class="news_content">
						<p><span>彩钢瓦设备行业特点</span><br>
 彩钢瓦设备冷弯成型技术近些年已经在国内被广泛应用，它是一种把卷材、工字钢等金属板类材料不断横向弯曲，以达到适合生产采用的形状的加工工艺，相比于之前的钢铁加工工艺，冷弯成型机更节能、更高效，能够做到缩短产品开发周期，减少工人施工劳动时间，提高了生产效率，达到了技术创造经济效益的目的。</p>
                        <a href="#" class="read_more">read more</a>                        
                        </div>
                    </div>
                    
                	<div class="news_box">
                    	<div class="calendar">14</div>
                        <div class="news_content">
						<p><span>彩钢瓦设备--琉璃瓦成型设备特点</span><br>
成都万明机械生产的琉璃瓦成型机特点------- 经该彩钢瓦设备机辊轧冲模成型的仿古琉璃瓦具有外形美观、古朴典雅、造型考究别致、品位高贵等特点，可广泛用于别墅、度假村、花园式工厂、旅游风景区、亭台楼榭等地方。</p>
                        <a href="#" class="read_more">read more</a>                        
                        </div>
                    </div>                    
                    
                    
                    
                
                </div>
            
            
            </div><!--end of left content-->


            <div class="right_content">
            
         
                <h1>工厂</h1>
                
                <div class="project_box">
                    <a href="#"><img src="images/p3.png" alt="" title="" class="left_img" border="0"></a>
                    <p>
                    <span>描述:</span><br>
                                                                    公司本着“质量第一，顾客至上”的经营宗旨，“开拓进取、求精务实”的精神，以及完善的售后服务，贏得广大客户的好评。<br>
                    </p>
                </div>

                <div class="project_box">
                    <a href="#"><img src="images/p4.png" alt="" title="" class="left_img" border="0"></a>
                    <p>
                    <span>描述:</span><br>
                                                                     成都万明机械再次获得2013成都市民营企业先进企业称号，这已经是自2009年以来第五次获得此次殊荣。<br>
                    </p>
                </div>
                
                
              <h1 style="padding-top: 25px;">工厂功能</h1>          
                    
                  <div class="services">
                    <ul>                                        
                        <li><a href="FindManufacturerServlet">查看所有厂家</a></li>
                        <li><a href="Manufacturer/addManufacturer.jsp">增加厂家</a></li>
                    </ul>
                </div>
                 
                   
            
            </div><!--end of right content-->


	<div id="footer">
    
    </div>


		</div> <!--end of center box-->
	</div> <!--end of main content-->
</div> <!--end of main container-->
</body></html>