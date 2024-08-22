<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>스마트락</title>                     
    <link rel="icon" href="favicon.ico" type="image/x-icon">
    <script src="https://kit.fontawesome.com/c47106c6a7.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/style.css">
    <script src="js/ie.js"></script>
</head>

<body>

    <header>
        <div class="inner">
            <h1><img src="img/title.jpg"></h1>
<!--  
            <ul id="gnb">
                <li><a href="#">창살없는 방범창 스마트락</a></li>
                <li><a href="#">설치안내</a></li>
                <li><a href="#">견적문의</a></li>
                <li><a href="#">시공갤러리</a></li>
                <li><a href="#">기업정보</a></li>
            </ul>
-->
           <ul class="util">
                <c:if test="${userLoggedIn}">
                	<li><a href="${pageContext.request.contextPath}/logout">${customInfo.name}님, Logout</a></li>
                </c:if>
                <c:if test="${!userLoggedIn}">
                	<li><a href="${pageContext.request.contextPath}/loginForm">로그인</a></li>
                	<li><a href="${pageContext.request.contextPath}/signUpForm">회원가입</a></li>
                </c:if>
                <c:if test="${customInfo.name eq 'admin'}">
                <li><a href="${pageContext.request.contextPath}/memberList">회원관리</a></li>
                </c:if>
            </ul>
        </div>
    </header>


    <figure>
        <video src="img/smartlock.mp4" autoplay muted loop></video>
        <div class="inner">
            <h1>스마트락</h1>
            <p>집 안 창문에 부착하여 환기(15cm열림)를 시키면서 창문을 통한 침입을 완벽히 차단하는 제품입니다. <br>
                <strong>스마트락은 1톤 이상의 힘을 가해도,파손되거나 열리지 않습니다.</strong></p>
            <c:choose>
            	<c:when test="${userLoggedIn}">
           			 <a href="${pageContext.request.contextPath}/list">스마트락 견적문의</a>
            	</c:when>
            	<c:otherwise>
            		<a href="javascript:void(0);" onclick="showAlert()">스마트락 견적문의</a>
            	</c:otherwise>
            </c:choose>
        </div>
    </figure>

    <section>
        <div class="inner">
            <h1>스마트락 소개</h1>
            <div class="wrap">
                <article>
                    <div class="pic">
                        <img src="img/capture1.png" alt="1번째 콘텐츠 이미지">
                    </div>
                    <h2><a href="#">창살없는 방범창</a></h2>
                    <p>감옥같은 방범창이 아닌 답답하지 않은 깔끔하고 예쁜 방범창이에요 
                    <strong>전망이 확보되고 외출 시에도 걱정없이!</strong> 탁 트이고 환한 창문으로 안심되고 지내실 수 있어요!</p>
                </article>

                <article>
                    <div class="pic">
                        <img src="img/capture2.png" alt="2번째 콘텐츠 이미지">
                    </div>
                    <h2><a href="#">창문 개폐가 가능한 유용한 방범창</a></h2>
                    <p>집안에서는 창문을 마음대로 여닫을 수 있어요
                    <strong>방범모드(15cm)</strong>중 외부에서 창문을 열고 침입할 수 없어요
                  	청소할 때, 집안에 사람이 있는 경우 창문을 활짝 열 수 있어요</p>
                </article>

                <article>
                    <div class="pic">
                        <img src="img/capture3.png" alt="3번째 콘텐츠 이미지">
                    </div>
                    <h2><a href="#">이전 설치가 가능한 착한 가격의 방범창</a></h2>
                    <p>스마트락 설치 후 사용하시다가 이사할 떄도 언제든지 <strong>이전 설치가 가능한</strong> 방범창이에요.
                    방범창/방범방충망 대비 착한 가격으로 확실한 안전을 보장 받을 수 있어요!</p>
                </article>

                <article>
                    <div class="pic">
                        <img src="img/capture4.png" alt="4번째 콘텐츠 이미지">
                    </div>
                    <h2><a href="#">어린이 손끼임 방지</a></h2>
                    <p><strong>일정폭(15cm)이상 열 수 없도록 제어</strong>가 되며,일정폭(15cm)에서 다시 닫히지 않도록 하는 기능이 있어 
                    아이들의 손발이 창문과 창틀에 끼는 사고를 막을 수 있어요</p>
                </article>
            </div>
        </div>
    </section>

    <footer>
        <div class="inner">
            <div class="upper">
                <h1>SMARTLOCK</h1>
                <!-- 
                <ul>
                    <li><a href="#">Policy</a></li>
                    <li><a href="#">Terms</a></li>
                    <li><a href="#">Family Site</a></li>
                    <li><a href="#">Sitemap</a></li>
                </ul>-->
            </div>

            <div class="lower">
                <address>
                    <p>상호 : ST system대표 : 최재혁사업자등록번호 : 131-28-16310통신판매업신고번호 : 제2015-인천연수구-0166호 통신판매사업자 정보 확인</p>
					<p>주소 : 인천시 연수구 송도3동 214번지 송도스마트밸리 A동 708호</p>
					<p>전화 : 1566-8095휴대폰 : 010-5360-0999e-메일 : mhb0503@naver.com</p>
                    
                </address>
                <p>
            		 Copyright ⓒ 2024 스마트락. All Rights Reserved.
                </p>
            </div>
        </div>
    </footer>

	<script>
    function showAlert() {
        alert('로그인 후 이용 가능합니다.');
    }
	</script>


</body>

</html>