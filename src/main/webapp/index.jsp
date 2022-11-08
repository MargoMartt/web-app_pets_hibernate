<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Pets</title>
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
            align-items: center;
            display: flex;
            flex-direction: column;
            justify-content: center;
            min-height: 85vh;
            text-align: center;
            font-family: 'Comic Sans MS';
            font-size: medium;
            background-image: url("https://img.freepik.com/free-vector/frame-with-dogs-vector-white-background_53876-127700.jpg?w=2000");
            background-size: 100% 100%;
            background-position: center;
        }
    </style>
</head>
<body>
<h2>Pets list</h2>
<p><a href='<c:url value="/create"/>'>Add new pet</a></p>
<table>
    <tr>
        <th>Type</th>
        <th>Name</th>
        <th>Age</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="pet" items="${pets}">
        <tr>
            <td>${pet.type}</td>
            <td>${pet.name}</td>
            <td>${pet.age}</td>
            <td>
                <a href='<c:url value="/edit?id=${pet.id}"/>'>Edit</a> |
                <form method="post" action="<c:url value="/delete"/>" style="display: inline;">
                    <input type="hidden" name="id" value="${pet.id}">
                    <input type="submit" value="Delete">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
<p><a href='<c:url value="/find"/>'>Find pet by id</a></p>
</body>
</html>
