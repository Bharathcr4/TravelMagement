<%@page import="dao.VehicleDao"%>
<html>
    <head>
        <title>userviewvehicl.jsp</title>

        <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
        <meta http-equiv="description" content="this is my page">
        <meta http-equiv="content-type" content="text/html; charset=ISO-8859-1">

        <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

        <style>
            html { 
                background: url(images/tt1.jpg) no-repeat center center fixed; 
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;
                background-size:cover;
            }
            h1 {font-family:Times New Roman; font-size:60px;font-weight:bold;text-align:center; color:#A52A2A;}
            table, th, td {
                font-size:30px;
                color:red;
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
                   
                    <th>Vehicle Name</th>
                    <th>Price/Km</th>
                </tr>
                <tr>
                    
                </tr>
                <tr>
                    <td>Etios Platinum</td>
                    <td>10Rs 300km minimum perday</td>
                </tr>
                <tr>
                    <td>Etios Liva</td>    
                <td>9Rs 300km minimum perday</td>
                </tr>
                <tr>
                    <td>Innova</td>
                    <td>13Rs 300km minimum perday</td>
                </tr>
                <tr>
                    <td>Tempo Traveller</td>
                    <td>14Rs 300km minimum perday</td>
                </tr>
                <tr>
                    <td>Mini Bus</td>
                    <td>19Rs 300km minimum perday</td>
                </tr>
            </table>
        </center>
    </body>
</html>
