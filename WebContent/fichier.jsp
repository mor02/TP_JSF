<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h:form>
		<f:loadBundle basename="org.ubo.message" var="msg" />
		<h:commandLink immediate="true" action="#{localeLang.activeFR}"
			value="français" />&nbsp;
		<h:commandLink immediate="true" action="#{localeLang.activeEN}"
			value="Anglais" />
		<br>
		<u><b>Menu</b></u>
		<br>

		<h:commandLink value="#{msg.item0}" action="Acceuil" />
		<br />


		<h:panelGrid columns="1">
			<h:commandLink value="#{msg.item1}" action="Login"
				rendered="#{!login.loggedIn}" />

			<h:commandLink value="#{msg.item2}" action="Subscribe"
				rendered="#{!login.loggedIn}" />

			<h:commandLink value="#{msg.item3}" rendered="#{login.loggedIn}" />
			<h:commandLink value="#{msg.item4}" action="#{login.logout}"
				rendered="#{login.loggedIn}" />

			<h:outputText value="Bienvenue :#{login.currentUser.login}"
				style="color:red" rendered="#{login.loggedIn}"/>
		</h:panelGrid>

	</h:form>

</body>
</html>
