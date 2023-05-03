<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<title>Método Pago</title>
<div class="panelPago">
    <div class="panel-body">
      <h2 class="titulo">Verificar Método de Pago</h2>
   
      
        <div class="progress">
        <div class="circle done">
            <p class="label">1</p>
            <p class="title">Datos </p>
        </div>
        <p class="bar done"></p>
        <div class="circle done">
            <p class="label">2</p>
            <p class="title">Pago</p>
        </div>
        

        <p class="bar"></p>
        <div class="circle">
            <p class="label">3</p>
            <p class="title">Finalizar</p>
        </div>
        </div>
   
      <div class="metodoPago">
        <label id="tarjeta" class="metodo tarjeta">
          <div class="card-logos">
            <img src="https://designmodo.com/demo/checkout-panel/img/visa_logo.png"/>
            <img src="https://designmodo.com/demo/checkout-panel/img/mastercard_logo.png"/>
          </div>
   
          <div class="radio-input">
            <input id="card" type="radio" name="payment">
            Paga con la tarjeta de crédito
          </div>
        </label>
   
        <label id="paypal" class="metodo paypal">
          <img src="https://designmodo.com/demo/checkout-panel/img/paypal_logo.png"/>
          <div class="radio-input">
            <input id="paypal" type="radio" name="payment">
            Paga con PayPal
          </div>
        </label>
      </div>
   
      <div class="camposEntrada">
        <div class="column-1">
          <label id="nombreTit">Nombre titular</label>
          <input type="text" id="nombreTit" />
   
          <div class="peqEntrada">
            <div>
              <label id="fechaCad">Fecha caducidad</label>
              <input type="text" id="fechaCad"/>
            </div>
   
            <div>
              <label id="verificacion">CVV / CVC *</label>
              <input type="password" id="verificacion"/>
            </div>
          </div>
   
        </div>
        
        <div class="column-2">
          <label id="numTarjeta">Número de tarjeta</label>
          <input type="password" id="numTarjeta"/>
   
          <span class="info">* CVV o CVC es el código de seguridad de la tarjeta, número único de tres dígitos en el reverso de su tarjeta separado de su número.
        </span>
        </div>
      </div>
    </div>
   
    <div class="botones">
      <a href="metPagoDatos.html"><button class="btn atras">Atras</button></a>
      <a href="/metPagoFinal.html"><button class="btn next-btn">Siguente</button></a>
    </div>


  </div>
