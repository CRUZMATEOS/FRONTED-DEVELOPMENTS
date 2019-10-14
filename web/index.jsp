<%-- 
    Document   : index
    Created on : 13/10/2019, 04:19:48 PM
    Author     : Luis Mateos
--%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Formulario</title>
        <!-- Estilos botones -->
        <link href="lib/css/Login/boton.css" rel="stylesheet" type="text/css"/>
        <!-- Estilos font-awesome iconos -->
        <link href="lib/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <!-- Estilos principales del formulario -->
        <link href="lib/css/Login/formulario.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="menu">
            <ul>
                <li><a href="#" class="active">Iniciar Sesión</a></li>
                <li><a href="#">Registrarse</a></li>
            </ul>
        </div>
        <div id="formularios">
            <form action="" id="form_session">

                <p>Correo electrónico:</p>
                <div class="field-container">
                    <i class="fa fa-envelope-o fa-lg" aria-hidden="true"></i>	
                    <input type="text" class="field" placeholder="user@example.com"> <br/>
                </div>

                <p>Contraseña:</p>
                <div class="field-container">
                    <i class="fa fa-key fa-lg" aria-hidden="true"></i>	
                    <input type="password" class="field" placeholder="*******"> <br/>
                </div>
                <p class="center-content">
                    <input type="submit" class="btn btn-green" value="Iniciar sesión"> <br/><br/>
                </p>
            </form>	

            <form action="" id="form_register">

                <div class="columns">
                    <div class="field-container">
                        <p> Nombre:</p>
                        <i class="fa fa-user-circle fa-lg" aria-hidden="true"></i>	
                        <input type="text" class="field" placeholder=" "> <br/>
                    </div>
                    <div class="field-container">
                        <p> Apellido:</p>
                        <i class="fa fa-user-circle fa-lg" aria-hidden="true"></i>	
                        <input type="text" class="field" placeholder="..."> <br/>
                    </div>

                </div>


                <p>Correo electrónico:</p>
                <div class="field-container">
                    <i class="fa fa-envelope-o fa-lg" aria-hidden="true"></i>	
                    <input type="text" class="field" placeholder="user@example.com"> <br/>
                </div>

                <p>Contraseña:</p>
                <div class="field-container">
                    <i class="fa fa-key fa-lg" aria-hidden="true"></i>	
                    <input type="password" class="field" placeholder="*******"> <br/>
                </div>

                <div class="columns">
                    <div class="field-container">
                        <p> Compañía:</p>
                        <i class="fa fa-building fa-lg" aria-hidden="true"></i>	
                        <input type="text" class="field" placeholder="Microsoft"> <br/>
                    </div>
                    <div class="field-container">
                        <p> Teléfono:</p>
                        <i class="fa fa-phone fa-lg" aria-hidden="true"></i>	
                        <input type="text" class="field" placeholder="+52 55..."> <br/>
                    </div>

                </div>
                <p class="center-content">
                    <input type="submit" class="btn btn-green" value="Crear cuenta">
                </p>
            </form>	
        </div>
        <!-- Funciones principales del formulario -->
        <script src="lib/js/Login/jquery.js" type="text/javascript"></script>
        <script>
            $(function () {
                $("#menu li").on("click", function () {
                    var i = $(this).index();
                    $("#formularios form").hide();
                    $("#formularios form").eq(i).show();
                    $("#menu li a").removeClass("active");
                    $(this).find("a").addClass("active");
                });
            });
        </script>
    </body>
</html>



