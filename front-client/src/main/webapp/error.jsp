<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Default Error Page</title>
    </head>
    <body>
        <h1>Error</h1>
        <h3>status</h3>
        <p><%=request.getAttribute("javax.servlet.error.status_code")%></p>

        <h3>reason:</h3>
        <p><%=request.getAttribute("javax.servlet.error.message")%></p>
    </body>
</html>
