<%-- 
    Document   : Login
    Created on : Mar 6, 2015, 11:03:33 AM
    Author     : stake
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="CheckLogin" method="POST">
            Username: <input type="text" name="username"/><br/>
            Password: <input type="password" name="password"/><br/>
            
            <input type="submit" value="Login" />
        </form>    
    </body>
</html>
