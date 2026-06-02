<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html" %>

<jsp:useBean id="user" class="jp.co.aforce.beans.Users" scope="request" />

<h1>登録内容確認</h1>

<p>ID：<jsp:getProperty name="user" property="memberId" /></p>
<p>名前：<jsp:getProperty name="user" property="lastName" /> <jsp:getProperty name="user" property="firstName" /></p>
<p>住所：<jsp:getProperty name="user" property="address" /></p>
<p>メールアドレス：<jsp:getProperty name="user" property="mailAddress" /></p>

<form action="<%=request.getContextPath()%>/jp/co/aforce/servlet/UserSuccess.action" method="post">
    <input type="hidden" name="memberId" value="${user.memberId}">
    <input type="hidden" name="password" value="${user.password}">
    <input type="hidden" name="lastName" value="${user.lastName}">
    <input type="hidden" name="firstName" value="${user.firstName}">
    <input type="hidden" name="address" value="${user.address}">
    <input type="hidden" name="mailAddress" value="${user.mailAddress}">

    <input type="submit" value="確定">
</form>
<%@include file="../footer.html" %>