<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Blogger</title>
<style>

h1, h5 {
	display: inline-block;
	vertical-align: top;
	padding: 20px 0;
}
</style>
<script type="text/javascript">
	function showDiv() {
		document.getElementById('add').style.display = "block";
	}
	
</script>
</head>

<body
	background="${pageContext.request.contextPath}/resources/images/bg.jpg">
	<header>
		<div class="image">
			<img
				src="${pageContext.request.contextPath}/resources/images/blog.png"
				width="120px">
			<h1>
				<font color="blue" face="Footlight MT">BLOG KARLO </font>
			</h1>
			<h5>stage to express</h5>
		</div>
	</header>
	<div class="menu">
		<a href="#"><input type="button" value="HOME"
			style="color:white; width: 10em; height: 2em; background-color: blue;"></a>
		<input type="text" id="search" style="width: 30em; height: 2em;">
		<a href="#"><input type="button" value=" Search"
			style="color:white;background-color: blue; width: 10em; height: 2em;"></a>
		<a href="#" style=" float: right"><input type="button"
			onclick="showDiv()" value=" &#10051; Add A Blog"
			style="height: 2em;color:white; background-color: blue;"></a>
	</div>
	<hr style="color: red">
	<div id="add" style="display: none; width: 100%;">
		<form action="">
			<table align="center" border="purple" style="text-align: center; text-decoration:inherit; border:thick;">
				<tr>
				<td>Blog Title &#10157;</td>
				<td><input type="text"></td></tr>
				<tr>
				<td>Blog Short Desc &#10157;</td>
				<td><input type="text"></td></tr>
				<tr>
				<td>Blog Long Desc &#10157;</td>
				<td><input type="text"></td></tr>
				<tr>
				<td>Blog Image &#10157;</td>
				<td><input type="file"></td></tr>
				<tr>
				<td>Blog Video &#10157;</td>
				<td><input type="file"></td></tr>
				<tr>
				<td colspan="2"><blink><input type="submit" style="background-color: orange;" value="Post Blog"></blink></td></tr>
			</table>
		</form>
	</div>
	
	<div class="contents">
	

	
	</div>
	
</body>

</html>
