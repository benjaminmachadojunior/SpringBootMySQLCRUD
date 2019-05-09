<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head><title>SpringBoot</title>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
</head>
<body>
<form method="post" action="/save">
  <input type="hidden" name="id" value=""/>
  CPF:
  <input type="text" name="cpf"/>
  NOME:
  <input type="text" name="nome" >
  ENDERECO:
  <input type="text" name="endereco" >
  TELEFONE:
  <input type="text" name="telefone" >
  <input type="submit" value="SALVAR"><br><br>
</form>

<table>
  <tr>
    <th>CPF</th>
    <th>NOME</th>
    <th>ENDERECO</th>
    <th>TELEFONE</th>
    <th>OPCAO</th>
  </tr>
   <c:forEach var = "list" items = "${lists}">
  <tr>
    <td>${list.cpf}</td>
    <td>${list.nome}</td>
    <td>${list.endereco}</td>
    <td>${list.telefone}</td>
    <td>
        <a href="/view/${list.id}">VER</a>
        <a href="/delete/${list.id}">DELETAR</a>
        <a href="/edit/${list.id}">EDITAR</a>
    </td>
  </tr>
  </c:forEach>
</table>
<hr/>

</body>
</html>
