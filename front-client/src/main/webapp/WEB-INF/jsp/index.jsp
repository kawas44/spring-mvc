<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Bienvenue</h1>
        <p>
            <a href="<c:url value='/login' />">
                Identifiez vous
                <img src="<c:url value='/img/avatar-default.png'/>" />
            </a>
        </p>


    </body>
</html>
