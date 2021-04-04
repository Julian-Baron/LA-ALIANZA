<%-- 
    Document   : datos_actualizar
    Created on : 1/04/2021, 07:17:43 PM
    Author     : Personal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
        <link rel="stylesheet" href="css/styles_header.css">

        <!--Font-->

        <link rel="preconnect" href="https://fonts.gstatic.com">


        <!--CSS-->
        <link rel="stylesheet" href="css/fonts.css">

        <!--ICONO-->
        <link rel="icon" href="img/alianza_1.png">
        
        <title>Actualizar datos</title>
    </head>
    <body>
        <!--CONTENEDOR DE FORMULARIO PARA LA ACTUALIZACION DE USUARIO-->
        <div class="container" id="container-first">
            <form method="POST" action="" name="datos-actualizar">
                <div class="row">
                
                    <div class="col">
                        <label class="form-label">NOMBRES</label>
                        <input type="text" class="form-control" placeholder="NOMBRES" aria-label="First name" name="" value="">
                    </div>
                    <div class="col">
                        <label class="form-label">APELLIDOS</label>
                        <input type="text" class="form-control" placeholder="APELLIDOS" aria-label="Last name" name="" value="">
                    </div>
                    <div class="mt-2">
                        <label class="form-label mt-3">CORREO ELECTRONICO</label>
                        <input type="email" class="form-control" placeholder="CORREO ELECTRONICO" aria-label="correo" name="" value="">
                        <label class="form-label mt-2">DIRECCION</label>
                        <input type="text" class="form-control" placeholder="DIRECCION" aria-label="direccion" name="" value="">
                        <label class="form-label mt-2">TELEFONO</label>
                        <input type="number" class="form-control" placeholder="TELEFONO" aria-label="telefono" name="" value="">
                        <label class="form-label mt-2">NOMBRE DE USUARIO</label>
                        <input type="text" class="form-control" placeholder="NOMBRE DE USUARIO" aria-label="usuario" name="" value="">
                        <label class="form-label mt-2">CONTRASEÑA</label>
                        <input type="text" class="form-control" placeholder="CONTRASEÑA" aria-label="contraseña" name="" value="">
                        <label class="form-label mt-2">SEXO</label>
                        <select type="text" class="form-control" placeholder="SEXO" aria-label="sexo" name="" value="">
                            <option selected>Sexo...</option>
                            <option >Masculino</option>
                            <option >Femenino</option>
                            <option >Otro..</option>
                        </select>
                        <label class="form-label mt-2">CEDULA</label>
                        <input type="number" class="form-control mt-2" placeholder="CEDULA" aria-label="CEDULA" name="" value="">
                    </div>                   
                    
                
                    <div class="col-9" style="">
                        <a href="index.jsp"><input type="submit" name="aceptar" class="btn btn-primary" value="Aceptar"></a>
                        <a href="index.jsp"><input type="submit" name="aceptar" class="btn btn-warning" value="Regresar"></a>
                    </div>
                
            </div>
            </form>
        </div>
        
    </body>
</html>
