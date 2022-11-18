<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<meta charset="ISO-8859-1">
<title>Profile Page</title>
</head>
<body class="bg-danger">
<div class="container-fluid">
<div class="row">
<div class="co-4 text-light"><h1>Welcome <span class="text-dark bg-light">${newUserDetails.empId.name }</span></h1></div>
<div class="col-3"></div>
<div class="col-6 bg-dark">
 <!-- Content here -->
  <nav class="nav nav-pills flex-column flex-sm-row">
  <a class="flex-sm-fill text-sm-center nav-link disabled" href="contact" >Contact</a>
  <a class="flex-sm-fill text-sm-center nav-link " href="logout">Logout</a>
  <a class="flex-sm-fill text-sm-center nav-link active" href="registration">Profile</a>
  <a class="flex-sm-fill text-sm-center nav-link disabled" href="#">Disabled</a>
</nav>

</div>
</div>
</div>
<div style="margin-top: 5%;" class="container justify-content-center">
<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Name</th>
      <th scope="col">Age</th>
      <th scope="col">Country</th>
      <th scope="col">Department</th>
      <th scope="col">Phone</th>
      <th scope="col">Sex</th>
      <th scope="col">Salary</th>
      <th scope="col">Email</th>
      <th scope="col">Password</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>${newUserDetails.empId.name}</td>
      <td>${newUserDetails.empId.age}</td>
      <td>${newUserDetails.empId.country}</td>
      <td>${newUserDetails.empId.department}</td>
      <td>${newUserDetails.empId.phone}</td>
      <td>${newUserDetails.empId.sex}</td>
      <td>${newUserDetails.empId.salery}</td>
      <td>${newUserDetails.email}</td>
      <td>${newUserDetails.password}</td>
      <td><a class="btn btn-danger disabled"  href="deleteUser" >Delete</a></td>
      <td><a class="btn btn-warning "  href="updateUser" >Update</a></td>
    </tr>
    
  </tbody>
</table>
</div>
</body>
</html>