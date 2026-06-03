<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>
<title>会員情報修正完了</title>
<h2>会員情報修正が完了しました</h2>
<form action="<%=request.getContextPath()%>/views/user-menu.jsp" method="get">
	<input type="submit" value="メニューへ戻る">
<%@include file="../footer.html"%>
