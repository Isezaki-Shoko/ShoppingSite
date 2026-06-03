<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<h1>退会確認</h1>

<p>
本当に退会しますか？<br>
この処理は元に戻せません。
</p>

<form action="<%=request.getContextPath()%>/jp/co/aforce/servlet/UserDelete.action" method="post">
    <input type="submit" value="退会する">
</form>
<form action="<%=request.getContextPath()%>/views/user-menu.jsp" method="get">
    <input type="submit" value="キャンセル">
<%@include file="../footer.html" %>
</form>