<%@page import="dao.VehicleDao"%>
<%@page import="model.Vehicle"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=iso-8859-1" language="java" %>
<html>
  <head>
    <title>View vehicle.jsp</title>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=ISO-8859-1">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

  </head>
  
   <style>
html { 
  background: url(images/h1.jpg) no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size:cover;
}
  h1 {font-family:Times New Roman; font-size:60px;font-weight:bold;text-align:center; color:#A52A2A;}
  table, th, td {
  font-size:30px;
  color:008080;
  }
  </style>
  </head>
  
  <% VehicleDao vehicleDao = new VehicleDao(); %>
  <body>
  <center><h1>VIEW VEHICLES</h1></center>
  <center>
 <select>
     <% for (int i=0;i<vehicleDao.getAllVehicle().size(); i++){ %>
     <option value="<%=i%>"><%=vehicleDao.getAllVehicle().get(i).getVehiclename()%></option>
     <%}%>
    
     <%--
    <option value="1">INNOVA<option>
    <option value="2">INDICO</option>
    <option value="3">ETIOS</option>
    <option value="4">SWIFT DZIRE</option>
    <option value="5">TEMPO TRAVELLER</option>
<option value="6">MINI BUS</option> --%>
  </select></center>
  <center>
    <button type="submit">VIEW</a></button>
    <button type="reset" class="resetbtn">CLEAR</button>
    </center>
  <style>
  button {
  background-color:#A2AB58;
  font-family:Cursive;;
  font-size:20px;
  color:black;
  padding: 12px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 10%;
}
  select {
width:353px;
height:70px;
padding:12px;
margin-top:8px;
font-family:Cursive;
line-height:1;
border-radius:5px;
background-color:#A2AB58;
color:#ff0;
font-size:20px;
}
  
  </style>
</head>
</html>