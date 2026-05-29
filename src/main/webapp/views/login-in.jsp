<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html" %>

<title>ログイン</title>
<h2>ログイン</h2>
<form action="<%=request.getContextPath()%>/jp/co/aforce/servlet/Login.action" method="post">
ID <input type="text" name="memberId"><br>
パスワード <input type="password" name="password"><br>
<input type="submit" value="ログイン">
</form>
<h2>はじめてご利用の方</h2>
<form action="register.jsp" method="get">
<input type="submit" value="新規会員登録">
</form>

<%@include file="../footer.html" %>