<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>
<html>
<head>

</head>

<body>
<form:form action="processForm" modelAttribute="student">

First Name: <form:input type="text" path="firstName"/>

<br><br>

Last Name: <form:input type="text" path="lastName"/>

<br><br>

Country: <form:select path="country">
         <form:options items="${student.getCountryOptions() }"/>
         
  </form:select>
  
  <br><br>

<input type="submit" value="submit" />

</form:form>
 
</body>

</html>