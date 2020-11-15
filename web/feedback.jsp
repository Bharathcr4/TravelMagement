<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>delroute.jsp</title>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=ISO-8859-1">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
html { 
  background: url(images/a.jpg) no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px 20px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}
label{
background-color:grey;
  color:008080;
  font-family:Times New Roman;
  font-size:25px;
  border: none;
  }
  form {
  margin-right:200px;
  width:780px;
  padding:12px 20px;
  position:fixed;
  right:19%;
}
input[type=submit] {
  background-color: #4CAF50;
  color: white;
  font-family:Times New Roman;
  font-size:25px;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}
</style>
</head>
<body>
<style>
h1{font-family:Times New Roman; font-weight:bold;text-align:center;font-size:50px; color:008080;}
</style>

<h1>Feedback Form</h1>
  <form action="Feedback">
    <label for="fname">First Name</label>
    <input type="text" id="fname" name="firstname" placeholder="Your name..">
<label for="contactnum">Phone No</label>
    <input type="text" id="contactnum" name="cnum" placeholder="Phone no.">
    <label for="emailid">Email id</label>
    <input type="text" id="id" name="email" placeholder="email">


    <label for="subject">Write Something</label>
    <textarea id="subject" name="subject" placeholder="Write something.." style="height:200px"></textarea>

    <input type="submit" value="Submit">
  </form>
</body>
</html>
    