<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html" %>

<title>新規会員登録</title>

<h1>新規会員登録</h1>
<p style="color:red;">${message}</p>

<form action="<%=request.getContextPath()%>/jp/co/aforce/servlet/UserConfirm.action" method="post">
    ID（変更不可）<input type="text" name="memberId"><br>

    パスワード
    <input type="password" name="password" id="password"><br>

    パスワード（確認用）
    <input type="password" name="passwordConfirm" id="passwordConfirm"><br>

    名前（姓）<input type="text" name="lastName"><br>
    名前（名）<input type="text" name="firstName"><br>
    住所<input type="text" name="address"><br>
    メールアドレス<input type="text" name="mailAddress"><br>

    <input type="submit" value="確認"><br>
</form>

<form action="<%=request.getContextPath()%>/views/login-in.jsp" method="get">
    <input type="submit" value="ログイン画面へ戻る"><br>
</form>

<%@include file="../footer.html" %>