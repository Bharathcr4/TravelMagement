<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>index.jsp</title>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=ISO-8859-1">
    </head>
   <html>
<head>
<title>Login Page</title>
</head>
<style>
html { 
  background: url(images/v11.jpeg) no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}
table,td {
  font-size:30px;
  color:silver;
  }
  td {
  padding:2px;
  }
  input{
  width:50%;
  color:silver;
  background-color:3cb371;
  font-family:Times New Roman;
  font-size:15px;
  padding: 1px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #black;
  box-sizing: border-box;
}
</style>
<body bgcolor="">
<center><img src="images/v2.png" alt="v2" style="width:18%;"></center>
<html>
<head>
<title>Login Page</title>
</head>
<body>
<form name="loginForm" method="post" action="adminhomepage.jsp">
<table width="20%" bgcolor="" align="center">
<tr>
<td colspan=2><center><font size=6><b>ADMIN LOGIN</b></font></center></td>
</tr>

<tr>
<td>Username:</td>
<td><input type="text" size=25 name="userid"></td>
</tr>

<tr>
<td>Password:</td>
<td><input type="Password" size=25 name="pwd"></td>
</tr>

<tr>
<td ><input type="Reset"></td>
<td><input type="submit" onclick="return check(this.form)" value="Login" a href="adminhomepage.jsp"></a></td>
</tr>

</table>
</form>
<script language="javascript">
function check(form)
{

if(form.userid.value == "admin" && form.pwd.value == "12345")
{
	return true;
}
else
{
	alert("Error Password or Username")
	return false;
}
}
</script>

</body>
</html>

   