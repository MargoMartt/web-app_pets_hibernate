<%
    String message = pageContext.getException().getMessage();
    String exception = pageContext.getException().getClass().toString();
%>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Exception</title>
</head>
<body>
<h2>Error: </h2>
<p>Type: <%= exception %>
</p>
<p>Message: <%= message %>
</p>
</body>
</html>