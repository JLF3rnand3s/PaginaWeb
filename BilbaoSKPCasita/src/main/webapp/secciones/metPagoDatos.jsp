<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<title>Método Pago</title>

<div class="panelPago">
  <div class="panel-body">
    <h2 class="titulo">Verificar Datos</h2>


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


    <div class="camposEntrada">

      <div class="column-1">
        <label id="nombreTit">Nombre</label>
        <input type="text" class="nombreTit" />
      </div>

      <div class="column-1">
        <label id="nombreTit">Apellidos</label>
        <input type="text" class="nombreTit" />

      </div>

      <div class="column-1">
        <label class="nombreTit">NIE / NIF</label>
        <input type="text" class="nombreTit" />
      </div>

      <div class="column-1">
        <label id="nombreTit">Número Teléfono</label>
        <input type="text" class="nombreTit" />
      </div>

      <div class="column-1">
        <label id="nombreTit">Email</label>
        <input type="text" class="nombreTit" />
      </div>
    </div>
  </div>

</div>

<div class="botones">

  <a href="./metPago"><button class="btn next-btn">Siguente</button></a>
</div>
