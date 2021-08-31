<%--
  Created by IntelliJ IDEA.
  User: tytye
  Date: 2021-05-14
  Time: 오후 5:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="description" content="">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link href="${path}/resources/css/common.css" rel="stylesheet" />
  <title><tiles:insertAttribute name="title" /></title>
</head>

<body>
  <header>
    <tiles:insertAttribute name="header" />
  </header>

  <div style="display: flex; width: 100%;">
    <aside>
      <tiles:insertAttribute name="left"/>
    </aside>
    <div class='content'>
      <tiles:insertAttribute name="body"/>
    </div>
  </div>

  <footer>
    <tiles:insertAttribute name="foot" />
  </footer>

</body>

</html>
