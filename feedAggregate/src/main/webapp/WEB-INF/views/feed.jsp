<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>Feed Aggregate Daily</title>
	<style type="text/css">
		body {
			font-family: sans-serif;
		}
		.data, .data td {
			border-collapse: collapse;
			border: 1px solid #aaa;
			margin: 2px;
			padding: 2px;
		}
		.data th {
			font-weight: bold;
			background-color: #5C82FF;
			color: white;
		}
	</style>
</head>
<body>

<h2><spring:message code="label.title"/></h2>

	
<h3>Feeds</h3>
<c:if  test="${!empty feedList}">
<table class="data">
<tr>
	<th>Title</th>
	<th>Description</th>	
	<th>Date</th>
	<th>GUID</th>
	<th>Link</th>
	<th>&nbsp;</th>
</tr>
<c:forEach items="${feedList}" var="feed">
	<tr>
		<td>${feed.title}</td>
		<td>${feed.description}</td>
		<td>${feed.pubDate_converted}</td>			
		<td>${feed.guid}</td>
		<td>${feed.link}</td>	
	</tr>
</c:forEach>
</table>
</c:if>


</body>
</html>
