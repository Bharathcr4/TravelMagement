<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>addroute.jsp</title>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=ISO-8859-1">

    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

  </head>
 <style>
html { 
  background: url(images/c1.jpeg) no-repeat center center fixed; 
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
  padding:10px;
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
label[for=form-switch]{
  background-color:#008080;
  font-size:30px;
  font-family:Times New Roman;
  font-weight:bold;
  color:white;
  padding:12px 20px;
 
}
</style>
<center><h2>Add Route</h2></center>
<form id='routeadd' action="Route" method='post'>
<center><input name="routefrom" type="text" placeholder="From" required></center></br>
  <center><input name="routeto" type="text" placeholder="To" required></center></br>
  <center><input name="vehiclenum" type="text" placeholder="Vehicle Num" required></center></br>
 <center><input name="vehicletype" type="text" placeholder="Vehicle Type" required></center></br>
  <center><input name="dateoftravel" type="text" placeholder="Date of travel" required></center></br>
 <center><button type='submit'>SUBMIT</button></center>
  </form>
  </html>
 