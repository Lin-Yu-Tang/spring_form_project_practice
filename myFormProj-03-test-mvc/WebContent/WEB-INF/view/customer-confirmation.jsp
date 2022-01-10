<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE=html>
<html>
<head>
	<title>Customer Confirmation</title>
</head>
<body>
	<h3>問卷結果</h3>
	
	<form:form action="submit-success" modelAttribute="customer" method="POST">
	<br><br>
	<p>
	姓名: ${customer.theName}
	<form:hidden path="theName" value="customer.theName" />
	<br><br>
	性別: ${customer.gender}
	<form:hidden path="gender" value="customer.gender" />
	<br><br>
	Email: ${customer.email}
	<form:hidden path="email" value="customer.email" />
	<br><br>
	身分證字號: ${customer.identity}
	<form:hidden path="identity" value="customer.identity" />

	<br><br>


	</p>
	
	<input name="action" onclick="history.back()" type="submit" value="回到上一頁"/>	<input type="submit" value="提交表單" class="save" />
	</form:form>
	
	
</body>
</html>
