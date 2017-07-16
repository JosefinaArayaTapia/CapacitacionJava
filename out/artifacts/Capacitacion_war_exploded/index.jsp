<%--
  Created by IntelliJ IDEA.
  User: Josefina
  Date: 15-07-17
  Time: 23:07
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

  <title>Login usuarios</title>
</head>
<body>

<div class="container">
    <div class="col-md-offset-3 col-md-6">
        <h1>Formularios con Java Servlets</h1>

        <form role="form" method="post" action="login">
            <div class="form-group">
                <label for="email">Usuario</label>
                <input type="email" class="form-control" name="email"
                       placeholder="email">
            </div>
            <div class="form-group">
                <label for="password">Contraseña</label>
                <input type="password" class="form-control" name="password"
                       placeholder="Contraseña">
            </div>
            <button type="submit" class="btn btn-success btn-block">Login</button>
        </form>
    </div>
</div>



</body>
</html>