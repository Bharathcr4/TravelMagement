<%@page import="dao.RouteDao"%>
<%@page import="dao.RouteDao"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title>delroute.jsp</title>

        <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
        <meta http-equiv="description" content="this is my page">
        <meta http-equiv="content-type" content="text/html; charset=ISO-8859-1">

        <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

    </head>

    <style>
        html { 
            background: url(images/route.png) no-repeat center center fixed; 
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            background-size: cover;
        }
        h1 {font-family:Times New Roman; font-size:60px;font-weight:bold;text-align:center; color:#A52A2A;}
        table, th, td {
            font-size:30px;
            color:008080;
        }
        th, td {
            padding:20px;
        }
    </style>
</head>

<body>
    <center><h1>DELETE ROUTE</h1></center>
    <center>
        <form action="DeleteRoute" method="POST">
            <select name="id">
                <% RouteDao route = new RouteDao();%>
                <% for (int i=0;i<route.getAllRoute().size(); i++){ %>
     <option value="<%=route.getAllRoute().get(i).getId()%>"><%=route.getAllRoute().get(i).getRoutefrom()%></option>
     <%}%>
            </select>
         <button type='submit'>SUBMIT</button>
    </center>
       </form>
<style>
    button {
        background-color:#A2AB58;
        font-family:Cursive;;
        font-size:20px;
        color:#ff0;
        padding: 12px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 10%;
    }
    select {
        width:353px;
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
    </body>
    </html>