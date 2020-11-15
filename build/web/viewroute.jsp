<%@page import="dao.RouteDao"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title>view.jsp</title>

        <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
        <meta http-equiv="description" content="this is my page">
        <meta http-equiv="content-type" content="text/html; charset=ISO-8859-1">

        <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

        <style>
            html { 
                background: url(images/route.gif) no-repeat center center fixed; 
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;
                background-size: cover;
            }
            h1 {font-family:Times New Roman; font-size:60px;font-weight:bold;text-align:center; color:#A52A2A;}
            table, th, td {
                font-size:30px;
                color:black;
            }
            th, td {
                padding:20px;
            }
        </style>
    </head>
    <% RouteDao routeDao = new RouteDao();%>
    <body>
        <center><h1>VIEW ROUTES</h1></center>
        <center><table border="2px">
                <tr>
                    <th>From</th>
                    <th>To</th>
                    <th>Dateoftravel</th>
                    <th>Vehiclenum</th>
                    <th>Vehicletype</th>
                </tr>
                <% for (int i=0;i<routeDao.getAllRoute().size();i++) {%>
                <tr>
                    <td><%=routeDao.getAllRoute().get(i).getRoutefrom()%></td>
                    <td><%=routeDao.getAllRoute().get(i).getRouteto()%></td>
                    <td><%=routeDao.getAllRoute().get(i).getDateoftravel()%></td>
                    <td><%=routeDao.getAllRoute().get(i).getVehiclenum()%></td>
                    <td><%=routeDao.getAllRoute().get(i).getVehicletype()%></td>
                </tr>
                <%}%>
            </table>
        </center>
    </body>
</html>
