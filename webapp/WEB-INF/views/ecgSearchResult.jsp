<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>오픈 API</title>
</head>
<body>
	<c:forEach var="vo" items="${searchResultTbCase.section.items.list}" varStatus="status">
			아이디: ${vo.citycode} <br/>
			name: ${vo.cityname} <br/><br/>
		=============================================================================================================================<br/><br/>
	</c:forEach>
	<br/><br/>
	<a href="/ecg/openapi/searchForm">다시 검색</a>
</body>
</html>