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
  <link href="${path}/resources/css/tiles/footerstyle.css" rel="stylesheet" />
  <link href="${path}/resources/css/tiles/headerstyle.css" rel="stylesheet" />
  <link href="${path}/resources/css/tiles/sidestyle.css" rel="stylesheet" />
  <title><tiles:insertAttribute name="title" /></title>
</head>

<style>
    * {
        margin: 0;
        padding: 0;
    }

    body {
        width: 100%;
        height: 100%;
    }

    nav{
        display: block;
        position: fixed;
        text-align: center;
        top: 0;
        left: 0;
        width: 100%;
        height: 50px;
        background-color: aqua;
    }

    aside {
        display: block;
        position: fixed;
        left: 0px;
        width: 250px;
        height: 100%;
        background-color: bisque;
    }

    footer {
        position: fixed;
        padding-left: 250px;
        height: 20px;
        bottom: 0;
        width: calc(100% - 250px);
    }

    .page{
        display: flex;
        width: 100%;
        padding-top: 50px;
        height: calc(100vh - 50px);
    }

    .page-contents {
        width: calc(100% - 250px);
        margin-left: 250px;
        padding: 0 5% 0 5%;
        overflow-y: auto;
    }

</style>

<body>
  <tiles:insertAttribute name="header" />

  <div class="page">
    <aside>
      <tiles:insertAttribute name="left"/>
    </aside>

    <section class="page-contents">
      <tiles:insertAttribute name="body"/>
    </section>

    <tiles:insertAttribute name="foot" />
  </div>
</body>

</html>
