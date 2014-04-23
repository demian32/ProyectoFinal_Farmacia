<!DOCTYPE html> 
<html>
<head>
<meta charset="utf-8">
<title>SuperFarmacia :P</title>
<link href="jquery.mobile-1.0.min.css" rel="stylesheet" type="text/css"/>
<script src="jquery-1.6.4.min.js" type="text/javascript"></script>
<script src="jquery.mobile-1.0.min.js" type="text/javascript"></script>
</head> 
<body> 

<div data-role="page" id="inicio" data-theme="b">
	<div data-role="header">
		<h1>Farmaciaaa</h1>
	</div>
	<div data-role="content">	
	<div align="center">
    <img src="user.png" width="200" height="200">
    </div>
    </div>
    <div align="center">
        <form action="ServletAutenticar"  method="post">
	<div data-role="fieldcontain">
	  <label for="textinput">Usuario: &nbsp &nbsp &nbsp </label>
	  <input type="text" name="usuario" id="usuario" value=""  />
  </div>
	<div data-role="fieldcontain">
	  <label for="passwordinput">Contraseña:   </label>
      <input type="password" name="contra" id="contra" value=""  />
  </div>
  
        <div><input type="submit" value="Entrar" id="entrar" />
           
        </div>
                
   
            
        </form>
        <div >
            <h1>    ${valor} </h1>
        </div>
   </div>
	<div data-role="footer" data-position="fixed">
		<h4>Farmacia(Integrantes Demian y Alejandro)</h4>
	</div>
</div>
    </body>
</html>
