        // Obtener el modal
        var modal2 = document.getElementById("myModal2");
        
        //Obtener el boton el cual inicia la accion 
        var btn2 = document.getElementById("botonranking2");
        
        // Obtener el elemento <span> que cierra la ventana
        var span2 = document.getElementsByClassName("close2")[0];
        
        // Cuando el usuario clica el boton se inicia el modal
        btn2.onclick = function() {
          modal2.style.display = "block";
        }
        
        // se cierra si clicas en la (X)
        span2.onclick = function() {
          modal2.style.display = "none";
        }
        
        // Se cierra si clicas en lo gris
        window.onclick = function(event) {
          if (event.target == modal2) {
            modal2.style.display = "none";
          }
        }
