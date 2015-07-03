<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.zhongrun.common.Constant"%>
<%request.setAttribute("ctx", request.getContextPath());%>
<%@include file="../inc/taglib.jsp" %>


  <!--dynamic table-->
  <link rel="stylesheet" href="${ctx }/adminex/js/advanced-datatable/css/demo_page.css" />
  <link rel="stylesheet" href="${ctx }/adminex/js/advanced-datatable/css/demo_table.css" />
  <link rel="stylesheet" href="${ctx }/adminex/js/data-tables/DT_bootstrap.css" />

    <!-- main content start-->

        <!--body wrapper start-->
        
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
        
        <!--body wrapper end-->

    <!-- main content end-->

<!--dynamic table-->
<script type="text/javascript" src="${ctx }/adminex/js/advanced-datatable/js/jquery.dataTables.js"></script>
<script type="text/javascript" src="${ctx }/adminex/js/data-tables/DT_bootstrap.js"></script>
<!--dynamic table initialization -->
<script src="${ctx }/adminex/js/dynamic_table_init.js"></script>
