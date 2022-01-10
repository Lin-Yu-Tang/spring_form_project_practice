<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>Hello World - Input Form</title>
	
	<style>
		table, th, td {
		  border: 1px solid black;
		  border-collapse: collapse;
		}
	</style>
</head>

<body>
	<h1>Hello World - Welcome to my form</h1>
	<h3>歡迎註冊</h3>
	<form action="processFormVersionOne" method="GET">
		
		<input type="text" name="customerName"
			placeholder="What's your name?"/>
	
		<input type="submit" value="送出查詢"/>
		
	</form>
	
<p>
<h3>Normal Form</h3>

<table style="width:100%">
	<tr>
		<th>表頭1</th>
		<th>表頭2</th>
	</tr>
	
	<tr>
		<td>data1</td>
		<td>data2</td>
	</tr>

</table>

	

</body>

</html>