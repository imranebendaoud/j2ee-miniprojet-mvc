<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inscription</title>
</head>
<link rel="stylesheet" href="css/test.css" type="text/css">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">


<body>
   <div class="container">
      <div class="col-md-6 mx-auto text-center">
         <div >
            <h1 class="wv-heading--title">
               Inscrivez-vous
            </h1>
            
         </div>
      </div>
      <div class="row">
         <div class="col-md-4 mx-auto">
            <div class="myform form ">
<form method="post" action="RegisterServlet" class="needs-validation" name="login">
                  <div class="form-group">
                     <input type="text" name="nom"  class="form-control my-input" id="name" placeholder="Nom" required>
                  </div>
                  <div class="form-group">
                     <input type="text" name="prenom"  class="form-control my-input" id="prenom" placeholder="Prénom" required>
                  </div>
                  <div class="form-group">
                     <input type="text" name="adresse"  class="form-control my-input" id="adresse" placeholder="Adresse" required>
                  </div>
                  <div class="form-group">
                     <input type="email" name="email"  class="form-control my-input" id="email" placeholder="Email" required>
                  </div>
                  <div class="form-group">
                     <input type="number" min="0" name="tel" id="tel"  class="form-control my-input" placeholder="Telephone" required>
                  </div>
                  <div class="form-group">
                     <input type="password" min="0" name="password" id="password"  class="form-control my-input" placeholder="Password" required>
                  </div>
                  <div class="text-center ">
                     <button type="submit" class=" btn btn-block send-button tx-tfm">S'inscrire</button>
                  </div>
                  <div class="col-md-12 ">
                     <div class="login-or">
                        <hr class="hr-or">
                        <span class="span-or">or</span>
                     </div>
                  </div>
                  <div class="form-group">
                     <a class="btn btn-block g-button" href="identif1.jsp">
                      S'identifier
                     </a>
                  </div>
                  
               </form>
            </div>
         </div>
      </div>
   </div>
</body>
</html>