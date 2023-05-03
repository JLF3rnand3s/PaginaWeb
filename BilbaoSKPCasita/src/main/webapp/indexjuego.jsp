<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


      <% 
      //Le añadimos un parametro de inicio, en este caso cuando se inicie la pagina se iniciara en la pagina inicio
  
      String seccion = request.getParameter("sectjuego");
      if (seccion==null) seccion="prueba";
      seccion = "/secciones/secciones_juego/"+seccion+".jsp";
     %>
     
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>
    <main>
   
   <%-- Zona donde se inyectan TODAS las secciones --%>
   
          <jsp:include page="<%=seccion%>"/>
    </main>
</body>

</html>