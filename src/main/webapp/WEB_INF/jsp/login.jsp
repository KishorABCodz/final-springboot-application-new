<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<meta charset="ISO-8859-1">
<title>login page</title>
</head>

<body class="bg-danger">
<div class="container-fluid">
<div class="row">
<div class="co-3 text-light"><h1>Login Page</h1></div>
<div class="col-4"></div>
<div class="col-6 bg-dark">
 <!-- Content here -->
  <nav class="nav nav-pills flex-column flex-sm-row">
  <a class="flex-sm-fill text-sm-center nav-link" href="index">Home</a>
  <a class="flex-sm-fill text-sm-center nav-link active" href="login">login</a>
  <a class="flex-sm-fill text-sm-center nav-link" href="registration">register Here</a>
  <a class="flex-sm-fill text-sm-center nav-link disabled" href="#">Disabled</a>
</nav>

</div>
</div>
</div>
<div style="margin-top: 5%;padding-bottom: 5%;padding-top: 3%;" class="container justify-content-center bg-dark">
<form action="loginUser" class="was-validated" method="post">
  <div class="form-group">
    <label for="uemail " class="text-light">Email:</label>
    <input type="email" class="form-control" id="uemail" placeholder="Enter Email..." name="email" required>
    <div class="valid-feedback ">Valid.</div>
    <div class="invalid-feedback text-warning">Please fill out this field.</div>
  </div>
  <div class="form-group">
    <label class="text-light" for="pwd">Password:</label>
    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password" required>
    <div class="valid-feedback">Valid.</div>
    <div class="invalid-feedback text-warning">Please fill out this field.</div>
  </div>
  <div class="form-group form-check">
    <label class="form-check-label">
      <input class="form-check-input text-light" type="checkbox" name="remember" value="I agree" required> 
      <div class="valid-feedback">Valid.</div>
      <div class="invalid-feedback text-warning">Check this checkbox to continue.</div>
    </label>
  </div>
  <input type="submit" class="btn btn-inline-info text-info form-control">
</form>
</div>
</body>
</html>