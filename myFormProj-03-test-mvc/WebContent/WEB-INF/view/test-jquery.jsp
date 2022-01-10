<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<title>Test in jQuery</title>
	<script src="../js/jQuery/jquery-3.5.1.min.js"></script>
	<script> 
	$(document).ready(function(){
	  $("#flip").click(function(){
	    $("#panel").slideDown("slow");
	  });
	});
	</script>
	<style> 
		#panel, #flip {
		  padding: 5px;
		  text-align: center;
		  background-color: #e5eecc;
		  border: solid 1px #c3c3c3;
		}
		
		#panel {
		  padding: 50px;
		  display: none;
		}
	</style>
	
</head>
<body>

	<div id="flip">Click to slide down panel</div>
	<div id="panel">Hello world!</div>





</body>
</html>