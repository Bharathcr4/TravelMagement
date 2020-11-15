<html>
<style>
html { 
  background: url(images/TR.jpg) no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}
form {
  margin-right:200px;
  width:450px;
  padding:12px 20px;
  position:fixed;
  top:35%;
  right:27%;
}
input {
  padding:12px 20px;
  width: 100%;
  margin:10px 0;
  box-sizing:border-box;
}
button {
  padding:12px 20px;
  margin-bottom:30px;
}
label {
  cursor:pointer
}
#form-switch {
  display:none
}
#register-form {
  display:none
}
#form-switch:checked~#register-form {
  display:block
}
#form-switch:checked~#login-form {
  display:none
}
</style>
<style>
button[type=submit]{
  background-color:#008080;
  font-size:15px;
  font-family:Times New Roman;
  font-weight:bold;
  color:white;
  padding:12px 20px;
  cursor: pointer;
  display:inline-block;
}
label[for=form-switch]{
  background-color:#008080;
  font-size:15px;
  font-family:Times New Roman;
  font-weight:bold;
  color:white;
  padding:12px 20px;
  cursor: pointer;
  display:inline-block;
}
</style>
</head>
<body >
<input type='checkbox' id='form-switch'>
<form action="Login" method='post'>
    <input name="username" type="text" placeholder="Username" required>
    <input name="password" type="password" placeholder="Password"  required>
  <button type='submit'>Login</button>
  <label for='form-switch'><span>Register</span></label>
</form>
<form id='register-form' action="Register" method='post'>
    <input name="uname" type="text" placeholder="Username" required>
    <input name="email" type="email" placeholder="Email" required>
    <input type="password" placeholder="Password" required>
    <input name="password" type="password" placeholder="Re Password" required>
  <button type='submit'>Register</button>
  <label for='form-switch'>Already Member ? Sign In Now..</label>
</form>
</body>
</html>
