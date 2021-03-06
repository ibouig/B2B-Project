<%@page import="ma.jemla.daoimpl.CategoryDaoImpl"%>
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
    <title>Jemla Ma</title>
    <link href="Bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="Bootstrap/css/font-awesome.min.css" rel="stylesheet">
    <link href="Bootstrap/css/prettyPhoto.css" rel="stylesheet">
    <link href="Bootstrap/css/price-range.css" rel="stylesheet">
    <link href="Bootstrap/css/animate.css" rel="stylesheet">
	<link href="Bootstrap/css/main.css" rel="stylesheet">
	<link href="Bootstrap/css/responsive.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="Bootstrap/images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="Bootstrap/images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="Bootstrap/images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="Bootstrap/images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="Bootstrap/images/ico/apple-touch-icon-57-precomposed.png">
    <script></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
    <script type="text/javascript">
// 		function loadDoc( a) {
// 			/*$(document).ready(
// 				    function() {
// 				    	//alert(a);
// 				    	document.getElementById("madiv").textContent="newtext";
// 				       // $('div.madiv').text('test');
// 				    }
// 				);*/
// 				$(document).ajaxComplete(function(){
// 					$("div.madiv").text(text.replace($("div.madiv"), "ok"));
// 				});
// 			//alert(a)
// 			/*
// 			 $.ajax({url: "addToCart.do?id=" + a, success: function(result){
// 				//alert(a);
// 				 //alert($("#madiv").val());
// 		        $("#madiv").text(result);
		        
// 		    }});	 */
 		
// 	}
function loadDoc( a) {
			
			//alert(a);
 		 	var xhttp = new XMLHttpRequest();
 		 	xhttp.onreadystatechange = function() {
   			 if (xhttp.readyState == 4 && xhttp.status == 200) {
   				 //alert(a);
    			  document.getElementById("cart").innerHTML = xhttp.responseText;
    			  //document.getElementsByClass("cart").innerHTML = xhttp.responseText;
   			 }
			  };
			 
 			 xhttp.open("GET", "addToCart.do?id=" + a, true);
 			 xhttp.send();
	}
	function productRedi(a){
		window.location ="productRedirect.do?id=" + a;
// 		var xhttp = new XMLHttpRequest();
// 		 	xhttp.onreadystatechange = function() {
// 			 if (xhttp.readyState == 4 && xhttp.status == 200) {
// 				 //alert(a);
// 			 }
// 		  };
		 
// 			 xhttp.open("GET", "productRedirect.do?id=" + a, true);
// 			 xhttp.send();
	}
		
</script>
</head><!--/head-->

<body>
	<header id="header"><!--header-->
		<div class="header_top"><!--header_top-->
			<div class="container">
				<div class="row">
					<div class="col-sm-6">
						<div class="contactinfo">
							<ul class="nav nav-pills">
								<li><a href="#"><i class="fa fa-phone"></i> +2 95 01 88 821</a></li>
								<li><a href="#"><i class="fa fa-envelope"></i> info@jemla.ma</a></li>
								<li><a href=""><i class="fa fa-envelope"></i><%= session.getAttribute("ActiveUser")%></a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-6">
						<div class="social-icons pull-right">
							<ul class="nav navbar-nav">
								<li><a href="#"><i class="fa fa-facebook"></i></a></li>
								<li><a href="#"><i class="fa fa-twitter"></i></a></li>
								<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
								<li><a href="#"><i class="fa fa-dribbble"></i></a></li>
								<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
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
								<li><html:link action="loginRedirect.do"><i class="fa fa-user"></i> Mon compte</html:link></li>
								<!-- <li><a href="#"><i class="fa fa-star"></i> Wishlist</a></li> -->
<!-- 								<li><a href="WEB-INF/Pages/checkout.html"><i class="fa fa-crosshairs"></i> Checkout</a></li> -->
								<li ><html:link action="cart.do"><i id="cart" class="fa fa-shopping-cart">Panier ${cart.lines.size() }</i> </html:link></li>
								<li><html:link action="loginRedirect.do"><i class="fa fa-lock"></i> Login</html:link></li>
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
								<li><a href="index.jsp" class="active">Acceuil</a></li>
								<li><html:link action="contactUs.do">Contact</html:link></li>
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
	
	<section id="slider"><!--slider-->
		<div class="container">
			<div class="row">
				<div class="col-sm-12">
					<div id="slider-carousel" class="carousel slide" data-ride="carousel">
						<ol class="carousel-indicators">
							<li data-target="#slider-carousel" data-slide-to="0" class="active"></li>
							<li data-target="#slider-carousel" data-slide-to="1"></li>
							<li data-target="#slider-carousel" data-slide-to="2"></li>
						</ol>
						
						<div class="carousel-inner">
							<div class="item active">
								<div class="col-sm-6">
									<h1><span>Jemla</span>-MA</h1>
									<h2>Acheter/Vendre efficacement</h2>
									<p>Votre r�f�rence pour commerce entre entreprises</p>
<!-- 									<button type="button" class="btn btn-default get" onclick="/login.do">Rejoignez nous</button> -->
								</div>
								<div class="col-sm-6">
									<img src="Bootstrap/images/home/ramadan.jpg" class="girl img-responsive" alt="" />
