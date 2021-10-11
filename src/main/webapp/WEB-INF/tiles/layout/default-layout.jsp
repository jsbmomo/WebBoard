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
  <title><tiles:insertAttribute name="title" /></title>
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
  <meta name="description" content="" />
  <meta name="author" content="" />
  <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
  <link href="${path}/assets/css/styles.css" rel="stylesheet" />
  <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
  <script src="${path}/assets/js/scripts.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
  <script src="${path}/assets/assets/demo/chart-area-demo.js"></script>
  <script src="${path}/assets/assets/demo/chart-bar-demo.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
  <script src="${path}/assets/js/datatables-simple-demo.js"></script>
</head>

<!-- Bootstrap 적용 후, Tiles 미동작 문제 해결.
    주원인: tiles-define의 <definition> 태그 name과
    해당 태그의 자식 태크 중 name=body 경로 잘못 지정.
    또한, controller에서 잘못된 경로를 return
    참고. https://freehoon.tistory.com/130 -->

<body class="sb-nav-fixed">
  <div>hi</div>
  <tiles:insertAttribute name="header"/>
  <div id="layoutSidenav">
    <tiles:insertAttribute name="left"/>
      <div id="layoutSidenav_content">
        <tiles:insertAttribute name="body"/>
      </div>
  </div>
  <tiles:insertAttribute name="foot" />
</body>

</html>
