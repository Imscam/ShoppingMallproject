<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<title>ShoppingMall Admin</title>

<script src="/resources/jquery/jquery-3.6.0.min.js"></script>

<link rel="stylesheet" href="/resources/bootstrap/bootstrap.min.css">
<link rel="stylesheet"
	href="/resources/bootstrap/bootstrap-theme.min.css">
<script src="/resources/bootstrap/bootstrap.min.js"></script>

<style>
body {
	font-family: '맑은 고딕', verdana;
	padding: 0;
	margin: 0;
}

ul {
	padding: 0;
	margin: 0;
	list-style: none;
}

div#root {
	width: 90%;
	margin: 0 auto;
}

header#header {
	font-size: 60px;
	padding: 20px 0;
}

header#header h1 a {
	color: #000;
	font-weight: bold;
}

nav#nav {
	padding: 10px;
	text-align: right;
}

nav#nav ul li {
	display: inline-block;
	margin-left: 10px;
}

section#container {
	padding: 20px 0;
	border-top: 2px solid #eee;
	border-bottom: 2px solid #eee;
}

section#container::after {
	content: "";
	display: block;
	clear: both;
}

aside {
	float: left;
	width: 200px;
}

div#container_box {
	float: right;
	width: calc(100% - 200px - 20px);
}

aside ul li {
	text-align: center;
	margin-bottom: 10px;
}

aside ul li a {
	display: block;
	width: 100%;
	padding: 10px 0;
}

aside ul li a:hover {
	background: #eee;
}

footer#footer {
	background: #f9f9f9;
	padding: 20px;
}

footer#footer ul li {
	display: inline-block;
	margin-right: 10px;
}
</style>

</head>
<body>
	<div id="root">
		<header id="header">
			<div id="header_box">
				<%@ include file="include/header.jsp"%>
			</div>
		</header>

		<nav id="nav">
			<div id="nav_box">
				<%@ include file="include/nav.jsp"%>
			</div>
		</nav>

		<section id="container">
			<aside>
				<%@ include file="include/aside.jsp"%>
			</aside>
			<div id="container_box">
				<h2>상품 정보</h2>
				<table border="1">
					<tr>
						<th rowspan="5"><img
							src="<c:url value='/resources/imgUpload/${boardVO.clothImage }' />"
							width="100" /></th>
					</tr>

					<tr>
						<th>옷 코드</th>
						<td>${boardVO.clothCode}</td>
					</tr>
					<tr>
						<th>옷 이름</th>
						<td>${boardVO.clothName}</td>
					</tr>
					<tr>
						<th>옷 사이즈</th>
						<td>${boardVO.clothSize}</td>
					</tr>
					<tr>
						<th>옷 가격</th>
						<td>${boardVO.clothPrice}</td>
					</tr>
					<tr>
						<th>옷 소개</th>
						<td colspan="2">${boardVO.clothInfo}</td>
					</tr>
					<tr>
						<th>옷 수량</th>
						<td>${boardVO.clothInventory}</td>
					</tr>

				</table>
				<div>


					<form action="<c:url value="/board/delete" />" method="post">
						<input type="hidden" value="${boardVO.clothNum}" name="clothNum" />
						<button type="submit" value="삭제" class="btn btn-outline-info">삭제</button>
					</form>


				</div>
			</div>
		</section>

		<footer id="footer">
			<div id="footer_box">
				<%@ include file="include/footer.jsp"%>
			</div>
		</footer>

	</div>
</body>
</html>