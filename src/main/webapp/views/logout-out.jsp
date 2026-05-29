<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<meta http-equiv="refresh"
content="3;url=<%=request.getContextPath()%>/views/login-in.jsp">

<%@include file="../header.html" %>

<title>ログアウト</title>


<h2>ログアウトしました</h2>

<p>3秒後にログイン画面へ戻ります...</p>

<form action="<%=request.getContextPath()%>/views/login-in.jsp" method="get">
	<input type="submit" value="今すぐ戻る">
</form>


<%@include file="../footer.html" %>