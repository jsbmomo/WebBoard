<%--
  Created by IntelliJ IDEA.
  User: tytye
  Date: 2021-10-05
  Time: 오후 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


  <main>
    <div class="container-fluid px-4">
      <h1 class="mt-4">Dashboard</h1>
      <ol class="breadcrumb mb-4">
        <li class="breadcrumb-item active">Dashboard</li>
      </ol>

      <div class="card mb-4">
        <div class="card-header">
          <i class="fas fa-table me-1"></i>
          최신 공지물
        </div>
        <div class="card-body">
          <table id="datatablesSimple">
            <thead>
            <tr>
              <th>번호</th>
              <th>제목</th>
              <th>작성자</th>
              <th>작성일</th>
              <th>조회</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${notice}" var="notice">
<%--              <tr onClick="window.open('링크주소','','')">--%>
              <tr style="cursor: pointer;" onClick="noticeMove(`${notice.seq}`);">
                <td><c:out value="${notice.seq}"/></td>
                <td><c:out value="${notice.title}"/></td>
                <td><c:out value="${notice.writer}"/></td>
                <td><c:out value="${notice.frst_create_time}"/></td>
                <td>0</td>
              </tr>
            </c:forEach>
            </tbody>
          </table>
        </div>
      </div>

      <div class="row">
        <div class="col-xl-3 col-md-6">
          <div class="card bg-primary text-white mb-4">
            <div class="card-body">Primary Card</div>
            <div class="card-footer d-flex align-items-center justify-content-between">
              <a class="small text-white stretched-link" href="#">View Details</a>
              <div class="small text-white"><i class="fas fa-angle-right"></i></div>
            </div>
          </div>
        </div>
        <div class="col-xl-3 col-md-6">
          <div class="card bg-warning text-white mb-4">
            <div class="card-body">Warning Card</div>
            <div class="card-footer d-flex align-items-center justify-content-between">
              <a class="small text-white stretched-link" href="#">View Details</a>
              <div class="small text-white"><i class="fas fa-angle-right"></i></div>
            </div>
          </div>
        </div>
        <div class="col-xl-3 col-md-6">
          <div class="card bg-success text-white mb-4">
            <div class="card-body">Success Card</div>
            <div class="card-footer d-flex align-items-center justify-content-between">
              <a class="small text-white stretched-link" href="#">View Details</a>
              <div class="small text-white"><i class="fas fa-angle-right"></i></div>
            </div>
          </div>
        </div>
        <div class="col-xl-3 col-md-6">
          <div class="card bg-danger text-white mb-4">
            <div class="card-body">Danger Card</div>
            <div class="card-footer d-flex align-items-center justify-content-between">
              <a class="small text-white stretched-link" href="#">View Details</a>
              <div class="small text-white"><i class="fas fa-angle-right"></i></div>
            </div>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col-xl-6">
          <div class="card mb-4">
            <div class="card-header">
              <i class="fas fa-chart-area me-1"></i>
              Area Chart Example
            </div>
            <div class="card-body"><canvas id="myAreaChart" width="100%" height="40"></canvas></div>
          </div>
        </div>
        <div class="col-xl-6">
          <div class="card mb-4">
            <div class="card-header">
              <i class="fas fa-chart-bar me-1"></i>
              Bar Chart Example
            </div>
            <div class="card-body"><canvas id="myBarChart" width="100%" height="40"></canvas></div>
          </div>
        </div>
      </div>
    </div>

    <div>
      <form action="/board/notice/create" method="post">
        <input type="text" name="title" />
        <input type="text" name="writer" />
        <input type="text" name="content" />
        <button type="submit">입력</button>
      </form>
      <button onclick="btnClick();">ajax send</button>
    </div>
  </main>

<script type='text/javascript'>

  function btnClick() {
    let xhrNotice = new XMLHttpRequest();

    let jsonData = "{'seq': '1','title': '테스트 입니다.','writer': '관리자','content': 'test contents :)','frst_create_time': '2021-10-20','last_update_time': '2021-10-20'}";

    xhrNotice.open('POST', '/board/notice/create');
    xhrNotice.setRequestHeader("Content-Type", "application/json");
    xhrNotice.onreadystatechange = function() { // Call a function when the state changes.
      if (this.readyState === XMLHttpRequest.DONE && this.status === 200) {
        // Request finished. Do processing here.
        console.log("Request finished");
      }
    }
    xhrNotice.send(jsonData);
    xhrNotice.onload = (res) => {
      console.log(res);
    }
  }

  console.log("page start");
  document.onload = function() {
    let xhr = new XMLHttpRequest();

    console.log("hihi");

    xhr.open('GET', '/main/notice', true);
    xhr.send();
    xhr.onload = () => {
      if(xhr.status == 200) {
        console.log(xhr.response);
      } else if(xhr.status == 404) {
        console.log("찾을 수 없는 페이지");
      } else {
        console.log('communication failed');
      }
    }

  }

  function noticeMove(noticeSeq) {
    // event.stopPropagation();
    console.log(noticeSeq);
    location.href = "/board/notice/" + noticeSeq;
  }

</script>

