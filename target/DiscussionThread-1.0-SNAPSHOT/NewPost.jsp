<%-- 
    Document   : NewPost
    Created on : Mar 6, 2015, 11:10:17 AM
    Author     : stake
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Post Page</title>
    </head>
    <body>
        <h1>Welcome to the new post Page!</h1>
        username: ${username}<br/>
        <form action="AddPost" method="POST">
            <textarea name="post" rows="4" cols="50">Please add your post to this input field.</textarea> <br/>
            <input type="submit" value="Post" />
        </form>
    </body>
</html>
