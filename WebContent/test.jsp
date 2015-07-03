<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<script src="${pageContext.request.contextPath }/ligerUI/lib/jquery/jquery-1.8.3.js" type="text/javascript" ></script>
<script type="text/javascript">
function aCEvt(url){
	$.ajax({
        type: "POST",
        url: url,
        contentType:"v",
        data: JSON.stringify({param1:param1,param2:param2}),//参数列表
        dataType:"json",
        success: function(result){
           //请求正确之后的操作
        },
        error: function(result){
           //请求失败之后的操作
        }
 });
};

</script>
<title>Insert title here</title>
</head>
<body>
<a href="javascript:void(0);" onclick="aCEvt()" ></a>
</body>
</html>