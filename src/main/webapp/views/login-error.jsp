<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html" %>


<title>ログインエラー</title>

<p>IDもしくはパスワードが違います</p>

<form action="<%=request.getContextPath()%>/views/login-in.jsp" method="get">
	<input type="submit" value="ログイン画面へ戻る">
</form>

<%@include file="../footer.html" %>