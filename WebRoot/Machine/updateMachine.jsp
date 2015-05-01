
<%@ page language="java" import="java.util.*,com.machine.dao.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html lang="en">
	<head>
		<meta charset="utf-8">
		<title>修改机床</title>
		<link rel="stylesheet" href="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/css/bootstrap.min.css">

		<!-- 可选的Bootstrap主题文件（一般不用引入） -->
		<link rel="stylesheet" href="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/css/bootstrap-theme.min.css">

		<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
		<script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>

		<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
		<script src="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/js/bootstrap.min.js"></script>
		<link rel="icon" href="<%=basePath%>images/favicon.ico">
		<link rel="shortcut icon" href="<%=basePath%>images/favicon.ico">
		<link rel="stylesheet" href="<%=basePath%>css/list.css">
		<link rel="stylesheet" href="<%=basePath%>css/style.css">
		<script src="<%=basePath%>js/jquery.js"></script>
		<script src="<%=basePath%>js/jquery-migrate-1.1.1.js"></script>
		<script src="<%=basePath%>js/jquery.equalheights.js"></script>
		<script src="<%=basePath%>js/main.js"></script>
		<script src="<%=basePath%>js/jquery.ui.totop.js"></script>
		<script src="<%=basePath%>js/jquery.easing.1.3.js"></script>
		<script src="<%=basePath%>js/m.js"></script>
		
		
		
		
		<script>
		$(document).ready(function(){
			$().UItoTop({ easingType: 'easeOutQuart' });
		})
		</script>
		<!--[if lt IE 8]>
		<div style=' clear: both; text-align:center; position: relative;'>
			<a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
				<img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
			</a>
		</div>
		<![endif]-->
		<!--[if lt IE 9]>
		<script src="js/html5shiv.js"></script>
		<link rel="stylesheet" media="screen" href="css/ie.css">
		<![endif]-->
		<!--[if lt IE 10]>
		<link rel="stylesheet" media="screen" href="css/ie1.css">
		<![endif]-->
	</head>
	<body class="">
<!--==============================header=================================-->
		<header>
			<div class="container_12">
				<div class="grid_12">
					<h2><a href="index.html"><img src="<%=basePath%>images/logo.gif"></a></h2>
					<div class="menu_block">
						<nav id="bt-menu" class="bt-menu">
							<a href="#" class="bt-menu-trigger"><span>Menu</span></a>
							<ul>
								<li class="bt-icon"><a href="index.html">首页</a></li>
								<li class="bt-icon"><a href="manufacturer.html">工厂</a></li>
								<li class="bt-icon"><a href="FindWorkerServlet">员工</a></li>
								<li class="bt-icon"><a href="workshop.html">车间</a></li>
								<li class="current bt-icon"><a href="machine.html">机床</a></li>
								<li class="bt-icon"><a href="contact.html">联系我们</a></li>
							</ul>
						</nav>
						<div class="clear"></div>
					</div>
					<div class="clear"></div>
				</div>
			</div>
		</header>
<!--==============================Content=================================-->

