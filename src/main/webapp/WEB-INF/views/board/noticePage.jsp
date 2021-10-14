<%--
  Created by IntelliJ IDEA.
  User: tytye
  Date: 2021-10-11
  Time: 오후 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<main style="padding: 5px">
  <div>제목</div>
  <div>
    <input type="text" id="noticeTitle" value="${contents.title}" />
  </div>

  <div>등록일</div>
  <div>
    <input type="text" id="noticeCreateDate" value="${contents.frst_create_time}" />
  </div>

  <div>수정일</div>
  <div>
    <input type="text" id="noticeUpdateDate" value="${contents.title}" />
  </div>

  <div>게시물 번호</div>
  <div>
    <input type="text" id="noticeNumber" value="${contents.seq}" />
  </div>

  <div>작성자</div>
  <div>
    <input type="text" id="noticeWritten" value="${contents.writer}" />
  </div>

  <div>내용</div>
  <div>
    <input type="text" id="noticeContents" value="${contents.content}" />
  </div>
</main>

<script type='text/javascript'>
  let a = 10;
  let b = 20;
  console.log(a + b);
  console.log("${contents.writer}");
</script>
