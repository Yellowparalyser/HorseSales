<%--
  Created by IntelliJ IDEA.
  User: Julia
  Date: 07.06.2018
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>model.Horse sales</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
  <meta charset="UTF-8">
</head>
<body>
<h1 align="center">Witamy na aukcji koni wyścigowych </h1>
<h4 align="center">Wpisz nazwę konia i cenę za jaką możesz go kupić</h4>


<form method="post" action="auction" align="center">
  <input type="text" name= "horse1" placeholder="Horse1"><input type="number" step="0.01" name= "price1" placeholder= "1000"><br>
  <input type="text" name= "horse2"  placeholder="Horse2"><input type="number" step="0.01" name= "price2" placeholder= "1000"><br>
  <input type="text" name= "horse3"  placeholder="Horse3"><input type="number" step="0.01" name= "price3" placeholder= "1000"><br>
  <input type="text" name= "horse4"  placeholder="Horse4"><input type="number" step="0.01" name= "price4" placeholder= "1000"><br>

  <input type="submit" value="Licytuj">
</form>


<img align="center" src="https://www.publicdomainpictures.net/pictures/120000/velka/unicorn-silhouette.jpg" height="650" width="700">
<%--<a href="http://youtube.pl">nagranie z wyścigu</a>--%>
</body>
</html>
