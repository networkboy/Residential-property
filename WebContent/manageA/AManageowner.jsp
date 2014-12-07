<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
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
				<li class="current_page_item"><a href="#" accesskey="1" title="">首页</a></li>
				<li><a href="ShowManage" title="">管理人员</a></li>
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
		<table width="1072" height="302" border="1">
		<tt> 物业业主缴纳费用</tt>
        <tr>
          <td width="92"><table width="140" border="1">
                
            <tr>
              <td width="163"><span class="mainMenu">物业业主缴纳费用</span></td>
            </tr>
            <tr>
              <td><span class="mainMenu"><a href="showManageservice.action?pageNo=1">维修信息</a></span></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
            </tr>
          </table></td>
          <td width="929"><table width="834" height="139" border="1">
            <tr>
              <td width="119">用户名</td>
              <td width="171">地址</td>
               <td width="145">是否缴费</td>
              <td width="145">缴纳时间</td>
              <td width="108">增加</td>
              <td width="106">操作</td>
            </tr>
             <s:iterator value="manageowner">
            <tr>
              <form action="updateManageowner" method="post">
              <td height="53"><input type="text" name="name" value="<s:property value="name"/>"/></td>
              <!--  <td><s:property value="address"/></td> 
              <td><s:property value="status"/></td>
              <td><s:property value="time"/></td>-->
              <td><input type="text" name="address" value="<s:property value="address"/>"/></td>
              <td><input type="text" name="status" value="<s:property value="status"/>"/></td>
              <td><input type="text" name="time" value="<s:property value="time"/>"/></td>
              <td><a href="deleteManageowner?name=<s:property value="name"/>">删除</a></td>
              <!-- <td><a href="updateManageowner?name=<s:property value="name"/>&address=<s:property value="address"/>&status=1&time=1">修改</a></td>  -->
              <td><input type="submit" value="修改"></td>
              </form>
            </tr>
            </s:iterator>
          </table>
           <table width="834" height="139" border="1">
              <tr>
              <form action="addManageowner" method="post">
              <td width="119"><input type="text" name="name"/></td>
              <td width="171"><input type="text" name="address"/></td>
              <td width="145"><input type="text" name="status"/></td>
              <td width="145"><input type="text" name="time"/></td>
              <td width="108"><input type="submit" value="增加"></td>
              <td width="106">操作</td>
              </form>
              </tr>
            </table>
            <p>页码 ：<s:property value="pageNo"/>/<s:property value="totalPageNum"/> ···
            ···································
            <a href="showManageowner?pageNo=1">首页</a>························
            <a href='showManageowner?pageNo=<s:property value="pageNo-1"/>'>上页</a>.........................
            <a href='showManageowner?pageNo=<s:property value="pageNo+1"/>'>下页</a>....................................
            <a href='showManageowner?pageNo=<s:property value="totalPageNum"/>'>末页</a></p>
          </td>
        </tr>
      </table>
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
</body>>
</html>