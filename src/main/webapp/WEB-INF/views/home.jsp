<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>안드로이드연동</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
	<div class="container">	
		<h2>회원리스트 JSON으로 출력하기</h2>
		<ul>
			<li>
				<a href="./android/memberObject.do" target="_blank">
					회원리스트불러오기(JSONObject)
				</a>
			</li>
			<li>
				<a href="./android/memberList.do" target="_blank">
					회원리스트불러오기(JSONArray)
				</a>
			</li>
		</ul>
	</div>
</body>
</html>