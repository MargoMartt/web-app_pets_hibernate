<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Find pet</title>
    <style>
        table {
            border: 5px solid #95816a;
            padding: 4px;
            width: 100%;
            max-width: 700px;
            background-color: #eee5d1;
            opacity: 0.8;
        }

        tr th, tr td {
            border: 1px solid #95816a;
            padding: 4px
        }
        body {
            color: #473e34;
            background-image: url("https://t3.ftcdn.net/jpg/04/24/35/24/360_F_424352469_WJYlrdisV68nj5yh3MWteLh8qohN7AZU.jpg");
            align-items: center;
            display: flex;
            flex-direction: column;
            justify-content: center;
            min-height: 60vh;
            text-align: center;
            font-family: 'Comic Sans MS';
            font-size: medium;
            background-size: 100% 100%;
            background-position: center;
        }
    </style>
</head>
<body>
<h2>Find pet by id</h2>
<form method="post">
    <input name="id">
    <input type="submit" value="Find">
</form>
<br>
<table>
    <tr>
        <th>Type</th>
        <th>Name</th>
        <th>Age</th>
    </tr>
    <tr>
        <td>${pet.type}</td>
        <td>${pet.name}</td>
        <td>${pet.age}</td>
    </tr>
</table>
<p><a href='<c:url value="/"/>'>Come back to main page</a></p>
</body>
</html>
