<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.zhongrun.common.Constant"%>
<%request.setAttribute("ctx", request.getContextPath());%>
<%@include file="../inc/taglib.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="ThemeBucket">
  <link rel="shortcut icon" href="#" type="image/png">
  <title>数据列表</title>

  <!--dynamic table-->
  <link rel="stylesheet" href="${ctx }/adminex/js/advanced-datatable/css/demo_page.css" />
  <link rel="stylesheet" href="${ctx }/adminex/js/advanced-datatable/css/demo_table.css" />
  <link rel="stylesheet" href="${ctx }/adminex/js/data-tables/DT_bootstrap.css" />

  <link href="${ctx }/adminex/css/style.css" rel="stylesheet">
  <link href="${ctx }/adminex/css/style-responsive.css" rel="stylesheet">
</head>
<body class="sticky-header">

<section>
	<!-- left side start-->
    <div class="left-side sticky-left-side">

        <!--logo and iconic logo start-->
        <div class="logo">
            <a href="index.html"><img src="images/logo.png" alt=""></a>
        </div>

        <div class="logo-icon text-center">
            <a href="index.html"><img src="images/logo_icon.png" alt=""></a>
        </div>
        <!--logo and iconic logo end-->


        <div class="left-side-inner">

            <!-- visible to small devices only -->
            <div class="visible-xs hidden-sm hidden-md hidden-lg">
                <div class="media logged-user">
                    <img alt="" src="images/photos/user-avatar.png" class="media-object">
                    <div class="media-body">
                        <h4><a href="#">John Doe</a></h4>
                        <span>"Hello There..."</span>
                    </div>
                </div>

                <h5 class="left-nav-title">Account Information</h5>
                <ul class="nav nav-pills nav-stacked custom-nav">
                    <li><a href="#"><i class="fa fa-user"></i> <span>Profile</span></a></li>
                    <li><a href="#"><i class="fa fa-cog"></i> <span>Settings</span></a></li>
                    <li><a href="#"><i class="fa fa-sign-out"></i> <span>Sign Out</span></a></li>
                </ul>
            </div>

            <!--sidebar nav start-->
            <ul class="nav nav-pills nav-stacked custom-nav">
                <li class="menu-list"><a href="index.html"><i class="fa fa-home"></i> <span>Dashboard</span></a>
                    <ul class="sub-menu-list">
                        <li><a href="index_alt.html"> Dashboard 1</a></li>
                        <li><a href="index.html"> Dashboard 2</a></li>
                    </ul>
                </li>
                <li class="menu-list"><a href=""><i class="fa fa-laptop"></i> <span>Layouts</span></a>
                    <ul class="sub-menu-list">
                        <li ><a href="blank_page.html"> Blank Page</a></li>
                        <li><a href="boxed_view.html"> Boxed Page</a></li>
                        <li><a href="leftmenu_collapsed_view.html"> Sidebar Collapsed</a></li>
                        <li><a href="horizontal_menu.html"> Horizontal Menu</a></li>

                    </ul>
                </li>
                <li class="menu-list"><a href=""><i class="fa fa-book"></i> <span>UI Elements</span></a>
                    <ul class="sub-menu-list">
                        <li><a href="general.html"> General</a></li>
                        <li><a href="buttons.html"> Buttons</a></li>
                        <li><a href="tabs-accordions.html"> Tabs & Accordions</a></li>
                        <li><a href="typography.html"> Typography</a></li>
                        <li><a href="slider.html"> Slider</a></li>
                        <li><a href="panels.html"> Panels</a></li>
                        <li><a href="widgets.html"> Widgets</a></li>
                    </ul>
                </li>
                <li class="menu-list"><a href=""><i class="fa fa-cogs"></i> <span>Components</span></a>
                    <ul class="sub-menu-list">
                        <li><a href="grids.html"> Grids</a></li>
                        <li><a href="gallery.html"> Media Gallery</a></li>
                        <li><a href="calendar.html"> Calendar</a></li>
                        <li><a href="tree_view.html"> Tree View</a></li>
                        <li><a href="nestable.html"> Nestable</a></li>

                    </ul>
                </li>

                <li><a href="fontawesome.html"><i class="fa fa-bullhorn"></i> <span>Fontawesome</span></a></li>

                <li class="menu-list"><a href=""><i class="fa fa-envelope"></i> <span>Mail</span></a>
                    <ul class="sub-menu-list">
                        <li><a href="mail.html"> Inbox</a></li>
                        <li><a href="mail_compose.html"> Compose Mail</a></li>
                        <li><a href="mail_view.html"> View Mail</a></li>
                    </ul>
                </li>

                <li class="menu-list"><a href=""><i class="fa fa-tasks"></i> <span>Forms</span></a>
                    <ul class="sub-menu-list">
                        <li><a href="form_layouts.html"> Form Layouts</a></li>
                        <li><a href="form_advanced_components.html"> Advanced Components</a></li>
                        <li><a href="form_wizard.html"> Form Wizards</a></li>
                        <li><a href="form_validation.html"> Form Validation</a></li>
                        <li><a href="editors.html"> Editors</a></li>
                        <li><a href="inline_editors.html"> Inline Editors</a></li>
                        <li><a href="pickers.html"> Pickers</a></li>
                        <li><a href="dropzone.html"> Dropzone</a></li>
                    </ul>
                </li>
                <li class="menu-list"><a href=""><i class="fa fa-bar-chart-o"></i> <span>Charts</span></a>
                    <ul class="sub-menu-list">
                        <li><a href="flot_chart.html"> Flot Charts</a></li>
                        <li><a href="morris.html"> Morris Charts</a></li>
                        <li><a href="chartjs.html"> Chartjs</a></li>
                        <li><a href="c3chart.html"> C3 Charts</a></li>
                    </ul>
                </li>
                <li class="menu-list nav-active"><a href="#"><i class="fa fa-th-list"></i> <span>Data Tables</span></a>
                    <ul class="sub-menu-list">
                        <li><a href="basic_table.html"> Basic Table</a></li>
                        <li class="active"><a href="dynamic_table.html"> Advanced Table</a></li>
                        <li><a href="responsive_table.html"> Responsive Table</a></li>
                        <li><a href="editable_table.html"> Edit Table</a></li>
                    </ul>
                </li>

                <li class="menu-list"><a href="#"><i class="fa fa-map-marker"></i> <span>Maps</span></a>
                    <ul class="sub-menu-list">
                        <li><a href="google_map.html"> Google Map</a></li>
                        <li><a href="vector_map.html"> Vector Map</a></li>
                    </ul>
                </li>
                <li class="menu-list"><a href=""><i class="fa fa-file-text"></i> <span>Extra Pages</span></a>
                    <ul class="sub-menu-list">
                        <li><a href="profile.html"> Profile</a></li>
                        <li><a href="invoice.html"> Invoice</a></li>
                        <li><a href="pricing_table.html"> Pricing Table</a></li>
                        <li><a href="timeline.html"> Timeline</a></li>
                        <li><a href="blog_list.html"> Blog List</a></li>
                        <li><a href="blog_details.html"> Blog Details</a></li>
                        <li><a href="directory.html"> Directory </a></li>
                        <li><a href="chat.html"> Chat </a></li>
                        <li><a href="404.html"> 404 Error</a></li>
                        <li><a href="500.html"> 500 Error</a></li>
                        <li><a href="registration.html"> Registration Page</a></li>
                        <li><a href="lock_screen.html"> Lockscreen </a></li>
                    </ul>
                </li>
                <li><a href="login.html"><i class="fa fa-sign-in"></i> <span>Login Page</span></a></li>

            </ul>
            <!--sidebar nav end-->

        </div>
    </div>
    <!-- main content start-->
    <div class="main-content" >
        

        <!--body wrapper start-->
        <div class="wrapper">
        <div class="row">
        <div class="col-sm-12">
        <section class="panel">
        <header class="panel-heading">
            Dynamic Table
            <span class="tools pull-right">
                <a href="javascript:;" class="fa fa-chevron-down"></a>
                <a href="javascript:;" class="fa fa-times"></a>
             </span>
        </header>
        <div class="panel-body">
        <div class="adv-table">
        <table  class="display table table-bordered table-striped" id="dynamic-table">
		<thead>
			<tr>
				<th>编号</th>
				<th>广告名称</th>
				<th>广告别名</th>
				<th>开始日期</th>					
				<th>结束日期</th>
				<th>广告预算</th>
				<th>审核状态</th>
				<th>运行状态</th>
				<th>添加日期</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.items}" var="ad" >
				<tr class="gradeA"> 						
					<td>${ad.adId }</td>
					<td>${ad.adName}
					</td>
					<td>${ad.aliasName}</td>
					<td align="center" >
						<fmt:parseDate value="${ad.startDate}"  var="date" pattern="yyyy-MM-dd HH:mm:ss"/>
						<fmt:formatDate value="${date}" type="date"  pattern="yyyy-MM-dd"/>
					</td>
					<td align="center" >
						<fmt:parseDate value="${ad.endDate}"  var="date" pattern="yyyy-MM-dd HH:mm:ss"/>
						<fmt:formatDate value="${date}" type="date"  pattern="yyyy-MM-dd"/>
					</td>
					<td align="center">${ad.budget}</td>
					<td align="center" >
				
					<c:choose>
					<c:when test="${ad.verifyStatus == 0}">
						<font color=orange>审核中</font>
					</c:when>
					<c:when test="${ad.verifyStatus == 1}">
						<font color=blue>审核通过</font>
					</c:when>
					<c:otherwise>
						<font color=red >审核拒绝</font>
					</c:otherwise>
					</c:choose>
					</td>
					<td align="center" >
					<c:choose>
					<c:when test="${ad.status == 1}">
						<font color=blue>投放中</font>
					</c:when>
					<c:when test="${ad.status == 2}">
						<font color=orange>已暂停</font>
					</c:when>
					<c:when test="${ad.status == 3}">
						<font color=blue>已下线</font>
					</c:when>
					<c:when test="${ad.status == -1}">
						<font color=orange>已删除</font>
					</c:when>
					</c:choose>
					</td>
					<td align="center" >
						<fmt:parseDate value="${ad.addTime}"  var="date" pattern="yyyy-MM-dd HH:mm:ss"/>
						<fmt:formatDate value="${date}" type="date"  pattern="yyyy-MM-dd"/>
					</td>
				</tr>
			</c:forEach>
		</tbody>
		</table>
		</div>
        </div>
        </section>
        </div>
        </div>
        
        </div>
        <!--body wrapper end-->

        <!--footer section start-->
        <footer>
            2014 &copy; AdminEx by ThemeBucket
        </footer>
        <!--footer section end-->


    </div>
    <!-- main content end-->
</section>

<!-- Placed js at the end of the document so the pages load faster -->
<script src="${ctx }/adminex/js/jquery-1.10.2.min.js"></script>
<script src="${ctx }/adminex/js/jquery-ui-1.9.2.custom.min.js"></script>
<script src="${ctx }/adminex/js/jquery-migrate-1.2.1.min.js"></script>
<script src="${ctx }/adminex/js/bootstrap.min.js"></script>
<script src="${ctx }/adminex/js/modernizr.min.js"></script>
<script src="${ctx }/adminex/js/jquery.nicescroll.js"></script>

<!--dynamic table-->
<script type="text/javascript" language="javascript" src="${ctx }/adminex/js/advanced-datatable/js/jquery.dataTables.js"></script>
<script type="text/javascript" src="${ctx }/adminex/js/data-tables/DT_bootstrap.js"></script>
<!--dynamic table initialization -->
<script src="${ctx }/adminex/js/dynamic_table_init.js"></script>

<!--common scripts for all pages-->
<script src="${ctx }/adminex/js/scripts.js"></script>
</body>
</html>