<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎</title>
</head>
<body>
ad list table

	<table class="list" width="100%" layoutH="115" align="center">
		<thead>
			<tr>
				<th width="50">编号</th>
				<th width="100">广告名称</th>
				<th width="100">广告别名</th>
				<th width="100">开始日期</th>					
				<th width="100">结束日期</th>
				<th width="70">广告预算</th>
				<th width="70">审核状态</th>
				<th width="70">运行状态</th>
				<th width="100">添加日期</th>
				<th width="100">操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.items}" var="ad" >
				<tr> 						
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
					<td>
						<a title="修改广告产品" href="${pageContext.request.contextPath }/publish/ad!edit.action?flag=edit&ad.adId=${ad.adId}" target="navTab" rel="editAdPlan"><span style="color:blue">修改</span></a>&nbsp;
						<a title="查看广告物料" href="${pageContext.request.contextPath }/material/admaterial!list.action?adMaterial.adId=${ad.adId}" target="navTab" rel="addMaterial"><span style="color:blue">广告物料</span></a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
		</table>
		<!-- <page:pageV2 url="ad/newlist" bean="page" number="5" optimize="true" /> -->
		<page:page url="/ad/newlist" bean="page" showJump="true" optimize="true" />
</body>
</html>