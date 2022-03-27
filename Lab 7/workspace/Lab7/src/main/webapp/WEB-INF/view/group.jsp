<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Groups</title>
</head>
<body>
	<form action="group" method="post">
		<c:choose>
			<c:when test="${isCreate == true }">
				<h1>Create</h1>
				<p>ID: <input type="text" name="id"/></p>
			</c:when>
			<c:otherwise>
				<h1>Update</h1>
				<input type="hidden" name="id" value="${group.id}"/>
			</c:otherwise>
		</c:choose>
		<p>Name: <input type="text" name="name" value="${group.name}"/></p>
		<p><input type="submit" value="submit" /> <input type="reset" value="reset" /></p>
	</form>
</body>
</html>