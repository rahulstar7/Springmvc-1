<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Book Data</h3>

	<table>
		<thead>
			<tr>
				<td>Book Id</td>
				<td>Book Name</td>
				<td>Book Price</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listbook}" var="book">
			<tr>
				<td>${book.bookId }</td>
				<td>${book.bookName }</td>
				<td>${book.bookPrice }</td>
				</tr>
			</c:forEach>

		</tbody>

	</table>

</body>
</html>