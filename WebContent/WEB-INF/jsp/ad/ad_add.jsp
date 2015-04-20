<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<title>添加广告</title>
</head>
<body>


<form method="post" action="${pageContext.request.contextPath }/ad/add?flag=save" >
			<div class="pageFormContent" layoutH="92">
				
				<dl class="nowrap">
					<dt>广告类型：</dt>
					<dd>
						<select name="ad.adType">
							<option value="" >请选择</option>
							<option value="1" >电子商务</option>
							<option value="2" >单机游戏</option>
							<option value="3" >装机必备</option>
						</select>
					</dd>
				</dl>
				<dl class="nowrap">
					<dt>广告名称：</dt>
					<dd><input name="ad.adName" type="text"/></dd>
				</dl>
				<dl class="nowrap">
					<dt>广告别名：</dt>
					<dd><input name="ad.aliasName" type="text" /></dd>
				</dl>
				<!-- <dl class="nowrap">
				<dt>推广时间范围：</dt>
					<dd>
						<label>开始时间<input name="ad.startDateStr" type="text" value="" class="date required" pattern="yyyy-MM-dd" readonly="true" size="15" /></label>
						<label>结束时间<input name="ad.endDateStr" type="text" value="" class="date required" pattern="yyyy-MM-dd" readonly="true" size="15" /></label>
					</dd>
				</dl> -->
				<dl class="nowrap">
					<dt>广告预算：</dt>
					<dd><input name="ad.budget" type="text" min="200"/></dd>
				</dl>
				
				<dl class="nowrap">
					<dt>备注：</dt>
					<dd><textarea rows="8" cols="80" name="ad.memo"></textarea></dd>
				</dl>
			</div>
			<div class="formBar">
				<ul>					
					<li><div class="buttonActive"><button type="submit">保存</button></div></li>
					
				</ul>
			</div>
		</form>
</body>
</html>