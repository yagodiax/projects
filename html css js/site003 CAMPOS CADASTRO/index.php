<?php
if($_SERVER['REQUEST_METHOD']==='POST'){
$usuario = $_POST["login"];
$senha = $_POST["senha"];
$bancodedados = $_POST["bancodedados"];
$local = $_POST["local"];
$mysqli = new mysqli ($local, $usuario, $senha,
$bancodedados);
if ($mysqli->connect_errno)
{
echo("conexão mal sucedida");
}
else{
echo ("conexão realizada com sucesso");
}
}
?>