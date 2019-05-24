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
tr:nth-child(even) {
    background-color: #BBDEFB;
}
</style>
</head>
<body>

<table>
  <tr>
      <th>CPF</th>
      <td>${lists.cpf}</td>
    </tr>
    <tr>
        <th>NOME</th>
        <td>${lists.nome}</td>
    </tr>
    <tr>
        <th>ENDERECO</th>
        <td>${lists.endereco}</td>
    </tr>
    <tr>
        <th>TELEFONE</th>
        <td>${lists.telefone}</td>
    </tr>
  </table>
  <a href="/">Voltar</a>
</body>
</html>
