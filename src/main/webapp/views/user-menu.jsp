<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="jp.co.aforce.beans.Users" %>

<%
Users user = (Users)session.getAttribute("user");
%>
<%@include file="../header.html" %>

<title>ホーム</title>

<h2>ようこそ<%= user.getLastName() %>さん！</h2>
<form action="update" method="post">
<input type="submit" value="修正">
</form>

<form action="delete" method="post">
<input type="submit" value="削除">
</form>

<form action="<%=request.getContextPath()%>/jp/co/aforce/servlet/Logout.action" method="post"
onsubmit="return confirm('本当にログアウトしますか？')">

<input type="submit" value="ログアウト">
</form>

<%@include file="../footer.html" %>