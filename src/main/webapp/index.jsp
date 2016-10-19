<%@ page import="br.edu.ifpb.pos.service.PessoaService" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    PessoaService pessoaService = PessoaService.getInstance();

    pageContext.setAttribute("pessoas", pessoaService.getAll());

%>

<body>
<h2>Hello World!</h2>
<form action="add" id="form" method="post">
    <label for="nome">nome</label>
    <input type="text" id="nome" name="nome">
    <input type="submit" form="form" value="Salvar">
</form>

<c:forEach var="pessoa" items="${pessoas}">
    <p>${pessoa.name}</p>
</c:forEach>

</body>
</html>



<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<%--<!DOCTYPE html>--%>
<%--<html lang="pt_BR">--%>

    <%--<head>--%>
        <%--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>
        <%--<title>SisLivros</title>--%>
        <%--<meta name="description" content="Hello World">--%>
    <%--</head>--%>

    <%--<%--%>
        <%--PessoaService pessoaService = PessoaService.getInstance();--%>

        <%--pageContext.setAttribute("pessoas", pessoaService.getAll());--%>
    <%--}--%>

    <%--%>--%>
    <%--<body>--%>
        <%--<h2>Hello World!</h2>--%>
        <%--<form action="/add" id="form" method="post">--%>
            <%--<label for="nome" >nome</label>--%>
            <%--<input type="text" id="nome" name="nome" >--%>
            <%--<input type="submit" form="form" value="Salvar">--%>
        <%--</form>--%>

        <%--<c:forEach var="pessoa" items="${pessoas}">--%>
            <%--<p>${pessoa.name}</p>--%>
        <%--</c:forEach>--%>

    <%--</body>--%>
<%--</html>--%>
