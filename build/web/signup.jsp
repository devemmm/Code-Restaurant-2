<%-- 
    Document   : signup
    Created on : Mar 14, 2021, 8:53:03 AM
    Author     : emmanuel
--%>

<%@page import="com.src.helps.AccountError"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">

        <title>Code | Restaurant | Signup</title>
        <meta content="" name="description">
        <meta content="" name="keywords">

        <!-- Favicons -->
        <!-- <link href="assets/img/favicon.png" rel="icon"> -->
        <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

        <!-- Fontawesome icons -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.3/css/all.css"
              integrity="sha384-SZXxX4whJ79/gErwcOYf+zWLeJdY/qpuqC4cAa9rOGUstPomtqpuNWT9wdPEn2fk" crossorigin="anonymous">

        <!-- Google Fonts -->
        <link
            href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Playfair+Display:ital,wght@0,400;0,500;0,600;0,700;1,400;1,500;1,600;1,700|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
            rel="stylesheet">

        <!-- Vendor CSS Files -->
        <link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
        <link href="assets/vendor/aos/aos.css" rel="stylesheet">
        <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
        <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

        <!-- Template Main CSS File -->
        <link href="assets/css/style.css" rel="stylesheet">
    </head>

    <body>
        <%
            AccountError accountError = new AccountError();
            AccountError errorData = (AccountError) session.getAttribute("errorData");
            if (errorData == null) {
                errorData = new AccountError();
                session.setAttribute("errorData", errorData);
            }
        %>
        <!-- ======= Top Bar ======= -->
        <div id="topbar" class="d-flex align-items-center fixed-top">
            <div class="container d-flex justify-content-center justify-content-md-between">

                <div class="contact-info d-flex align-items-center">
                    <i class="bi bi-phone d-flex align-items-center"><span>+250 788 596 281</span></i>
                    <i class="bi bi-clock d-flex align-items-center ms-4"><span> Mon-Sat: 11AM - 23PM</span></i>
                </div>

            </div>
        </div>

        <!-- ======= Header ======= -->
        <header id="header" class="fixed-top d-flex align-items-cente">
            <div class="container-fluid container-xl d-flex align-items-center justify-content-lg-between">

                <h1 class="logo me-auto me-lg-0"><a href="index.html">CODE | Restaurant</a></h1>
            </div>
        </header><!-- End Header -->

    <main id="main">
        <section class="breadcrumbs">
            <div class="container">

                <div class="d-flex justify-content-between align-items-center">
                    <h2>SIGN UP</h2>
                    <ol>
                        <li><a href="index.html">Home</a></li>
                        <li>Sign up</li>
                    </ol>
                </div>

            </div>
        </section>


        <div class="container back-img">
            <div class="col-md-6 mb-3">
                <img src="assets/img/personalization.svg" alt="background image" class="img-fluid">
            </div>

            <div class="row">
                <div class="col-lg-3"></div>
                <p id="message"><%=errorData.getEmailError()%><%=errorData.getPasswordError()%><%=errorData.getGeneralError()%></p>

                <div class="col-lg-6 col-sm-2 col-md-2 positioning">
                    <h3 class="signin-text mb-3 "> CREATE ACCOUNT</h3><br>
                    <!-- <div id="ui"> -->
                    <form action="signupProcess.jsp" class="form-group" method="POST">
                        <div class="row">
                            <div class="col-lg-6  input-row">
                                <input class="form-control" id="fname" name="fname" type="text" placeholder="Enter your First Name"
                                       style="background-color: #0c0b09; color: #fff; border-color: #cda45e;" required>
                            </div>
                            <div class="col-lg-6  input-row">
                                <input class="form-control" name="lname" type="text" placeholder="Enter your Last Name"
                                       style="background-color: #0c0b09; color: #fff; border-color: #cda45e;" required>
                            </div>
                        </div><br>


                        <div class="row">
                            <div class="col-lg-12  input-row">
                                <input class="form-control"  name="email" type="email" placeholder="Enter your Email"
                                       style="background-color: #0c0b09; color: #fff; border-color: #cda45e;" required>
                            </div>
                        </div><br>

                        <div class="row">
                            <div class="col-lg-6  input-row">
                                <input class="form-control" name="phone" type="tel" placeholder="Enter your Phone Number"
                                       style="background-color: #0c0b09; color: #fff; border-color: #cda45e;" required>
                            </div>
                            <div class="col-lg-6  input-row">
                                <input class="form-control" type="text" placeholder="Enter your Address. Sector, House No "
                                       name="last-name" style="background-color: #0c0b09; color: #fff; border-color: #cda45e;">
                            </div>
                        </div><br>

                        <div class="row">
                            <div class="col-lg-6  input-row">
                                <input class="form-control" name="password" type="password" placeholder="Type Your Password"
                                       style="background-color: #0c0b09; color: #fff; border-color: #cda45e;" required>
                            </div>
                            <div class="col-lg-6  input-row">
                                <input class="form-control" name="password2" type="password" placeholder="Re-type Password"
                                       style="background-color: #0c0b09; color: #fff; border-color: #cda45e;" required>
                            </div>
                        </div><br>
                        <button class="btn btn-class" type="submit" id="signup">Sign Up</button><br><br>
                        <div class="signUp">
                            <p>Have an account?<a href="signin.jsp" class="sign-up">Sign In</a></p>
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </main><!-- End #main -->

    <!-- ======= Footer ======= -->
    <footer id="footer">
        <div class="footer-top">
            <div class="container">
                <div class="row">

                    <div class="col-lg-3 col-md-6">
                        <div class="footer-info">
                            <h3>Restaurantly</h3>
                            <p>
                                A108 Adam Street <br>
                                NY 535022, USA<br><br>
                                <strong>Phone:</strong> +1 5589 55488 55<br>
                                <strong>Email:</strong> info@example.com<br>
                            </p>
                            <div class="social-links mt-3">
                                <a href="#" class="twitter"><i class="bx bxl-twitter"></i></a>
                                <a href="#" class="facebook"><i class="bx bxl-facebook"></i></a>
                                <a href="#" class="instagram"><i class="bx bxl-instagram"></i></a>
                                <a href="#" class="google-plus"><i class="bx bxl-skype"></i></a>
                                <a href="#" class="linkedin"><i class="bx bxl-linkedin"></i></a>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-2 col-md-6 footer-links">
                        <h4>Useful Links</h4>
                        <ul>
                            <li><i class="bx bx-chevron-right"></i> <a href="#">Home</a></li>
                            <li><i class="bx bx-chevron-right"></i> <a href="#">About us</a></li>
                            <li><i class="bx bx-chevron-right"></i> <a href="#">Services</a></li>
                            <li><i class="bx bx-chevron-right"></i> <a href="#">Terms of service</a></li>
                            <li><i class="bx bx-chevron-right"></i> <a href="#">Privacy policy</a></li>
                        </ul>
                    </div>

                    <div class="col-lg-3 col-md-6 footer-links">
                        <h4>Our Services</h4>
                        <ul>
                            <li><i class="bx bx-chevron-right"></i> <a href="#">Web Design</a></li>
                            <li><i class="bx bx-chevron-right"></i> <a href="#">Web Development</a></li>
                            <li><i class="bx bx-chevron-right"></i> <a href="#">Product Management</a></li>
                            <li><i class="bx bx-chevron-right"></i> <a href="#">Marketing</a></li>
                            <li><i class="bx bx-chevron-right"></i> <a href="#">Graphic Design</a></li>
                        </ul>
                    </div>

                    <div class="col-lg-4 col-md-6 footer-newsletter">
                        <h4>Our Newsletter</h4>
                        <p>Tamen quem nulla quae legam multos aute sint culpa legam noster magna</p>
                        <form action="" method="post">
                            <input type="email" name="email"><input type="submit" value="Subscribe">
                        </form>
                    </div>

                </div>
            </div>
        </div>

        <div class="container">
            <div class="copyright">
                &copy; Copyright <strong><span>Restaurantly</span></strong>. All Rights Reserved
            </div>
            <div class="credits">
                <!-- All the links in the footer should remain intact. -->
                <!-- You can delete the links only if you purchased the pro version. -->
                <!-- Licensing information: https://bootstrapmade.com/license/ -->
                <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/restaurantly-restaurant-template/ -->
                Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
            </div>
        </div>
    </footer><!-- End Footer -->

    <div id="preloader"></div>
    <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i
            class="bi bi-arrow-up-short"></i></a>

    <!-- Vendor JS Files -->
    <script src="assets/vendor/aos/aos.js"></script>
    <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
    <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
    <script src="assets/vendor/php-email-form/validate.js"></script>
    <script src="assets/vendor/swiper/swiper-bundle.min.js"></script>

    <!-- Bootstrap js -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
    crossorigin="anonymous"></script>

    <!-- Template Main JS File -->
    <script src="assets/js/main.js"></script>

</body>

</html>