<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE=html>
<html>
<head>
	<title>問卷表單</title>
	
	<style>
		.error {color:red}
	</style>
</head>
<body>
	<h3>問卷表單</h3>
	<br><br>
	
	<div>
	<h4>基本資料</h4>
	<form:form action="processForm" modelAttribute="customer" method="POST">
	
	<div>
	<br><br>
	姓名 : <form:input path="theName"/>
	<form:errors path="theName" cssClass="error" />
	
	<br><br>
	性別 : <br>
	女 <form:radiobutton path="gender" value="女" />
	男 <form:radiobutton path="gender" value="男" />
	<form:errors path="gender" cssClass="error" />
	
	<br><br>
	<label for="email">電子郵件信箱(Email): </label>
	<input type="email" id="email" name="email">
	<form:errors path="email" cssClass="error" />
	
	<br><br>
	身分證號 : <form:input path="identity" />
	<form:errors path="identity" cssClass="error" />


	<br><br>
	
	</div>
	
	<br><br>
	<input type="submit" value="提交表單" />
	</form:form>
	</div>


</body>
</html>








