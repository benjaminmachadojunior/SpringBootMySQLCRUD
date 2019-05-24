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
    border: 1px solid #e64a19;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #ffccbc;
}
input[type=submit] {
    padding:5px 15px; 
    background:#ffccbc; 
    border:0 none;
    cursor:pointer;
    -webkit-border-radius: 5px;
    border-radius: 5px; 
}
input[type=text] {
    padding:5px 15px; 
    background:#ffccbc; 
    border:0 none;
    cursor:pointer;
    -webkit-border-radius: 5px;
    border-radius: 5px; 
}
	</style>
	<script>
function formatar(mascara, documento){
  var i = documento.value.length;
  var saida = mascara.substring(0,1);
  var texto = mascara.substring(i)
  
  if (texto.substring(0,1) != saida){
            documento.value += texto.substring(0,1);
  }
  
}
</script>
</head>
<body>
<div align="center">
		<img src="https://img.elo7.com.br/product/main/14CF39E/adesivo-de-parede-homem-de-ferro-adesivo-homem-de-ferro.jpg" width="20%" height="40%">
	</div>
<form method="post" action="/save">
  <input type="hidden" name="id" value=""/>
  CPF:
  <input type="text" name="cpf" maxlength="14" OnKeyPress="formatar('###.###.###-##', this)"/>
  NOME:
  <input type="text" name="nome" >
  ENDERECO:
  <input type="text" name="endereco" >
  TELEFONE:
  <input type="text" name="telefone" maxlength="13" OnKeyPress="formatar('##-#####-####', this)">
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
