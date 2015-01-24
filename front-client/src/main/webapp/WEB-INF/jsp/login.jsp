<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<fmt:setBundle basename="messages" var="msg" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="<c:url value='/login' />" method="POST">
            <label for="username">Pseudo :</label>
            <input type="text" id="username" name="username"
                   placeholder="Saisissez votre pseudo" /><br/>
            <s:hasBindErrors name="loginForm">
                <span>
                    <s:message message="${errors.getFieldError('username')}" />
                </span><br/>
            </s:hasBindErrors>
            <input type="submit" id="login-submit" value="Connexion" />
        </form>

    </body>
</html>
