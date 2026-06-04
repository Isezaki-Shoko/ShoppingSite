<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="jp.co.aforce.beans.Users" %>
<%@include file="../header.html" %>
<title>会員リスト</title>

<h1>会員一覧</h1>

<table border="1">
<tr>
	<th>ID</th>
	<th>姓</th>
	<th>名</th>
	<th>住所</th>
	<th>メール</th>
	</tr>
	
<%
List<Users> list=
	(List<Users>)request.getAttribute("list");
	
	for(Users user : list){
%>

<tr>
	<td><%= user.getMemberId() %></td>
	<td><%= user.getLastName() %></td>
	<td><%= user.getFirstName() %></td>
	<td><%= user.getAddress() %></td>
	<td><%= user.getMailAddress() %></td>
</tr>

<%
	}
%>
</table>
<%@include file="../footer.html" %>