<!-- 									<img src="Bootstrap/images/home/pricing.png"  class="pricing" alt="" /> -->
								</div>
							</div>
							<div class="item">
								<div class="col-sm-6">
									<h1><span>Jemla</span>-MA</h1>
									<h2>Acheter/Vendre efficacement</h2>
									<p>Votre r�f�rence pour commerce entre entreprises. </p>
<!-- 									<button type="button" class="btn btn-default get" onclick="/login.do">Rejoignez nous</button> -->
								</div>
								<div class="col-sm-6">
									<img src="Bootstrap/images/home/Tech-gadgets.jpg" class="girl img-responsive" alt="" />
<!-- 									<img src="Bootstrap/images/home/pricing.png"  class="pricing" alt="" /> -->
								</div>
							</div>
							
							<div class="item">
								<div class="col-sm-6">
									<h1><span>Jemla</span></h1>
									<h2>Acheter/Vendre efficacement</h2>
									<p>Votre r�f�rence pour commerce entre entreprises. </p>
<!-- 									<button type="button" class="btn btn-default get" onclick="/login.do">Rejoignez nous</button> -->
								</div>
								<div class="col-sm-6">
									<img src="Bootstrap/images/home/clothing.jpg" class="girl img-responsive" alt="" />
<!-- 									<img src="Bootstrap/images/home/pricing.png" class="pricing" alt="" /> -->
								</div>
							</div>
							
						</div>
						
						<a href="#slider-carousel" class="left control-carousel hidden-xs" data-slide="prev">
							<i class="fa fa-angle-left"></i>
						</a>
						<a href="#slider-carousel" class="right control-carousel hidden-xs" data-slide="next">
							<i class="fa fa-angle-right"></i>
						</a>
					</div>
					
				</div>
			</div>
		</div>
	</section><!--/slider-->
	
	<section>
		<div class="container">
			<div class="row">
				<div class="col-sm-3">
					<div class="left-sidebar">
						<h2>Category</h2>
						<div class="panel-group category-products" id="accordian"><!--category-productsr-->
							
							<%@page import="ma.jemla.daoimpl.CategoryDaoImpl"%>
							<%@page import="ma.jemla.model.Category"%>
							<%@page import="java.util.List"%>
							<%
							CategoryDaoImpl c_dao = new CategoryDaoImpl(); 
							List<String> categories = c_dao.getCategoryNames();
							request.setAttribute("categories", categories);
							%>
							<c:forEach items="${categories}" var="tmp">
								<div class="panel panel-default">
									<div class="panel-heading">
										<h4 class="panel-title"><a href="catRedi.do?name=${tmp}">${tmp}</a></h4>
									</div>
								</div>
							</c:forEach>
						</div><!--/category-products-->	
						<div class="price-range"><!--price-range-->
							<h2>Prix</h2>
							<div class="well text-center">
								 <input type="text" class="span2" value="" data-slider-min="0" data-slider-max="600" data-slider-step="5" data-slider-value="[250,450]" id="sl2" ><br />
								 <b class="pull-left">$ 0</b> <b class="pull-right">$ 600</b>
							</div>
						</div><!--/price-range-->
						
						<div class="shipping text-center"><!--shipping-->
							<img src="Bootstrap/images/home/shipping.jpg" alt="" />
						</div><!--/shipping-->
					
					</div>
				</div>
				
				<div class="col-sm-9 padding-right">
					 <div class="features_items"><!--features_items-->
						<h2 class="title text-center">Nos produits</h2>
						<%@page import="ma.jemla.daoimpl.ProductDaoImpl" %>
						<%@page import="ma.jemla.model.Product" %>
						<%
						ProductDaoImpl p_dao = new ProductDaoImpl();
						List<Product> prods = p_dao.getProducts();
						request.getSession().setAttribute("prods", prods);
						//System.out.println("\n\n\n"+prods.size()+"\n\n\n");
						%>
						<c:forEach items="${prods }" var="tmp">
						<div class="col-sm-4">
							<div class="product-image-wrapper">
							<form >
								<div class="single-products">
								<input type="hidden" name="id" value="${tmp.id}" >
										<div class="productinfo text-center">
											<img src="${tmp.imagePath}" alt="${tmp.nom}" />
											<h2>${tmp.prix }DHS</h2>
											<p><a href="javascript:productRedi(${tmp.id})">${tmp.nom}</a></p>
											<button onClick="loadDoc(${tmp.id})" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</button>
										</div>
										<div class="product-overlay">
											<div class="overlay-content">
												<h2>${tmp.prix }DHS</h2>
												<p><a href="javascript:productRedi(${tmp.id})">${tmp.nom}</a></p>
												<button onClick="loadDoc(${tmp.id})" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</button>
											</div>
										</div>
								</div>
							</form>
							</div>
						</div>
						</c:forEach>
					</div><!--features_items-->
					
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
					<p class="pull-left">Copyright � 2016 Jemla_Ma Inc. All rights
						reserved.</p>
					<p class="pull-right">
						Designed by <span><a target="_blank"
							href="http://www.themeum.com">Themeum</a></span>
					</p>
				</div>
			</div>
		</div>

	</footer>
	

  
    <script src="Bootstrap/js/jquery.js"></script>
	<script src="Bootstrap/js/bootstrap.min.js"></script>
	<script src="Bootstrap/js/jquery.scrollUp.min.js"></script>
	<script src="Bootstrap/js/price-range.js"></script>
    <script src="Bootstrap/js/jquery.prettyPhoto.js"></script>
    <script src="Bootstrap/js/main.js"></script>
</body>
</html>