<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<title>Publier un product | Jemla-Ma</title>
<link href="Bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="Bootstrap/css/font-awesome.min.css" rel="stylesheet">
<link href="Bootstrap/css/prettyPhoto.css" rel="stylesheet">
<link href="Bootstrap/css/price-range.css" rel="stylesheet">
<link href="Bootstrap/css/animate.css" rel="stylesheet">
<link href="Bootstrap/css/main.css" rel="stylesheet">
<link href="Bootstrap/css/responsive.css" rel="stylesheet">
<link rel="shortcut icon" href="images/ico/favicon.ico">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="images/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="images/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="images/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="images/ico/apple-touch-icon-57-precomposed.png">
</head>
<body>
	<header id="header"><!--header-->
		<div class="header_top"><!--header_top-->
			<div class="container">
				<div class="row">
					<div class="col-sm-6">
						<div class="contactinfo">
							<ul class="nav nav-pills">
<!-- 								<li><a href=""><i class="fa fa-phone"></i> +2 95 01 88 821</a></li> -->
								<li><a href=""><i class="fa fa-envelope"></i> info@jemla.ma</a></li>
								<li><a href=""><i class="fa fa-envelope"></i><%= session.getAttribute("ActiveUser")%></a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-6">
						<div class="social-icons pull-right">
							<ul class="nav navbar-nav">
								<li><a href=""><i class="fa fa-facebook"></i></a></li>
								<li><a href=""><i class="fa fa-twitter"></i></a></li>
								<li><a href=""><i class="fa fa-linkedin"></i></a></li>
								<li><a href=""><i class="fa fa-dribbble"></i></a></li>
								<li><a href=""><i class="fa fa-google-plus"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div><!--/header_top-->
		
		<div class="header-middle"><!--header-middle-->
			<div class="container">
				<div class="row">
					<div class="col-sm-4">
						<div class="logo pull-left">
							<a href="index.jsp"><img src="Bootstrap/images/home/logo.png" alt="" /></a>
						</div>
					</div>
					<div class="col-sm-8">
						<div class="shop-menu pull-right">
							<ul class="nav navbar-nav">
								<li><html:link action="loginRedirect.do"><i class="fa fa-user"> Mon compte</i></html:link></li>
<!-- 								<li><a href="checkout.jsp"><i class="fa fa-crosshairs"></i> Checkout</a></li> -->
								<li><html:link action="cart.do"><i class="fa fa-shopping-cart"></i> Panier</html:link></li>
								<li><html:link action="logoutRedirect.do"><i class="fa fa-lock"></i> Se déconnecter</html:link></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div><!--/header-middle-->
	
		<div class="header-bottom"><!--header-bottom-->
			<div class="container">
				<div class="row">
					<div class="col-sm-9">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
						</div>
						<div class="mainmenu pull-left">
							<ul class="nav navbar-nav collapse navbar-collapse">
								<li><html:link action="loginRedirect.do">Acceuil entreprise</html:link></li>
								<li class="dropdown"><a href="#">Profile<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="#">Qui sommes nous</a></li>
										<li><a href="product-details.jsp">Produits</a></li> 
<%-- 										<li><html:link action="checkout.do">Checkout</html:link></li>  --%>
										<!-- <li><a href="cart.jsp">Promouvoir Site</a></li>  -->
										<li><a href="cart.jsp">Logout</a></li> 
                                    </ul>
                                </li> 
								<li class="dropdown"><a href="#" >Produits<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="#" class="active">Acheter</a></li>
										<li><a href="#">Vendue</a></li>
                                    </ul>
                                </li> 
								<li><html:link action="inbox.do">Messagerie</html:link></li>
								<li><a href="#" class="active">Publier produit</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="search_box pull-right">
							<input type="text" placeholder="Search"/>
						</div>
					</div>
				</div>
			</div>
		</div><!--/header-bottom-->
	</header><!--/header-->
	<section>
		<div class="container">
			<div class="row">
			<div class="col-sm-4">
			<div class="login-form">
				<h2>Publish a new product</h2>
					<form action="addProduct.do" method="post" enctype="multipart/form-data">
						<input type="text" placeholder="Product name" name="nom"/>
						<input type="text" placeholder="Price" name="prix"/>
						<input type="text" placeholder="Description" name="description"/>
						<input type="text" placeholder="Delai_jours" name="delai_jours"/>
						<input type="text" placeholder="Available quantity" name="quantite"/>
