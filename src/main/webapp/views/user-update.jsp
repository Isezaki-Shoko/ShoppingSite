<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>

<h1>会員情報修正</h1>
<title>会員情報修正</title>
<form action="<%=request.getContextPath()%>/jp/co/aforce/servlet/UserUpdateConfirm.action"
	method="post">

    ID(変更不可)<br>
    <input type="text" name="memberId"
           value="${user.memberId}" readonly><br><br>

    パスワード<br>
    <input type="password" name="password"
           value="${user.password}"><br><br>

    名前（姓）<br>
    <input type="text" name="lastName"
           value="${user.lastName}"><br><br>

    名前（名）<br>
    <input type="text" name="firstName"
           value="${user.firstName}"><br><br>

    住所<br>
    <input type="text" name="address"
           value="${user.address}"><br><br>

    メールアドレス<br>
    <input type="text" name="mailAddress"
           value="${user.mailAddress}"><br><br>

    <input type="submit" value="更新">

</form>
<form action="<%=request.getContextPath()%>/views/user-menu.jsp"
	method="get">
	<input type="submit" value="戻る">
</form>
<%@include file="../footer.html"%>