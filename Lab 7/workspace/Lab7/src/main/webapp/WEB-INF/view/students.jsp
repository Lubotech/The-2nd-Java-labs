<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Students</h1>
	<h4><a href="<c:url value = "/student"/>">Create new Student</a></h4>
	<table>
	    <thead>
	        <tr>
	            <th>ID</th>
	            <th>Name</th>
	            <th>Group</th>
	            <th>Gender</th>
	            <th></th>
	        </tr>
	    </thead>
	    <tbody>
		    <c:forEach items="${studentList }" var="studentItem">
		    	<c:url value="/student/${studentItem.id}" var="deleteURL"></c:url>
		    	<c:url value="/student" var="updateURL">
		    		<c:param name="id" value="${studentItem.id}"></c:param>
		    	</c:url>
		        <tr>
		            <td><c:out value="${studentItem.id}"/></td>
		            <td><c:out value="${studentItem.name}"/></td>
		            <td><c:out value="${studentItem.groupId}"/></td>
		            <td><c:out value="${studentItem.gender}"/></td>
		            <td>
		            	<a href="${deleteURL}">delete</a> |
		            	<a href="${updateURL}">update</a>
		            </td>
		        </tr>
		    </c:forEach>
	    </tbody>
	</table>
</body>
</html>