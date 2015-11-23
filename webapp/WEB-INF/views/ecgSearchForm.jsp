<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>샘플 오픈 API</title>
</head>
<body>
	<h3>샘플 오픈 API</h3>
	<!-- <form action="/test/main/search" method="POST">
		<input type="text" name="ServiceKey"/> <input type="submit" value="검색"/>
	</form>
	 -->
	 <c:forEach var="vo" items="${vo.section.items.list}" varStatus="status">
			${vo.citycode}
			${vo.cityname}
		=============================================================================================================================<br/><br/>
	</c:forEach>
	
	
</body>
</html>