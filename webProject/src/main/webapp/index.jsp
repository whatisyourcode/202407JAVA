<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String name = (String)session.getAttribute("name");
%>
    
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SI Company</title>
    <link rel="icon" href="favicon.ico" type="image/x-icon">
 <!--   	<script src="https://kit.fontawesome.com/c47106c6a7.js" crossorigin="anonymous"></script> -->
    <link rel="stylesheet" href="css/style.css">
    <script src="js/ie.js"></script>
</head>

<body>

    <header>
        <div class="inner">
            <h1><a href="#">SI Company</a></h1>

    <!--           <ul id="gnb">
              <li><a href="#">DEPARTMENT</a></li>
                <li><a href="#">GALLERY</a></li>
                <li><a href="#">YOUTUBE</a></li>
                <li><a href="#">COMMUNITY</a></li> 
                <li><a href="#">Contact us</a></li>
            </ul> -->

            <ul class="util">
				<% 
					if (name != null && !name.trim().isEmpty()){	
				%>
					<li><a href="logout.jsp">Logout (<%=name%>)</a></li>
					<li><a href="editProfileForm.jsp">EditID</a>
				<% 
					} else{ 
				%>
                <li><a href="loginForm.jsp">Login</a></li>
                <%
					}
				%>
                <li><a href="signUpForm.jsp">SignUp</a></li>
            </ul>
        </div>
    </header>


    <figure>
        <video src="img/visual.mp4" autoplay muted loop></video>
        <div class="inner">
            <h1>About us</h1>
            <p>We specialize in providing comprehensive SI (Systems Integration) solutions. <br>
                Our expertise ensures seamless integration of various systems, optimizing performance and enhancing efficiency for your business needs.</p>

            <a href="board/list.jsp">Contact Us</a>
        </div>
    </figure>

    <section>
        <div class="inner">
            <h1>RECENT NEWS</h1>
            <div class="wrap">
                <article>
                    <div class="pic">
                        <img src="img/news1.jpg" alt="1번째 콘텐츠 이미지">
                    </div>
                    <h2><a href="#">New Partnership with [Partner Company]</a></h2>
                    <p>We are excited to announce our latest partnership with [Partner Company], 
                    which will enhance our capabilities in delivering cutting-edge SI solutions</p>
                </article>

                <article>
                    <div class="pic">
                        <img src="img/news2.jpg" alt="2번째 콘텐츠 이미지">
                    </div>
                    <h2><a href="#">Launch of Cloud Integration Platform</a></h2>
                    <p>Our new cloud-based integration platform has officially launched, 
                    offering clients improved scalability and flexibility in system management</p>
                </article>

                <article>
                    <div class="pic">
                        <img src="img/news3.jpg" alt="3번째 콘텐츠 이미지">
                    </div>
                    <h2><a href="#">Major Project Success with [Client Company]</a></h2>
                    <p>We have successfully completed a major project with [Client Company], 
                    resulting in a significant boost in operational efficiency and system performance</p>
                </article>

                <article>
                    <div class="pic">
                        <img src="img/news4.jpg" alt="4번째 콘텐츠 이미지">
                    </div>
                    <h2><a href="#">Award for Excellence: [Award Name]</a></h2>
                    <p>Our team recently received the [Award Name] for excellence in SI solutions, 
                    reflecting our commitment to innovation and customer satisfaction.</p>
                </article>
            </div>
        </div>
    </section>

    <footer>
        <div class="inner">
            <div class="upper">
                <h1>DCODELAB</h1>
                <ul>
                    <li><a href="#">Policy</a></li>
                    <li><a href="#">Terms</a></li>
                    <li><a href="#">Family Site</a></li>
                    <li><a href="#">Sitemap</a></li>
                </ul>
            </div>

            <div class="lower">
                <address>
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Quas, facere.<br>
                    TEL : 031-111-1234 C.P : 010-1234-5678
                </address>
                <p>
                    2020 DOCDELAB &copy; copyright all right reserved.
                </p>
            </div>
        </div>
    </footer>




</body>

</html>