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
  
  <ul> <li><a class="glyphicon glyphicon-log-in" href="/login"> Login</a></li>
      <li><a class="glyphicon glyphicon-sign-up" href="/sign-up"> Register</a></li>
      <li><a class="glyphicon glyphicon-home" href="/home">Home</a></li>
      <li><a class="glyphicon glyphicon-student-accounts" href="/student-accounts"> Accounts</a></li>
      </ul>
      

  <main role="main" class="inner cover">
    <h1 class="cover-heading">Dealer Profile.</h1>
    <p class="lead">Thank you ${newStudent.firstName} ${newStudent.lastName} for signing up for this test page.</p>
   <p class="lead">You can sign into your account with email ${newStudent.email}.</p>
    <p class="lead">
      <a href="#" class="btn btn-lg btn-secondary">Learn more</a>
    </p>
  </main>

  <footer class="mastfoot mt-auto">
    <div class="inner">
      <p>Cover template for <a href="https://getbootstrap.com/">Bootstrap</a>, by <a href="https://twitter.com/mdo">@mdo</a>.</p>
    </div>
  </footer>
</div>


</body>

</html>
