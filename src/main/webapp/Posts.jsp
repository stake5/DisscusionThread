<%-- 
    Document   : Posts
    Created on : Mar 6, 2015, 6:29:06 PM
    Author     : stake
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Posts Page</title>
    </head>
    <body>
        <h1>This is the posts page!</h1>
        <a href="NewPost.jsp" >New Post</a>
        <h1>Posts: </h1>
        
            <%
                List<String> posts = (List<String>)request.getSession().getAttribute("posts");
                for (String post : posts) {
                    out.write(post + "<br />");
               }
            %> 
    </body>
</html>
