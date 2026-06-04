<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>

<h1>登録内容確認</h1>

<p>ID：${user.memberId}</p>
<p>名前：${user.lastName} ${user.firstName}</p>
<p>住所：${user.address}</p>
<p>メールアドレス：${user.mailAddress}</p>

<form action="${pageContext.request.contextPath}/jp/co/aforce/servlet/UserSuccess.action" method="post">
    <input type="hidden" name="memberId" value="${user.memberId}">
    <input type="hidden" name="password" value="${user.password}">
    <input type="hidden" name="lastName" value="${user.lastName}">
    <input type="hidden" name="firstName" value="${user.firstName}">
    <input type="hidden" name="address" value="${user.address}">
    <input type="hidden" name="mailAddress" value="${user.mailAddress}">
    <input type="submit" value="確定">
</form>

<form action="${pageContext.request.contextPath}/views/user-add.jsp" method="post">
    <input type="hidden" name="memberId" value="${user.memberId}">
    <input type="hidden" name="password" value="${user.password}">
    <input type="hidden" name="passwordConfirm" value="${user.password}"> <input type="hidden" name="lastName" value="${user.lastName}">
    <input type="hidden" name="firstName" value="${user.firstName}">
    <input type="hidden" name="address" value="${user.address}">
    <input type="hidden" name="mailAddress" value="${user.mailAddress}">
    <input type="submit" value="戻る">
</form>

<%@include file="../footer.html"%>