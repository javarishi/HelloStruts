<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login Page</title>
</head>
<body>
<s:div>Email Form</s:div>
<s:text name="User Login Required:" />
<s:form action="login" method="post">
	<s:textfield key="login.user" name="userId" label="UserId" />
	<s:password key="login.password" name="password" label="Password"/>
	<s:submit key="submit" label="Submit"/>
</s:form>
</body>
</html>