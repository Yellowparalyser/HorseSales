<%@ page import="java.util.ArrayList" %>
<%@ page import="model.Horse" %>
<%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 24.05.2018
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    ArrayList<Horse> horses = (ArrayList<Horse>) request.getAttribute("horses");
%>

<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
    <title>Horse auction</title>
</head>

<body>
<h1 align="center">Licytujesz następujące konie</h1>


<table align="center" class="table table-bordered" style="width: 600px">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">Name</th>
        <th scope="col">Price</th>
    </tr>
    </thead>
    <tbody>
    <%
        for (int i = 0; i< horses.size(); i++){
    %>
    <tr>
        <td><%=i+1%></td> <td><%=horses.get(i).getName()%></td> <td><%=horses.get(i).getPrice()%></td>
    </tr>
    <%
        }
    %>
    </tbody>
</table>

<h3 align="center"> Total price: <%=request.getAttribute("sum")%></h3>
<h3 align="center"> Average price: <%=request.getAttribute("avg")%></h3>
<div style="text-align: center;"><a href="/index.jsp">Powrót</a></div>
<img align="center" src="https://www.publicdomainpictures.net/pictures/120000/velka/unicorn-silhouette.jpg" height="650" width="700">


</body>
</html>
