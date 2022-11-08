<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit pet</title>
    <style>
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
<form method="post" action="/hello_war_exploded/edit">
    <input type="hidden" value="${pet.id}" name="id">
    <label>Type</label> <br>
    <input name="type" value="${pet.type}"> <br> <br>
    <label>Name</label> <br>
    <input name="name" value="${pet.name}"> <br> <br>
    <label>Age</label> <br>
    <input name="age" value="${pet.age}" type="number"> <br> <br>
    <input type="submit" name="Send">
</form>
</body>
</html>
