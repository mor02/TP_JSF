<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<f:view>
	<f:loadBundle basename="org.ubo.message" var="msg" />
	<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><h:outputText value="#{msg.titre}" /></title>
</head>
<body>

	<%@ include file="fichier.jsp"%><br><br>
	
	<h:form>
	
	
	
		<h:outputText value="#{msg.nom}"  />&nbsp;:&nbsp;&nbsp;<h:inputText
			value="#{user.login}"/>
			
		<br>
		<h:outputText value="#{msg.pass}" />&nbsp;:&nbsp;&nbsp;<h:inputSecret
			value="#{user.password}" />
		<br>
		<h:commandButton value="#{msg.valid}" action="#{login.login}" />
		<h:messages showDetail="true" showSummary="false"/>
	</h:form>
</body>
	</html>

</f:view>