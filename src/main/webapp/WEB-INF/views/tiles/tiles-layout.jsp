<%--
  Created by IntelliJ IDEA.
  User: tytye
  Date: 2021-05-14
  Time: 오후 5:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<set var="CONTEXT_PATH" value="${pageContext.request.contextPath}" scope="application"/>
<set var="RESOURCES_PATH" value="${CONTEXT_PATH}/resources" scope="application"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="description" content="">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <script type="text/javascript">
    let CONTEXT_PATH = "${CONTEXT_PATH}";
    let RESOURCES_PATH = "${RESOURCES_PATH}";
  </script>
  <link rel="stylesheet" href="${RESOURCES_PATH}/css/common.css">
  <title><tiles:insertAttribute name="title" /></title>
</head>

<body>
  <div class='wrap'>
    <tiles:insertAttribute name="header" />
    <div class='content'>
      <tiles:insertAttribute name="left"/>
      <div class="page_content">
        <tiles:insertAttribute name="body"/>
      </div>
    </div>
    <tiles:insertAttribute name="foot" />
  </div>
</body>

</html>
