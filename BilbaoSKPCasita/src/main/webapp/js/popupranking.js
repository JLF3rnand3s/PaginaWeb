        // Obtener el modal
        var modal = document.getElementById("myModal");
        
        //Obtener el boton el cual inicia la accion 
        var btn = document.getElementById("botonranking");
        
        // Obtener el elemento <span> que cierra la ventana
        var span = document.getElementsByClassName("close")[0];
        
        // Cuando el usuario clica el boton se inicia el modal
        btn.onclick = function() {
          modal.style.display = "block";
        }
        
        // se cierra si clicas en la (X)
        span.onclick = function() {
          modal.style.display = "none";
        }
        
        // Se cierra si clicas en lo gris
        window.onclick = function(event) {
          if (event.target == modal) {
            modal.style.display = "none";
          }
        }
