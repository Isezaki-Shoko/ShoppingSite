<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html" %>

<title>会員登録完了</title>

<h1>会員登録完了</h1>

<p>会員登録が完了しました。</p>

<form action="<%=request.getContextPath()%>/views/login-in.jsp" method="get">
    <input type="submit" value="ログイン画面へ">
</form>

<%@include file="../footer.html" %>