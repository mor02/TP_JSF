<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<f:view>
	<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><h:outputText value="#{msg.titre}" /></title>
</head>
<body>

	<h:form>
		
		<f:loadBundle basename="org.ubo.message" var="msg" />
		<h:outputText value="#{msg.titre_page}" />
		<br>
		<br>


	</h:form>
	<%@ include file="fichier.jsp"%>
	
</body>
	</html>
</f:view>