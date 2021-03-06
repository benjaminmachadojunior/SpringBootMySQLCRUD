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
    border: 1px solid #1E88E5;
    text-align: left;
    padding: 8px;
}

input[type=submit] {
    padding:5px 15px; 
    background:#BBDEFB; 
    border:0 none;
    cursor:pointer;
    -webkit-border-radius: 5px;
    border-radius: 5px; 
}
input[type=text] {
    padding:5px 15px; 
    background:#BBDEFB; 
    border:0 none;
    cursor:pointer;
    -webkit-border-radius: 5px;
    border-radius: 5px; 
}
tr:nth-child(even) {
    background-color: #BBDEFB;
}
</style>
</head>
<body>
<hr/>
<form method="post" action="/save">
  <input type="hidden" name="id" value="${lists.id}"/><br/>
  CPF:<br>
  <input type="text" name="cpf" value="${lists.cpf}"/>
  <br>
  NOME:<br>
  <input type="text" name="nome" value="${lists.nome}">
  <br>endereco:<br>
  <input type="text" name="endereco" value="${lists.endereco}">
  <br>telefone:<br>
  <input type="text" name="telefone" value="${lists.telefone}">
  <br><br>
  <input type="submit" value="Salvar">
</form>

</body>
</html>
