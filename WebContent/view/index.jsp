<%@page import="com.sds.icto.guestbook.vo.GuestBookVo"%>
<%@page import="java.util.List"%>
<%@page import="com.sds.icto.guestbook.dao.GuestBookDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% 
	GuestBookDao dao = new GuestBookDao();
	List<GuestBookVo> list = dao.fetchList();
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
</head>
<body>
	<form action="/guestbook2/gb" method="post">
	<input type="hidden" name="a" value="add" >
	<table border=1 width=500>
		<tr>
			<td>이름</td><td><input type="text" name="name"></td>
			<td>비밀번호</td><td><input type="password" name="pass"></td>
		</tr>
		<tr>
			<td colspan=4><textarea name="content" cols=60 rows=5></textarea></td>
		</tr>
		<tr>
			<td colspan=4 align=right><input type="submit" VALUE=" 확인 "></td>
		</tr>
	</table>
	</form>
	
	<%
		for( GuestBookVo vo : list ) {
	%>
	<br>
	<table width=510 border=1>
		<tr>
			<td>[<%=vo.getNo() %>]</td>
			<td><%=vo.getName() %></td>
			<td><%=vo.getSysdate() %></td>
			<td><a href="/guestbook2/view/deleteform.jsp?no=<%=vo.getNo()%>">삭제</a></td>
		</tr>
		<tr>
			<td colspan=4><%=vo.getMessage() %></td>
		</tr>
	</table>
	<%
		}
	%>
</body>
</html>