<%
  		Machine u =(Machine)request.getAttribute("user");
  	%>


		<div class="content cont1">
			<div class="container_12">
				<div class="grid_12">
					<h2 class="mb0">修改机床</h2>
				</div>
			</div>
		</div>
		<div class="gray_block gb1">
			<div class="container_12">
								<!-- Content -->
								    <form action="<%=basePath%>addMachineServlet" method="post">
								    <table width="694" border="0" align="center" cellpadding="0" cellspacing="0">
								    <tr>
								    </tr>
								    </table>
								    <table width="694" border="0" align="center" cellpadding="0" cellspacing="0">
								      <tr>
								        <td width="547" valign="top"><table width="100%"  border="0" cellspacing="0" cellpadding="0">
										</br></br>
								            <tr>
								              <!-- <td width="17%" height="29" align="center">机床编号：</td>
								              <td colspan="2"><input type="text" name="ID" maxlength="20"></td> -->
								              <div class="input-group" style="width:350">
								    				<span class="input-group-addon">机床编号：&nbsp</span>
								    				<input type="text" class="form-control" name="ID" value="<%=u.getID()%>" maxlength="15" >
								  			</div>
								            </tr>
								            <tr>
								              <!-- <td height="28" align="center">类&nbsp&nbsp&nbsp&nbsp型：</td>
								              <td height="28" colspan="2"><input type="text" name="type" size="20" maxlength="20"></td> -->
								              <div class="input-group" style="width:350">
								    				<span class="input-group-addon">类&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp型：&nbsp</span>
								    				<input type="text" class="form-control" name="type" value="<%=u.getType()%>" size="20" maxlength="20">
								  			</div>
								            </tr>
								            <tr>
								              <!-- <td width="17%" height="29" align="center">型&nbsp&nbsp&nbsp&nbsp号：</td>
								              <td colspan="2"><input type="text" name="mNumber" maxlength="20"></td> -->
								              <div class="input-group" style="width:350">
								    				<span class="input-group-addon">型&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp号：&nbsp</span>
								    				<input type="text" class="form-control" name="mNumber" value="<%=u.getmNumber()%>" size="20" maxlength="20">
								  			</div>
								            </tr>
								            <tr>
								              <!-- <td width="17%" height="29" align="center">序&nbsp列&nbsp号：</td>
								              <td colspan="2"><input type="text" name="sNumber" maxlength="20"></td> -->
								              <div class="input-group" style="width:350">
								    				<span class="input-group-addon">机床序列：&nbsp</span>
								    				<input type="text" class="form-control" name="sNumber" value="<%=u.getsNumber()%>" size="20" maxlength="20">
								  			</div>
								            </tr>
								            <tr>
								              <!-- <td width="17%" height="29" align="center">所属车间：</td>
								              <td colspan="2"><input type="text" name="workshop" maxlength="20"></td> -->
								              <div class="input-group" style="width:350">
								    				<span class="input-group-addon">所属车间：&nbsp</span>
								    				<input type="text" class="form-control" name="workshop" value="<%=u.getWorkshop()%>" size="20" maxlength="20">
								  			</div>
								            </tr>
								            <tr>
								              <!-- <td width="17%" height="29" align="center">生产厂商：</td>
								              <td colspan="2"><input type="text" name="manufacturer" maxlength="20"></td> -->
								  			<div class="input-group" style="width:350">
								    				<span class="input-group-addon">生产厂商：&nbsp</span>
								    				<input type="text" class="form-control" name="manufacturer" value="<%=u.getManufacturer()%>" size="20" maxlength="20">
								  			</div>
								            </tr>
								            <tr>
								              <!-- <td width="17%" height="29" align="center">入场日期：</td>
								              <td colspan="2"><input type="text" name="pDate" maxlength="20"></td> -->
								              <div class="input-group" style="width:350">
								    				<span class="input-group-addon">入场日期：&nbsp</span>
								    				<input type="text" class="form-control" name="pDate" value="<%=u.getpDate()%>" size="20" maxlength="20">
								  			</div>
								            </tr>
								            <tr>
								              <!-- <td width="17%" height="29" align="center">操作人员：</td>
								              <td colspan="2"><input type="text" name="workerID" maxlength="20"></td> -->
								              <div class="input-group" style="width:350">
								    				<span class="input-group-addon">操作人员：&nbsp</span>
								    				<input type="text" class="form-control" name="workerID" value="<%=u.getWorkerID()%>" size="20" maxlength="20">
								  			</div>
								            </tr>

								            <tr>
								              <td height="34">&nbsp;</td>
								              <td width="30%" class="word_grey"><input class="btn btn-primary btn-sm" role="button" type="submit" value="确定保存"/>
								              <input name="Reset" type="reset" class="btn_grey btn btn-primary btn-sm" id="Reset" value="重新填写"></td>
								            </tr>
								        </table></td>
								      </tr>
								    </table>
			</div>
		</div>
<!--==============================footer=================================-->
		<footer>
			<div class="container_12">
				<div class="grid_12">
					<div class="socials">
						<a href="#" class="fa fa-facebook"></a>
						<a href="#" class="fa fa-twitter"></a>
						<a href="#" class="fa fa-google-plus"></a>
					</div>
					<div class="clear"></div>
					<div class="copy">
						 &copy; 2014 | <a href="#">版权</a> <br> 成都万明机械设备制造有限公司 <a href="http://www.wmcgw.com/" rel="nofollow">http://www.wmcgw.com/</a>
					</div>
				</div>
			</div>
		</footer>
		<script>
		$(document).ready(function(){
			$(".bt-menu-trigger").toggle(
				function(){
					$('.bt-menu').addClass('bt-menu-open');
				},
				function(){
					$('.bt-menu').removeClass('bt-menu-open');
				}
			);
			$('.responsive').on('click', '.close', function(){
				$('.close').remove();
				bgColor = $('.active .card-front').css('background-color');
				$('.responsive').removeClass(effect);
				$('.all-content').hide();
				$('.content li').removeClass('active').show().css({ 
					'border-bottom':'1px solid #2c2c2c',
					'border-left':'1px solid #2c2c2c' 
				});
				$('.card-front, .card-back').show();
				$('.content').css('background-color',bgColor);
			});
		});
		</script>
	</body>
</html>
