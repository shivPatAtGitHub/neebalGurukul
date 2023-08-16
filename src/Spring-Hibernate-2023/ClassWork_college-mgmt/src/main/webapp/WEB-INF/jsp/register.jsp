<%@ taglib uri = "jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>: : Register here : :</title>
    <link rel="stylesheet" href="style.css">
  </head>
  <body>
    <main>
        <h2>Register here! (${greeting} again)</h2>

        <form method="POST" action="/register">
            <p>
                <input placeholder="Username" name="username">
            </p>
            <p>
                <input type="password" placeholder="Password" name="password">
            </p>
            <p>
                <label>Choose a Country</label>
                <select name="country">
                    <c:forEach items = "${countries}" var="country">
                        <option>${country}</option>
                    </c:forEach>
                </select>
            </p>
            <p>Gender</p>
            <p>
                <input type="radio" name="gender" value="m">
                <label>Male</label>
                <input type="radio" name="gender" value="f">
                <label>Female</label>
            </p>
            <p>
                <input type = "submit" value = "Register">
            </p>
        </form>

    </main>
  </body>
</html>