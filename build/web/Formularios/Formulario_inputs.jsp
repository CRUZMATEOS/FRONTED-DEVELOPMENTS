<%-- 
    Document   : Formulario_inputs
    Created on : 13/10/2019, 08:04:04 PM
    Author     : Luis Mateos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Estilos botones -->
        <link href="../lib/css/Formularios/Formulario_inputs.css" rel="stylesheet" type="text/css"/>
        <!-- Estilos iconos -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <br>
        <br>
        <div class="inputWithIcon">
            <input type="text" placeholder="Your name" onkeypress="return soloLetras(event)">
            <i class="fa fa-user fa-lg fa-fw" aria-hidden="true"></i>
        </div>

        <div class="inputWithIcon">
            <input type="text" placeholder="Email">
            <i class="fa fa-envelope fa-lg fa-fw" aria-hidden="true"></i>
        </div>

        <div class="inputWithIcon">
            <input type="text" placeholder="Phone Number" onkeypress="return soloNumeros(event)">
            <i class="fa fa-phone fa-lg fa-fw" aria-hidden="true"></i>
        </div>
          <br>
          <br>
        <div class="inputWithIcon inputIconBg">
            <input type="text" placeholder="Your name" onkeypress="return soloLetras(event)"> 
            <i class="fa fa-user fa-lg fa-fw" aria-hidden="true"></i>
        </div>

        <div class="inputWithIcon inputIconBg">
            <input type="text" placeholder="Email">
            <i class="fa fa-envelope fa-lg fa-fw" aria-hidden="true"></i>
        </div>

        <div class="inputWithIcon inputIconBg">
            <input type="text" placeholder="Phone Number">
            <i class="fa fa-phone fa-lg fa-fw" aria-hidden="true" onkeypress="return soloNumeros(event)"></i>
        </div>
          <br>
          <br>
        <input type="text" placeholder="Age" onkeypress="return soloNumeros(event)">
    </body>
<script>
    function soloNumeros(e) {
              var key = window.Event ? e.which : e.keyCode
              return (key >= 48 && key <= 57)
        }
        
   function soloLetras(e){
       key = e.keyCode || e.which;
       tecla = String.fromCharCode(key).toLowerCase();
       letras = " áéíóúabcdefghijklmnñopqrstuvwxyz";
       especiales = "8-37-39-46";

       tecla_especial = false
       for(var i in especiales){
            if(key == especiales[i]){
                tecla_especial = true;
                break;
            }
        }
        if(letras.indexOf(tecla)==-1 && !tecla_especial){
            return false;
        }
       }
</script>
</html>
