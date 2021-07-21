<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
    <meta charset="utf-8">
    <title>Dealer Portal</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.4/examples/cover/">

    <!-- Bootstrap core CSS -->
<link href="https://getbootstrap.com/docs/4.4/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">


    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="cover.css" rel="stylesheet">
  </head>


<body class="text-center">
    <div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
<ul>  <li><a class="glyphicon glyphicon-log-in" href="/login"> Login</a></li>
      <li><a class="glyphicon glyphicon-sign-up" href="/sign-up"> Register</a></li>
      <li><a class="glyphicon glyphicon-home" href="/home">Home</a></li>
      <li><a class="glyphicon glyphicon-student-accounts" href="/student-accounts"> Accounts</a></li>
      </ul>
  <main role="main" class="inner cover">
     
     
     

<form:form action="/sign-up" modelAttribute="student" method="Post">
  <div class="form-row">
    <div class="form-group col-md-6">
    
      <label for="inputFirstName">First Name</label>
      <form:input path="firstName" type="text" class="form-control" id="inputFirstName"/>
    </div>
    <div class="form-group col-md-6">
      <label for="inputLastName">Last Name</label>
      <form:input path="lastName" type="text" class="form-control" id="inputLastName"/>
    </div>
  </div>
  
  
    <div class="form-row">
    <div class="form-group col-md-6">
      <label for="age">age</label>
      <form:input path="age" class="form-control"/>
    </div>
   <div class="form-group col-md-6">
      <label for="inputEmail4">Email</label>
      <form:input path="email" type="email" class="form-control" id="inputEmail4"/>
    </div>
  </div>
  
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputPassword4">Password</label>
      <form:input path="password" type="password" class="form-control" id="inputPassword4"/>
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress">Street</label>
    <form:input path="address.streetAddress" type="text" class="form-control" id="inputAddress" placeholder="1234 Main St"/>
  </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputCity">City</label>
      <form:input path="address.city" type="text" class="form-control" id="inputCity"/>
    </div>
    <div class="form-group col-md-4">
      <label for="inputState">State</label>
      <form:select path="address.state" id="inputState" class="form-control">
        <option selected>Choose...</option> 
        <option>AL</option><option>AK</option><option>AZ</option><option>AR</option><option>CA</option>
        <option>CO</option><option>CT</option><option>DE</option><option>DC</option><option>FL</option>
        <option>GA</option><option>GU</option><option>HI</option><option>ID</option><option>IL</option>
        <option>IN</option><option>IA</option><option>KS</option><option>KY</option><option>LA</option>
        <option>ME</option><option>MD</option><option>MA</option><option>MI</option><option>MN</option>
        <option>MS</option><option>MO</option><option>MT</option><option>NE</option><option>NV</option>
        <option>NH</option><option>NJ</option><option>NM</option><option>NY</option><option>NC</option>
        <option>ND</option><option>MP</option><option>OH</option><option>OK</option><option>OR</option>
        <option>PA</option><option>PR</option><option>RI</option><option>SC</option><option>SD</option>
        <option>TN</option><option>TX</option><option>UT</option><option>VT</option><option>VA</option>
        <option>VI</option><option>WA</option><option>WV</option><option>WI</option><option>WY</option>
      </form:select>
    </div>
    <div class="form-group col-md-2">
      <label for="inputzip">ZIP</label>
      <form:input path="address.zip" type="text" class="form-control" id="inputZip"/>
    </div>
  </div>

  <button type="submit" class="btn btn-primary">Sign up</button>
</form:form>


  </main>

  <footer class="mastfoot mt-auto">
    <div class="inner">
      <p>Cover template for <a href="https://getbootstrap.com/">Bootstrap</a>, by <a href="https://twitter.com/mdo">@mdo</a>.</p>
    </div>
  </footer>
</div>


</body>

</html>