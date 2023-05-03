<!-- ESTILOS -->

<link rel="stylesheet" href="css/login.css">
  <a href="index.jsp"><img id="salida" src="img/back.png" /></a>
    <form method="post" action="verificar-login">
		
		<%--
		DataConex db = new DataConex();
		db.validarUsuario();
		--%>
		<!--_________________________________________INICIAR SESION________________________________________-->
<div class="login-wrap">
	<div class="login-html">
        
		<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Iniciar sesión</label>
		<input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Suscribete</label>
		<div class="login-form">
			<div class="sign-in-htm">
				<div class="group">
					<label for="user" class="label" >Nombre de usuario</label>
					<!--____________________________INPUTS________________________________-->
					<input id="user" type="text" class="input" name="user">
				</div>

				
				<div class="group">
					<label for="pass" class="label">Contraseña</label>
					<!--____________________________INPUTS________________________________-->
					<input id="pass" type="password" class="input" data-type="password" name="pass">
				</div>
                
				<div class="group">
					<input id="check" type="checkbox" class="check" checked name="guardar">
					<!--____________________________INPUTS________________________________-->
					<label for="check"><span class="icon"></span> Guardar usuario</label>
				</div>
                
				<div class="group">
					<a href="#">
					<!--____________________________INPUTS________________________________-->
						<input type="submit" class="button" value="INICIAR SESIÓN"></a>
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
					<a href="#">¿Has olvidado la contraseña?</a>
				</div>
			</div>

	<!--_________________________________________SUSCRIBIRSE________________________________________-->
			<div class="suscr-html">
				<div class="group" id="junto">
					<div class="nomap">
					<label for="user" class="label">Nombre</label>
					<!--____________________________INPUTS________________________________-->
					<input id="user" type="text" class="inputjunto" name="nameSus">
				</div>
					<div class="nomap">
					<label for="user" class="label" >Apellido</label>
					<!--____________________________INPUTS________________________________-->
					<input id="user" type="text" class="inputjunto" name="lastSus">
				</div>
				</div>
				<div class="group">
					<label for="user" class="label">Nombre de usuario</label>
					<!--____________________________INPUTS________________________________-->
					<input id="user" type="text" class="input" name="userSus">
				</div>
				<div class="group">
					<label for="pass" class="label">Contraseña</label>
					<!--____________________________INPUTS________________________________-->
					<input id="pass" type="password" class="input" data-type="password" name="pasSus">
				</div>
				<div class="group">
					<label for="pass" class="label">Dirección de correo electronico</label>
					<!--____________________________INPUTS________________________________-->
					<input id="pass" type="text" class="input" name="mail">
				</div>

                <div class="group">
                <label for="pass" class="label">Fecha de nacimiento</label>
				<!--____________________________INPUTS________________________________-->
                <input type="date" class="input"  name="fechaNac">
                </div>
				<div class="group">
				<!--____________________________INPUTS________________________________-->
					<input id="check2" type="checkbox" class="check" checked name="promociones">
					<label for="check2"><span class="icon"></span> Deseo recibir futuras promociones</label>
				</div>
				<div class="group">
					<a href="#">
					<!--____________________________INPUTS________________________________-->
					<input type="submit" class="button" value="SUSCRIBIRTE" name="suscripcion"></a>
				</div>
			</div>
		</div>
	</div>
</div>
</form>
