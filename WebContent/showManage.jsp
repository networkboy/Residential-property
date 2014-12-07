<%@ page language="java" import="java.util.*" pageEncoding="GBK" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>小区物业</title>
<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700" rel="stylesheet" type="text/css" />
<link href="css/default.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
<div id="header-wrapper">
	<div id="header">
		<div id="logo">
			<h1><a href="#">小区物业</a></h1>
		</div>
		<div id="menu">
			<ul>
				<li class="current_page_item"><a href="index.jsp" accesskey="1" title="">首页</a></li>
				<li><a href="ShowManage"accesskey="2"  title="">管理人员</a></li>
				<li><a href="tologin" accesskey="3" title="">物业公司管理员</a></li>
				<li><a href="tologin" accesskey="4" title="">物业财务管理员</a></li>
				<li><a href="tologin" accesskey="5" title="">物业公司经理</a></li>
			</ul>
		</div>
	</div>
</div>
<div id="banner">
	<div class="img-border"> <a href="#"><img src="images/header-img.jpg" width="1120" height="300" alt="" /></a> </div>
</div>
<div id="wrapper">
	<div id="wide-content">
		<div>
		  <table width="1032" height="198" border="1">
              <tr>
                <td width="332"><span class="STYLE5">工作号</span></td>
                <td width="306"><span class="STYLE5">姓名</span></td>
                <td width="372"><span class="STYLE5">职位</span></td>
              </tr>
              <c:forEach var="manage" items="${manage}">
              <tr>
                <td height="55">${manage.id}</td>
                <td>${manage.name}</td>
                <td>${manage.position}</td>
              </tr>
              </c:forEach>
            </table>
			<p>&nbsp;</p>
			<p class="button-style"><a href="#">More Details</a></p>
	  </div>
	</div>
</div>
<div id="page-wrapper">
<div id="page" class="container">
	<div id="content">
		<div>
			<ul class="style1">
				<li class="first">
					<h3>小区财务</h3>
					<p>xxxxxxxxxx</p>
					<p><a href="#" class="button-style">Read More</a></p>
				</li>
				<li>
					<h3>小区信息</h3>
					<p>xxxxxxxxx</p>
					<p><a href="#" class="button-style">Read More</a></p>
				</li>
			</ul>
		</div>
	</div>
	<div id="sidebar">
		<h2>小区热点</h2>
		<ul class="style3">
			<li class="first">
				<p class="date">05-04-2013</p>
				<p><a href="#">xxxxxxx</a></p>
			</li>
			<li>
				<p class="date">04-23-2013</p>
				<p><a href="#">xxxxxxx</a></p>
			</li>
			<li>
				<p class="date">04-17-2013</p>
				<p><a href="#">xxxxxxx</a></p>
			</li>
		</ul>
	</div>
</div></div>
<div id="footer">
	<p>Copyright (c) 2013 Sitename.com. All rights reserved. Design by <a href="http://www.freecsstemplates.org/" rel="nofollow">FreeCSSTemplates.org</a>. Photos by <a href="http://fotogrph.com/">Fotogrph</a>.</p>
</div>
</body>
</html>