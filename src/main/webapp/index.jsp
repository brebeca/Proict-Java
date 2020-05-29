<%@ page import="java.sql.*" %>
<%@ page import="com.test.models.Database" %>
<%@ page import="java.util.List" %>

<html>

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <title>Home</title>

</head>

<body>


<form method="post" action="login.jsp">

    <h2 style="color:green">JSP Login Example</h2>

    <table border="1" align="center">

        <tr>

            <td>Enter Your Name :</td>

            <td><input type="text" name="name"/></td>

        </tr>

        <tr>

            <td>Enter Your Password :</td>

            <td><input type="password" name="password"/></td>

        </tr>

        <tr>

            <td>Select UserType</td>

            <td><select name="usertype">

                <option value="select">select</option>

                <%
                   /* List<String> roles= (List<String>) request.getAttribute("roles");
                    for(String role :roles)
                    {
                        String usertype = role;*/
                    String usertype = (String) request.getAttribute("roles");
                %>
                <option value=<%=usertype%>><%=usertype%></option>
                <%
                     //   }
                %>

            </select>

            </td>

        </tr>

        <tr>

            <td></td>

            <td><input type="submit" value="submit"/></td>

    </table>

</form>

</body>

</html>