<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html" %>

<title>新規会員登録</title>

<h1>新規会員登録</h1><p>(<span style="color:red;">*</span>は必須）</p>
<p style="color:red;">${message}</p>

<form action="<%=request.getContextPath()%>/jp/co/aforce/servlet/UserConfirm.action" method="post">
    ID（半角英数字8～16文字で入力）<span style="color:red;">（変更不可）</span><span style="color:red;">*</span>
    <input type="text" name="memberId" value="${param.memberId}" required><br>

    パスワード（半角英数字8～16文字で入力）<span style="color:red;">*</span>
    <input type="password" name="password" id="password" value="${param.password}" required><br>

    パスワード（確認用）<span style="color:red;">*</span>
    <input type="password" name="passwordConfirm" id="passwordConfirm" value="${param.passwordConfirm}" required><br>

    名前（姓）<span style="color:red;">*</span><input type="text" name="lastName" value="${param.lastName}" required><br>
    名前（名）<span style="color:red;">*</span><input type="text" name="firstName" value="${param.firstName}" required><br>
    住所<span style="color:red;">*</span><input type="text" name="address" value="${param.address}" required><br>
    メールアドレス<span style="color:red;">*</span><input type="email" name="mailAddress" value="${param.mailAddress}" required><br>

    <input type="submit" value="確認"><br>
</form>

<form action="<%=request.getContextPath()%>/views/login-in.jsp" method="get">
    <input type="submit" value="ログイン画面へ戻る"><br>
</form>

<%@include file="../footer.html" %>