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
</head>
<body>
    <h1>Aluno</h1>
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
</body>
</html>
