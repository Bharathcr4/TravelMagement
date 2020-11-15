<%@page import="dao.VehicleDao"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=iso-8859-1" language="java" %>
<html>
    <head>
        <title>view.jsp</title>

        <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
        <meta http-equiv="description" content="this is my page">
        <meta http-equiv="content-type" content="text/html; charset=ISO-8859-1">

        <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

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
                color:fff8dc;
            }
            th, td {
                padding:20px;
            }
        </style>
    </head>
    <% VehicleDao vehicleDao = new VehicleDao(); %>

    <body>
        <center><h1>VIEW VEHICLE</h1></center>
        <center><table border="2px">
                <tr>
                    <th>Travel Id</th>
                    <th>Vehicle Name</th>
                    <th>Driver Name</th>
                    <th>Phone Number</th>

                    <% for (int i = 0; i < vehicleDao.getAllVehicle().size(); i++) { %>

                <tr>
                    <td><%=i%></td>
                    <td><%=vehicleDao.getAllVehicle().get(i).getVehiclename()%></td>
                    <td><%=vehicleDao.getAllVehicle().get(i).getDrivername()%></td>
                    <td><%=vehicleDao.getAllVehicle().get(i).getPhonenumber()%></td>
                </tr>

                <%}%>
            </table>
        </center>
    </body>
</html>
