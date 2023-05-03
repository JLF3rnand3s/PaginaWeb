<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*"
    import="model.Item"
    %>
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
    .item img{
        position: absolute;
        width: 10%;
        top: 5%;
        right: 9%;
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
        
        <%
        //Obtenemos el array enviado del servlet y lo almacenamos en otra lista (para que funcione tenemos que castearlo 
        //a un objeto tipo "ArrayList" y ponerle la clase de la que viene, en este caso la clase Item)
    ArrayList<Item> objetos = (ArrayList<Item>)request.getAttribute("objetos");
        //Nos recorremos la lista recibida desde el servlet y sacamos la cantidad de items que necesitamos, en este caso 2
			   for(int i = 0; i < objetos.size() && i < 2; i++) {
				  // obtenemos los items de la lista
        Item item = objetos.get(i);
%>
        <div class="item">
        <%--Aqui llamamos a los getters de la clase item, en este caso el nombre, la url y la descripcion. 
        Toda la informacion la saca de la base de datos  --%>
            <%--Sacar la url de la imagen de la base de datos (debe concordar con el nombre que tiene la img en el java
            es decir, si la imagen tiene url "paco" la img en el java debe de llamarse "paco") --%>
            <img  src="./img/imgjuego/<%=item.getUrl() %>">
            <%--Mostrar el nombre del objeto --%>
        <div style= display:none;>
            <h3><%= item.getNombre() %></h3>
            <%--Mostrar la descripcion --%>
            <h3><%= item.getDescripcion() %></h3>
        </div>
        </div>
<%
    }
%>
        
        
      
        <div id="inventario">
          <img  src="https://us.123rf.com/450wm/bizoon/bizoon1408/bizoon140800125/31280797-vertical-de-la-imagen-de-un-fondo-de-textura-blanco.jpg?ver=6">
        </div>
    </div>
    
    

    
<%--
<script>
function mostrarImagen() {
	  var imagen = document.getElementById("imagen");
	//Aqui mostrar la imagen como si fuera un pop uo en el cual mostrara una breve descripcion y su nombre
}
</script>
 --%>