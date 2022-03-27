<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "sf" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Create new Student</h1>
	<sf:form action="student" method="post" modelAttribute="student">
		<p>ID: <sf:input path="id"/><sf:errors path="id" cssClass="error"/></p>
		<p>Name: <sf:input path="name"/><sf:errors path="name" cssClass="error"/></p>
		<p>Gender:
			Male <sf:radiobutton path="gender" value="Male"/>
			Female <sf:radiobutton path="gender" value="Female"/>
		</p>
		<p>Group:
			<sf:select path="groupId">
				<sf:options items="${groupList }" itemLabel="name" itemValue="id"/>
			</sf:select>
		</p>
		<p><input type="submit" value="submit"> <input type="reset" value="reset"></p>
	</sf:form>
</body>
</html>