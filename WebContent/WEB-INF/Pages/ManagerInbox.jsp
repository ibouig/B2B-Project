<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Messagerie | Jemla-Ma</title>
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
</head><!--/head-->

<body>
	<header id="header"><!--header-->
		<div class="header_top"><!--header_top-->
			<div class="container">
				<div class="row">
					<div class="col-sm-6">
						<div class="contactinfo">
							<ul class="nav nav-pills">
								<li><a href=""><i class="fa fa-phone"></i> +2 95 01 88 821</a></li>
								<li><a href=""><i class="fa fa-envelope"></i> info@jemla.ma</a></li>
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
								<li><html:link action="cart.do"><i class="fa fa-user"></i> Mon compte</html:link></li>
								<li><html:link action="logoutRedirect.do"><i class="fa fa-lock"></i> Se deconnecter</html:link></li>
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
								<li><html:link action="managerLogin.do">Acceuil manager</html:link></li>
								<li class="dropdown"><a href="#" >Valider<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="#" class="active">Annonces</a></li>
										<li><a href="#">Ordres</a></li>
                                    </ul>
                                </li> 
                                <li><a class="active" >Messagerie</a></li>
                                <li ><html:link action="addCategoryRedirect.do">Ajouter catégorie</html:link></li> 
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
        <div class="col-sm-3 col-md-2">
            <div class="btn-group">
                <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
                    Mail <span class="caret"></span>
                </button>
                <ul class="dropdown-menu" role="menu">
                    <li><a href="#">Mail</a></li>
                    <li><a href="#">Contacts</a></li>
                    <li><a href="#">Tasks</a></li>
                </ul>
            </div>
        </div>
        <div class="col-sm-9 col-md-10">
            <!-- Split button -->
            <div class="btn-group">
                <button type="button" class="btn btn-default">
                    <div class="checkbox" style="margin: 0;">
                        <label>
                            <input type="checkbox">
                        </label>
                    </div>
                </button>
                <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                    <span class="caret"></span><span class="sr-only">Toggle Dropdown</span>
                </button>
                <ul class="dropdown-menu" role="menu">
                    <li><a href="#">All</a></li>
                    <li><a href="#">None</a></li>
                    <li><a href="#">Read</a></li>
                    <li><a href="#">Unread</a></li>
                    <li><a href="#">Starred</a></li>
                    <li><a href="#">Unstarred</a></li>
                </ul>
            </div>
            <button type="button" class="btn btn-default" data-toggle="tooltip" title="Refresh">
                &nbsp;&nbsp;&nbsp;<span class="glyphicon glyphicon-refresh"></span>&nbsp;&nbsp;&nbsp;</button>
            <!-- Single button -->
            <div class="btn-group">
                <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                    More <span class="caret"></span>
                </button>
                <ul class="dropdown-menu" role="menu">
                    <li><a href="#">Mark all as read</a></li>
                    <li class="divider"></li>
                    <li class="text-center"><small class="text-muted">Select messages to see more actions</small></li>
                </ul>
            </div>
            <div class="pull-right">
                <span class="text-muted"><b>1</b>â€“<b>50</b> of <b>160</b></span>
                <div class="btn-group btn-group-sm">
                    <button type="button" class="btn btn-default">
                        <span class="glyphicon glyphicon-chevron-left"></span>
                    </button>
                    <button type="button" class="btn btn-default">
                        <span class="glyphicon glyphicon-chevron-right"></span>
                    </button>
                </div>
            </div>
        </div>
    </div>
    <hr>
    <div class="row">
        <div class="col-sm-3 col-md-2">
            <a href="#" class="btn btn-danger btn-sm btn-block" role="button"><i class="glyphicon glyphicon-edit"></i> Compose</a>
            <hr>
            <ul class="nav nav-pills nav-stacked">
                <li class="active"><a href="#"><span class="badge pull-right">32</span> Inbox </a>
                </li>
                <li><a href="#">Starred</a></li>
                <li><a href="#">Important</a></li>
                <li><a href="#">Sent Mail</a></li>
                <li><a href="#"><span class="badge pull-right">3</span>Drafts</a></li>
            </ul>
        </div>
        <div class="col-sm-9 col-md-10">
            <!-- Nav tabs -->
            <ul class="nav nav-tabs">
                <li class="active"><a href="#home" data-toggle="tab"><span class="glyphicon glyphicon-inbox">
                </span>Primary</a></li>
                <li><a href="#profile" data-toggle="tab"><span class="glyphicon glyphicon-user"></span>
                    Social</a></li>
                <li><a href="#messages" data-toggle="tab"><span class="glyphicon glyphicon-tags"></span>
                    Promotions</a></li>
                <li><a href="#settings" data-toggle="tab"><span class="glyphicon glyphicon-plus no-margin">
                </span></a></li>
            </ul>
            <!-- Tab panes -->
            <div class="tab-content">
                <div class="tab-pane fade in active" id="home">
                    <div class="list-group">
                        <a href="#" class="list-group-item">
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox">
                                </label>
                            </div>
                            <span class="glyphicon glyphicon-star-empty"></span><span class="name" style="min-width: 120px;
                                display: inline-block;">Mark Otto</span> <span class="">Nice work on the lastest version</span>
                            <span class="text-muted" style="font-size: 11px;">- More content here</span> <span class="badge">12:10 AM</span> <span class="pull-right"><span class="glyphicon glyphicon-paperclip">
                                </span></span></a><a href="#" class="list-group-item">
                                    <div class="checkbox">
                                        <label>
                                            <input type="checkbox">
                                        </label>
                                    </div>
                                    <span class="glyphicon glyphicon-star-empty"></span><span class="name" style="min-width: 120px;
                                        display: inline-block;">Jason Markus</span> <span class="">This is big title</span>
                                    <span class="text-muted" style="font-size: 11px;">- I saw that you had..</span> <span class="badge">12:09 AM</span> <span class="pull-right"><span class="glyphicon glyphicon-paperclip">
                                        </span></span></a><a href="#" class="list-group-item read">
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox">
                                                </label>
                                            </div>
                                            <span class="glyphicon glyphicon-star"></span><span class="name" style="min-width: 120px;
                                                display: inline-block;">Jane Patel</span> <span class="">This is big title</span>
                                            <span class="text-muted" style="font-size: 11px;">- Hi hello how r u ?</span> <span class="badge">11:30 PM</span> <span class="pull-right"><span class="glyphicon glyphicon-paperclip">
                                                </span></span></a>
                    </div>
                </div>
                <div class="tab-pane fade in" id="profile">
                    <div class="list-group">
                        <div class="list-group-item">
                            <span class="text-center">This tab is empty.</span>
                        </div>
                    </div>
                </div>
                <div class="tab-pane fade in" id="messages">
                    ...</div>
                <div class="tab-pane fade in" id="settings">
                    This tab is empty.</div>
            </div>
            
            <div class="row-md-12">
                
                <div class="well"> 
                  <a href="http://www.bootply.com/XXmcPas41w">Edit on Bootply</a>
                </div>

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

    <script src="Bootstrap/js/jquery.js"></script>
	<script src="Bootstrap/js/price-range.js"></script>
	<script src="Bootstrap/js/jquery.scrollUp.min.js"></script>
	<script src="Bootstrap/js/bootstrap.min.js"></script>
    <script src="Bootstrap/js/jquery.prettyPhoto.js"></script>
    <script src="Bootstrap/js/main.js"></script>
</body>
</html>