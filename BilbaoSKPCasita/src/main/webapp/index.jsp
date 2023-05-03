<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<% 

	String nombreSeccion=request.getParameter("sect");
	if (nombreSeccion==null) nombreSeccion="inicio";
	String seccion ="/secciones/"+nombreSeccion+".jsp";
	
%> 

<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Arvo:wght@700&family=Fredoka&display=swap');
    </style>
<script type="text/javascript" src="//translate.google.com/translate_a/element.js?cb=googleTranslateElementInit"></script>

    <title>BilbaoSKP</title>
    <link rel="stylesheet" href="css/header.css">
    <link  rel="stylesheet" href="css/<%=nombreSeccion%>.css">
    <link rel="icon" type="img/ico" href="img/LogoBilbaoSKP.png" />
</head>
	
<body>
    <header>
    <%-- Metemos la direccion del header --%>
<%@ include file="plantilla/header.jsp" %>
    </header>

    <script type="text/javascript">
        window.addEventListener("scroll", function () {
            var header = document.querySelector("header");
            header.classList.toggle("abajo", window.scrollY>600);
        })
    </script>

    <main>

   <%-- Zona donde se inyectan TODAS las secciones --%>
 
            <jsp:include page="<%=seccion%>"/>
 
    </main>
 
 
</body>
<footer>
    <%-- Metemos la direccion del footer --%>
   <%@include file="plantilla/footer.jsp" %>
</footer>

</html>

