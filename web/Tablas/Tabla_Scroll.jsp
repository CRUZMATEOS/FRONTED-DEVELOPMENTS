<%-- 
    Document   : TABLA-RESPONSIVE-SCROLL-THEAD-FIXER
    Created on : 13/10/2019, 04:23:33 PM
    Author     : Luis Mateos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- API Bootstrap -->
        <link data-require="bootstrap@*" data-semver="3.3.7" rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
        <!-- Estilos tablas -->
        <link href="../lib/css/tablas/table_scroll.css" rel="stylesheet" type="text/css"/>
        <!-- Js tablas -->
        <script src="../lib/js/tablas/table_scroll.js" type="text/javascript"></script>
        <!-- Buscador tabla -->
        <script src="../lib/js/tablas/table_doSearch.js" type="text/javascript"></script>
        
        <title>Tabla Responsive Thead Fixer</title>   
    </head>
    <body>
        <div class="row">
           <center><h1 class="box-title m-b-0"><font size = "4"><strong>Allocation Cost</strong> del 01&nbsp;<strong>al</strong>&nbsp;11</font></h1></center>
        </div>
        <div class="row"> 
            <div class="col-sm-5">
                <div class="form-group">
                    <input id="input_name" name="input_name" type="hidden" value="">
                </div>
            </div>
            <div class="col-sm-6 text-right m-b-20">
                <div id="example_filter" class="dataTables_filter">
                    <button onclick="descargar()" style="background: transparent;border: 0;"><img src="../img/excel.png"  width="8%" alt="Exportar"/></button>
                </div>
            </div> 
        </div>  
        <br>
        <div class="row"> 
            <div class="col-sm-6">
                <div class="form-group">
                    <input id="input_name" name="input_name" type="hidden" value="">
                </div>
            </div>
            <div class="col-sm-6 text-right m-b-20">
                <div id="example_filter" class="dataTables_filter">
                    <label>
                        Busqueda:
                        <input id="searchTerm" type="text" onkeyup="doSearch()" style="text-transform:uppercase;"/>
                    </label>
                </div>
            </div> 
        </div>
        <div class='table-cont' id='table-cont'>
            <table id="demo-foo-pagination" class="table table-striped">
                <thead>
                    <tr>
                        <th><center><font size = "2">GUIA DE EMBARQUE</font></center></th>
                        <th><center><font size = "2">MARCA</font></center></th>
                        <th><center><font size = "2"># DE CARTONES</font></center></th>
                        <th><center><font size = "2">PIEZAS</font></center></th>
                        <th><center><font size = "2">FLETE PRECARGADO EN SISTEMA</font></center></th>
                        <th><center><font size = "2">CUSTODIA</font></center></th>
                        <th><center><font size = "2">FLETE PRECARGADO + CUSTODIA</font></center></th>
                        <th><center><font size = "2">FREIGHT ALLOCATION x CARTON x EMBARQUE</font></center></th>
                        <th><center><font size = "2">FREIGHT ALLOCATION x PZA x EMBARQUE</font></center></th>
                        <th><center><font size = "2">NUMERO DE FACTURA (Proveedor)</font></center></th>
                        <th><center><font size = "2">MONTO AUTORIZADO</font></center></th>
                        <th><center><font size = "2">MONTO CUSTODIA AUTORIZADO</font></center></th>
                        <th><center><font size = "2">MONTO AUTORIZADO + CUSTODIA</font></center></th></th>
                        <th><center><font size = "2">FREIGT ALLOCATION REAL x CARTÓN</font></center></th>
                        <th><center><font size = "2">FREIGT ALLOCATION REAL x PZA</font></center></th>
                        <th><center><font size = "2">MONTO FACTURA LEVICOM</font></center></th>
                        <th><center><font size = "2">% IMPORTE DE FLETE VS FACTURA</font></center></th>
                        <th><center><font size = "2">FOLIO DE LIBERACIÓN</font></center></th>
                        <th><center><font size = "2">FOLIO DE LIQUIDACIÓN</font></center></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Marks</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                    </tr>
                    <tr>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                    </tr>
                    <tr>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                    </tr>
                    <tr>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                    </tr>
                    <tr>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                    </tr>
                    <tr>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                    </tr>
                    <tr>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                    </tr>
                    <tr>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                    </tr>
                    <tr>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                    </tr>
                    <tr>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                    </tr>
                    <tr>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                    </tr>
                    <tr>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                    </tr>
                    <tr>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                    </tr>
                    <tr>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                    </tr>
                    <tr>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                    </tr>
                    <tr>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                    </tr>
                    <tr>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                    </tr>
                    <tr>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                    </tr>
                    <tr>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                    </tr>
                    <tr>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                    </tr>
                    <tr>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                        <td><center>Mark</center></td>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>
