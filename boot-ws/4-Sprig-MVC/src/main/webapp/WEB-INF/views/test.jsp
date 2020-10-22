<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Test.jsp</h1> <hr/>
<h2>Welcome dear ${pname} </h2>
<h2>Cities:: ${myCities}</h2>
<hr/>

<c:forEach var="cityName" items="${myCities}">
	<li>${cityName} </li>
</c:forEach>

</body>
</html>