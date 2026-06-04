<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html" %>

<title>管理者ページ</title>
<h2>ようこそ管理者ページへ！</h2>

<form action="<%=request.getContextPath()%>/jp/co/aforce/servlet/UserList.action" method="post">

    <input type="submit" value="会員一覧">

</form>


<form action="<%=request.getContextPath()%>/jp/co/aforce/servlet/Logout.action" method="post"
onsubmit="return confirm('本当にログアウトしますか？')">

<input type="submit" value="ログアウト">
</form>

<%@include file="../footer.html" %>