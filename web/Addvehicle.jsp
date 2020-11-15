<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Addvehicle.jsp</title>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=ISO-8859-1">

    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

  </head>
 <style>
 html { 
  background: url(images/c9.jpg) no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}
  </style>
  
  <body>
  <center>
  <style>
h2 {font-family:Times New Roman; font-size:60px;font-weight:bold;text-align:center; color:008080;}
  </style>
  </center>
  </body>
<style>
input {
  margin-bottom:10px;
  padding:10px 20px;
  width: 20%;
  border:5px solid grey;
}
button[type=submit]{
  background-color:green;
  font-size:20px;
  font-family:Times New Roman;
  font-weight:bold;
  color:white;
  padding:12px 20px;
  }
  button[type=reset]{
  background-color:green;
  font-size:20px;
  font-family:Times New Roman;
  font-weight:bold;
  color:white;
  padding:12px 20px;
  }
</style>
<center><h2>ADD VEHICLE</h2></center>
<form action="Vehicle" method='post'>
<center>
VEHICLE NAME   <input type="text" name="vehiclename"/><br/>
VEHICLE NUMBER <input type="text" name="vehiclenum"/><br/>
DRIVER NAME <input type="text" name="drivername"/><br/>
PHONE NUMBER <input type="text" name="phonenumber"/><br/>
  <button type='submit'>SUBMIT</button>
  <button type='reset'>CLEAR</button>
</center>
</form>
</html>
 