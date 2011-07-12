<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Matches</h1>

	<table border="1">
		<thead>
			<tr>
				<th>Local</th>
				<th>Visitor</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="match" items="${matchList.matches}">
				<tr>
					<td>${match.local}</td>
					<td>${match.visitor}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>