<!-- 						<input type="text" placeholder="Price" name="prix"/> -->
						<span></span><select  name="unite">
							<option value="KG">KG</option>
							<option value="M2">M2</option>
							<option value="L">L</option>
							<option value="M">M</option>
							<option value="G">G</option>
						</select><br/></span>
						<span>
						<select name="categorie">
							<c:forEach items="${myCats}" var="cat">
								<option value="${cat}">${cat}</option>
							</c:forEach>
						</select><br/>
						</span>
						<input type="file" name="picture" id="fileChooser"/><br/><br/>
						<button type="submit" class="btn btn-default">Ajouter produit</button>
					</form>
				</div>
			</div>
		</div>
		</div>
		
	</section>
	
	<footer id="footer">
		<!--Footer-->
		<div class="footer-top">
			<div class="container">
				<div class="row">
					<div class="col-sm-2">
						<div class="companyinfo">
							<h2>
								<span>Jemla</span>-Ma
							</h2>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing
								elit,sed do eiusmod tempor</p>
						</div>
					</div>
					<div class="col-sm-7">
						<div class="col-sm-3">
							<div class="video-gallery text-center">
								<a href="#">
									<div class="iframe-img">
										<img src="Bootstrap/images/home/iframe1.png" alt="" />
									</div>
									<div class="overlay-icon">
										<i class="fa fa-play-circle-o"></i>
									</div>
								</a>
								<p>Circle of Hands</p>
								<h2>15 Mai 2016</h2>
							</div>
						</div>

						<div class="col-sm-3">
							<div class="video-gallery text-center">
								<a href="#">
									<div class="iframe-img">
										<img src="Bootstrap/images/home/iframe2.png" alt="" />
									</div>
									<div class="overlay-icon">
										<i class="fa fa-play-circle-o"></i>
									</div>
								</a>
								<p>Circle of Hands</p>
								<h2>15 Mai 2016</h2>
							</div>
						</div>

						<div class="col-sm-3">
							<div class="video-gallery text-center">
								<a href="#">
									<div class="iframe-img">
										<img src="Bootstrap/images/home/iframe3.png" alt="" />
									</div>
									<div class="overlay-icon">
										<i class="fa fa-play-circle-o"></i>
									</div>
								</a>
								<p>Circle of Hands</p>
								<h2>15 Mai 2016</h2>
							</div>
						</div>

						<div class="col-sm-3">
							<div class="video-gallery text-center">
								<a href="#">
									<div class="iframe-img">
										<img src="Bootstrap/images/home/iframe4.png" alt="" />
									</div>
									<div class="overlay-icon">
										<i class="fa fa-play-circle-o"></i>
									</div>
								</a>
								<p>Circle of Hands</p>
								<h2>15 Mai 2016</h2>
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="address">
							<img src="Bootstrap/images/home/map.png" alt="" />
							<p>Jemla Ma Inc. Bd Abdelkrim El Khatabi, Marrakech Maroc</p>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="footer-widget">
			<div class="container">
				<div class="row">
					<div class="col-sm-2">
						<div class="single-widget">
							<h2>Service</h2>
							<ul class="nav nav-pills nav-stacked">
								<li><a href="">Online Help</a></li>
								<li><a href="">Contact Us</a></li>
								<li><a href="">Order Status</a></li>
								<li><a href="">Change Location</a></li>
								<li><a href="">FAQs</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-2">
						<div class="single-widget">
							<h2>Quick Shop</h2>
							<ul class="nav nav-pills nav-stacked">
								<li><a href="">T-Shirt</a></li>
								<li><a href="">Mens</a></li>
								<li><a href="">Womens</a></li>
								<li><a href="">Gift Cards</a></li>
								<li><a href="">Shoes</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-2">
						<div class="single-widget">
							<h2>Policies</h2>
							<ul class="nav nav-pills nav-stacked">
								<li><a href="">Terms of Use</a></li>
								<li><a href="">Privacy Policy</a></li>
								<li><a href="">Refund Policy</a></li>
								<li><a href="">Billing System</a></li>
								<li><a href="">Ticket System</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-2">
						<div class="single-widget">
							<h2>About Shopper</h2>
							<ul class="nav nav-pills nav-stacked">
								<li><a href="">Company Information</a></li>
								<li><a href="">Careers</a></li>
								<li><a href="">Store Location</a></li>
								<li><a href="">Affillate Program</a></li>
								<li><a href="">Copyright</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-3 col-sm-offset-1">
						<div class="single-widget">
							<h2>About Shopper</h2>
							<form action="#" class="searchform">
								<input type="text" placeholder="Your email address" />
								<button type="submit" class="btn btn-default">
									<i class="fa fa-arrow-circle-o-right"></i>
								</button>
								<p>
									Get the most recent updates from <br />our site and be updated
									your self...
								</p>
							</form>
						</div>
					</div>

				</div>
			</div>
		</div>

		<div class="footer-bottom">
			<div class="container">
				<div class="row">
					<p class="pull-left">Copyright © 2016 Jemla_Ma Inc. All rights
						reserved.</p>
					<p class="pull-right">
						Designed by <span><a target="_blank"
							href="http://www.themeum.com">Themeum</a></span>
					</p>
				</div>
			</div>
		</div>

	</footer>
	
</body>
<!--/head-->
</html>