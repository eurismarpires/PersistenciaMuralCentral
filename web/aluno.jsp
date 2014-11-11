<%--
  Created by IntelliJ IDEA.
  User: Eurismar
  Date: 27/10/2014
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div id="menu">
    <ul>
        <li><a href="index.jsp">Home</a></li>
        <li><a href="aluno.jsp">Aluno</a></li>
        <li><a href="">Curso</a></li>
        <li><a href="">Disciplina</a></li>
        <li><a href="">Docente</a></li>
        <li><a href="">Orgão</a></li>
        <li><a href="">Técnico</a></li>
        <li><a href="">Turma</a></li>
        <li><a href="servicosrest.jsp">Serviços REST JSON</a></li>
        <li><a href="_ah/admin">Admin</a></li>
    </ul>
</div>
    <form method="post" action="servlet/Aluno">
        <!-- DADOS PESSOAIS-->
        <fieldset>
            <legend>Dados Pessoais</legend>
            <table cellspacing="10">
                <tr>
                    <td>
                        <label for="nome">Nome: </label>
                    </td>
                    <td align="left">
                        <input type="text" name="nome">
                    </td>
                    <td>
                        <label for="matricula">Matrícula: </label>
                    </td>
                    <td align="left">
                        <input type="text" name="matricula">
                    </td>
                </tr>
            </table>
        </fieldset>
        <input type="submit">
        <input type="reset" value="Limpar">
    </form>
    <form>

        <a href="/servlet/listaAlunos">Listagem de Alunos</a>
        <br>
        <a href="../resources/ar/alunos">Listagem de Alunos JSON</a>

</body>
</html>
