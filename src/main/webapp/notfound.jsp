<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        body {
            color: #473e34;
            background-image: url("https://t3.ftcdn.net/jpg/04/24/35/24/360_F_424352469_WJYlrdisV68nj5yh3MWteLh8qohN7AZU.jpg");
            align-items: center;
            display: flex;
            flex-direction: column;
            justify-content: center;
            min-height: 70vh;
            text-align: center;
            font-family: 'Comic Sans MS';
            font-size: medium;
            background-size: 100% 100%;
            background-position: center;
        }
    </style>
    <title>Page not found</title>
</head>
<body>
<h2>Information not found</h2>
<p><a href='<c:url value="/"/>'>Come back to main page</a></p>
</body>
</html>
