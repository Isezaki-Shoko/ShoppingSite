<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="jp.co.aforce.beans.Users" %>

<%
Users user = (Users)session.getAttribute("user");
%>
<%@include file="../header.html" %>

<title>ホーム</title>

<h2>ようこそ<%= user.getLastName() %>さん！</h2>
<form action="<%=request.getContextPath()%>/views/user-update.jsp" method="get">
<input type="submit" value="会員情報修正">
</form>

<form action="<%=request.getContextPath()%>/views/user-delete-confirm.jsp" method="post">
<input type="submit" value="退会">
</form>

<form action="<%=request.getContextPath()%>/jp/co/aforce/servlet/Logout.action" method="post"
onsubmit="return confirm('本当にログアウトしますか？')">

<input type="submit" value="ログアウト">
</form>

<%@include file="../footer.html" %>