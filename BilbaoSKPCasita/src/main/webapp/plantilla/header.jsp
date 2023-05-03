 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import ="model.DataConex"
    import ="model.Usuario"
    %>
       <nav>
            <ul id="menu">
                <a class="letra" href="./inicio"><img id="logo" src="img/LogoBilbaoSKP.png"></a>
                <li class="secciones"><a class="letra" href="./quehacemos">¿Qué hacemos?</a></li>
                <li class="secciones"><a class="letra" href="./escape">Escape Rooms</a></li>
                <li class="secciones"><a class="letra" href="./blog">Blog</a></li>
                <li class="secciones"><a class="letra" href="./tienda">Tienda</a></li>
                <li class="secciones"><a class="letra" href="./contacto">Contactános</a></li>

<%-- Cambiar la imagen del header si estas logeado --%>

	<%
	HttpSession sesion = request.getSession(false);
	DataConex db = new DataConex();
	Usuario u =  (Usuario) sesion.getAttribute("usuario");
			
	if (u != null){
		%>    <p>Hola <%=u.getNombre() %> </p> <% 	
				
	}else{				
	%>	
		 <li id="login"><img id="logo2" src="img/LogoBilbaoSKP2.png"><a class="letra" href="./login">Iniciar Sesión
                </a></li>
	<% }
	%>
    <div id="google_translate_element"></div>
    <script type="text/javascript">
  function googleTranslateElementInit() {
    new google.translate.TranslateElement({pageLanguage: 'es', layout: google.translate.TranslateElement.InlineLayout.NONE}, 'google_translate_element');
  }
</script>
<style>
.VIpgJd-ZVi9od-ORHb {
  display: none;
}
</style>
				

            </ul>
        </nav>
              