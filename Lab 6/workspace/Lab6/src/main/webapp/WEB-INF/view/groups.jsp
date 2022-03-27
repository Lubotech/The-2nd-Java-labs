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
	<h1>Groups</h1>
	<h4><a href="<c:url value = "/group"/>">Create new Group</a></h4>
	<table>
	    <thead>
	        <tr>
	            <th>ID</th>
	            <th>Name</th>
	            <th>Length</th>
	            <th></th>
	        </tr>
	    </thead>
	    <tbody>
		    <c:forEach items="${groupList }" var="groupItem">
		    	<c:url value="/group/${groupItem.id}" var="deleteURL"></c:url>
		    	<c:url value="/group" var="updateURL">
		    		<c:param name="id" value="${groupItem.id}"></c:param>
		    	</c:url>
		        <tr>
		            <td><c:out value="${groupItem.id}"/></td>
		            <td><c:out value="${groupItem.name}"/></td>
		            <td><c:out value="${groupList.size()}"></c:out></td>
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