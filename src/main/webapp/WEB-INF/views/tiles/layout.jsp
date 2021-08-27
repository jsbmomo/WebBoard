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
  <link rel="stylesheet" href="${path}/css/common.css">
  <title><tiles:insertAttribute name="title" /></title>
</head>


<style>
    *{
        margin: 0;
        padding: 0;
    }
    .wrap{
        width: 100%;
    }

    .Header, .content, .Footer{
        width: 100%;
        float: left;
    }

    .Header, .Footer{
        height: 8em;
    }

    .SideBar{
        width: 30%;
        height: 600px;
        background-color: #FFBB00;
        float: left;
    }

    .page_content{
        width: 90%;
        height: 600px;
        background-color: #EAEAEA;
        float: left;
    }

    .Header{
        background-color: #ABF200;
    }

    .Footer{
        background-color: #FF00DD;
    }

</style>


<body>
  <div class="wrap">
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
