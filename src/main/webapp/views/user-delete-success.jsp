<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<h2>退会が完了しました</h2>

<form action="<%=request.getContextPath()%>/views/login-in.jsp" method="get">
	<input type="submit" value="ログイン画面へ戻る">
</form>
<%@include file="../footer.html" %>