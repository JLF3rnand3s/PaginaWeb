<!--<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>-->

<style>
    body{
        margin: 0 auto;
        padding: 0;
    }
    #container{
        width: 100%;
         display: flex;
    }
    #fondo{
        width: 70%;
    }
    #fondo img{
        width: 100%; height: auto;
    }
    #item img{
        position: absolute;
        width: 5%;
        top: 5%;
        left: 5%;
        cursor: pointer;
    }
    #inventario{
        width: 31.2%;
       
    }
    #inventario img{
        width: 100%; height: auto;

    }


</style>

    <div id="container">
        <div id="fondo">
          <img src="./img/imgjuego/caminp.jpg">
        </div>
        
        <%--If para saber si el objeto esta en el inventario, si esta en el inventario, dibujarlo en el inventario --%>
        <div id ="item">
            <a href="./prueba2"><img id="imagen" src="./img/imgjuego/payaso.png"  onclick="ocultarImagen()"></a>
        </div>
        <div id="inventario">
          <img  src="https://us.123rf.com/450wm/bizoon/bizoon1408/bizoon140800125/31280797-vertical-de-la-imagen-de-un-fondo-de-textura-blanco.jpg?ver=6">
        </div>
    </div>
      <!--
<script>
    function ocultarImagen() {
  var imagen = document.getElementById("imagen");
  imagen.style.display = "none";
}
</script>
-->