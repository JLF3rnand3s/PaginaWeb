 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import ="model.DataConex"
    import ="model.Usuario"
    import ="java.util.*"
       %>
       
       <%
       //llamamos a la clase Usuario para poder usar sus metodos
       Usuario u = null;
       Usuario u2 = null;
       //Llamamos a el request para poder obtener la lista de el servlet de "escape"
      ArrayList<Usuario> listaUsuarios = (ArrayList) request.getAttribute("listaUsuarios");
      ArrayList<Usuario> listaUsuarios2 = (ArrayList) request.getAttribute("listaUsuarios2");
       %>
       
       
<link rel="stylesheet" href="css/popup.css">
<link rel="stylesheet" href="css/escape.css">
<title>Escapes Rooms</title>
<section class="cajas">
    <div >
        <div class="cajaimg"><img class="foto"  src="img/selvamujer.jpg"></div>
        <div class="titulo">
            <h1>PERDIDA EN LA JUNGLA</h1>
        </div>
        <div class="texto"><p><b>¡Enfrentate a la aventura de Ibanka!</b></br> Esta historia de misterio y aventura habla de Ibanka, una chica que sin saber como ha acabado en mitad de la jungla.
            Tendras que avanzar junto a ella para poder ser libres, pero no todo sera un camino de rosas, tendreis que superar los diferentes enigmas que os encontreis por el camino. 
            No pierdas la pista sobre la partida en ningun momento. ¡Si pestañeas te lo pierdes!
        </p></div>
        <div class="tituloabajo"><p><b>Dificultad</b></p> <p><b>Tiempo</b></p> </div>

        <div class="movermonigotes">
            
            <img class="tamanomonigote" src="img/dificultad2monigotes.png ">
           <img class="tamanoreloj" src="img/reloj.png">
            </div>
            
            <div class="botones">
                <input type='submit' name='jugar' value="JUGAR" class='botonedit' id="botonjugar" >

                <input type='submit' name='ranking' value="VER RANKING" class="botonedit" id="botonranking">
              				
              				
              				   
		      <!-- Clase "modal" que sirve para llamar a los estilos que tenga el pop up. SOLO SIRVE PARA EL PRIMER BOTON -->
		        <div id="myModal" class="modal">
		      
		          <!-- Contenido del Pop Up -->
		          <div class="modal-content">
		            <span class="close">&times;</span>
		          
		          <!-- Nombre del escape -->
		           <h1>Perdida En La Jungla</h1>
		   	<!-- Abrimos la etiqueta table para hacer una tabla con los datos traidos del servlet -->
		    <table border="1">
		        <tr>
		        <!-- Datos que queramos que se vean en el table, en este caso el usuario y su puntuacion -->
		            <th>Usuario</th>
		            <th>Puntuación</th>
		        </tr>
		        <%-- Bucle for para recorrerte la lista de usuarios traidos desde el servlet --%>
		        <% for (Usuario us : listaUsuarios) { %>
		            <tr>
		            <%-- Por cada usuario que se traiga del servlet se recorrera una vez el for y se abrira una
		            etiqueta nueva del "td y tr" --%>
		                <td><%= us.getUsuario() %></td>
		                <td><%= us.getPuntuacion() %></td>
		            </tr>
		        <% } %>
		    </table>		           
				          </div>
		        
		        </div>
		        <!-- Llamamos al script del pop up -->
		              <script src="./js/popupranking.js"></script>
		        
		              				<!-- Termina el pop up --> 
              				
            </div>
            
             
        </div>
    </section>
    <section class="cajas">
        <div>
            <div class="cajaimg"><img class="foto"  src="img/ASILO ABANDONADO.jpg"></div>
            <div class="titulo">
                <h1>ASILO ABANDONADO</h1>
            </div>
            <div class="texto"><p><b>¡Es el momento de que salves a Patrick!</b></br> Patrick se encuentra encerrado en un asilo del que hace años nadie sabe nada,
                cuando te apresuras a la zona ves todo muy oscuro pero con el objetivo claro, salvar a tu hermano Patrick. Primero lo tendras que encontrar y posteriormente
                superar los diferentes retos que se te aparezcan dentro. ¡Es el momento de demostrar tu valentia!
            </p></div>
            <div class="tituloabajo2"><p><b>Dificultad</b></p> <p><b>Tiempo</b></p> </div>
    
            <div class="movermonigotes2">
                
                <img class="tamanomonigote" id="unmonigote" src="img/dificultad1monigote.png ">
               <img class="tamanoreloj" src="img/reloj.png">
                </div>
                
                <div class="botones">
    
                  <a href="./indexjuego.jsp" >  <input type='submit' name='jugar' value="JUGAR" class='botonedit' id=" botonjugar" ></a>
                    <input type='submit' name='ranking2' value="VER RANKING" class="botonedit" id="botonranking2">
    
      				   
		      <!-- Clase "modal" que sirve para llamar a los estilos que tenga el pop up. SOLO SIRVE PARA EL PRIMER BOTON -->
		        <div id="myModal2" class="modal">
		      
		          <!-- Contenido del Pop Up -->
		          <div class="modal-content2">
		            <span class="close2">&times;</span>
		          
		          <!-- Nombre del escape -->
		           <h1>Asilo Abandonado</h1>
		   	<!-- Abrimos la etiqueta table para hacer una tabla con los datos traidos del servlet -->
		    <table border="1">
		        <tr>
		        <!-- Datos que queramos que se vean en el table, en este caso el usuario y su puntuacion -->
		            <th>Usuario</th>
		            <th>Puntuación</th>
		        </tr>
		        <%-- Bucle for para recorrerte la lista de usuarios traidos desde el servlet --%>
		        <% for (Usuario us2 : listaUsuarios2) { %>
		            <tr>
		            <%-- Por cada usuario que se traiga del servlet se recorrera una vez el for y se abrira una
		            etiqueta nueva del "td y tr" --%>
		                <td><%= us2.getUsuario() %></td>
		                <td><%= us2.getPuntuacion() %></td>
		            </tr>
		        <% } %>
		    </table>		           
				          </div>
		        
		        </div>
		        <!-- Llamamos al script del pop up -->
		              <script src="./js/popupranking2.js"></script>
		        
		              				<!-- Termina el pop up --> 
              				
    
                </div>
                
                
            </div>
        
        </section>
        
        
     