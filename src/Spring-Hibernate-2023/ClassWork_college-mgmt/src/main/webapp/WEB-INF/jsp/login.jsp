<%@ taglib uri = "jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>: : Login here : :</title>
    <link rel="stylesheet" href="style.css">
    <style>

        .success {
            color: green;
        }

        .invalid {
            color: red;
        }

    </style>
  </head>
  <body>
    <main>

        <c:if test="${not empty registerSuccess}">
            <div class="success">Registered User Successfully! Please Login..</div>
        </c:if>
        <c:if test="${not empty invalidCreds}">
             <div class="invalid">Incorrect Username / Password</div>
        </c:if>

            <h2>Login here! (${greeting})</h2>
        <form method="POST" action="/login">
            <p>
                <input placeholder="Username" name="username">
            </p>
            <p>
                <input placeholder="Password" type="password" name="password">
            </p>
            <p>
                <input type = "submit" value="Login">
                <a href="/register" Style="text-decoration: none;">Register here!</a>
            </p>
        </form>

    </main>
  </body>
</html>