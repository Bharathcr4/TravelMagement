<%@page import="dao.BookDao"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<head>
    <title>Cancel.jsp</title>

    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=ISO-8859-1">


    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

<head>
    <style>
        html { 
            background: url(images/it1.jpg) no-repeat center center fixed; 
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            background-size:cover;
        }
        input {
            margin-bottom:10px;
            padding:10px;
            width: 20%;
            border:5px solid grey;
        }
        button[type=submit] {
            background-color:green;
            font-size:20px;
            font-family:Times New Roman;
            font-weight:bold;
            color:white;
            padding:12px 20px;
        }
        button[type=reset] {
            background-color:green;
            font-size:20px;
            font-family:Times New Roman;
            font-weight:bold;
            color:white;
            padding:12px 20px;
        }
        h2 {font-family:Times New Roman; font-size:60px;font-weight:bold;text-align:center; color:#f5eef8;}
      table, th, td {
                font-size:30px;
                color:fff8dc;
            }
            th, td {
                padding:20px;
            }
    </style>
<center>
</style>
<head>
<body>
    <% BookDao bookDao = new BookDao(); %>
    <center><h2>CANCEL VEHICLE</h2></center>
    <center>
        <form action="CancelBook" method="POST">
        <table border="2px">
            <tr>
                <th>Name</th>
                <th>From</th>
                <th>To</th>
                <th>Dateoftravel</th>
                <th>Pickuppoint</th>
                <th>Action</th>
                    <% for (int i = 0; i < bookDao.getAllBook().size(); i++) {%>
            <tr>
                <td><%=bookDao.getAllBook().get(i).getName()%></td>
                <td><%=bookDao.getAllBook().get(i).getRoutefrom()%></td>
                <td><%=bookDao.getAllBook().get(i).getRouteto()%></td>
                <td><%=bookDao.getAllBook().get(i).getDateoftravel()%></td>
                <td><%=bookDao.getAllBook().get(i).getPickuppoint()%></td>
            <input name="id" type="text" value="<%=bookDao.getAllBook().get(i).getId()%>" hidden />
            <%=bookDao.toString()%>
                   <td><button type="submit">Cancel</button></td>
            </tr>

            <%}%>
        </table>
        </form>
    </center>
</body>
</html>